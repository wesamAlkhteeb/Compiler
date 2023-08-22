package ast.classes;

import generate_code.sample_table.CheckSyntax;

import java.util.ArrayList;

public class ObjectScreens {
    String variable;
    ArrayList<CustomObject> customObject = new ArrayList<>();

    @Override
    public String toString() {
        return variable + "" + customObject +'\n';
    }

    public String getVariable() {
        return variable;
    }

    public void setVariable(String variable) {
        this.variable = variable;
    }

    public void addCustomObjectToList(CustomObject customObject) {
        this.customObject.add(customObject);
    }

    public void checkCode(int index){
//        System.out.println(customObject);
        try {
            if (!CheckSyntax.getInstance().addDataToCheck(variable, index)) {
                throw new Exception("Syntax Error : check your code about keyword (( " + variable + " )).");
            }
            for (int i = 0; i < customObject.size(); i++) {
                customObject.get(i).checkCode(index+1);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
