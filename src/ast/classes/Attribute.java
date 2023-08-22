package ast.classes;

import generate_code.generate_model.GenerateModel;
import generate_code.sample_table.CheckSyntax;

import java.util.*;

public class Attribute {
    ArrayList<String> nameVariables = new ArrayList<>();
    ArrayList<Type> types = new ArrayList<>();

    public ArrayList<String> getNameVariables() {
        return nameVariables;
    }

    public void setNameVariables(ArrayList<String> nameVariables) {
        this.nameVariables = nameVariables;
    }

    public ArrayList<Type> getTypes() {
        return types;
    }

    public void setTypes(ArrayList<Type> types) {
        this.types = types;
    }

    public void addType(Type type) {
        this.types.add(type);
    }

    public void addNameVariable(String variable) {
        this.nameVariables.add(variable);
    }

    @Override
    public String toString() {
        return nameVariables + " " + '\'' + types;
    }

    public boolean checkCode(int index) throws Exception {
        for (int i = 0; i < types.size(); i++) {
            if (!CheckSyntax.getInstance().addDataToCheck(nameVariables.get(i), index)) {
                throw new Exception("Syntax Error : " + nameVariables.get(i));
            }
            types.get(i).checkCode(index + 1);
        }
        return true;
    }

    public Map<String, ArrayList<String>> generateCode() {
        Map<String, ArrayList<String>> data = new HashMap<>();
        for (int i = 0; i < nameVariables.size(); i++) {
            if (!GenerateModel.getInstance().notSkipState(nameVariables.get(i))) {
                data.put(nameVariables.get(i), types.get(i).generateCode());
            }
        }

        if(nameVariables.contains("id") && GenerateModel.getInstance().getScreenStateProcess().equals("Body")){
            GenerateModel.getInstance().getLastScreenList().addIDToList("form-"+types.get(0).getDataString());
        }
        return data;
    }


    public void generateCodeController() throws Exception {
        for(int i=0 ; i<types.size() ; i++){
            if(Objects.equals(nameVariables.get(i),"body")||Objects.equals(nameVariables.get(i),"header")){
                GenerateModel.getInstance().setScreenStateProcessController(nameVariables.get(i));
            }
            types.get(i).generateCodeController();
        }
    }


}
