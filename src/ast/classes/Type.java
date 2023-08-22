package ast.classes;

import generate_code.sample_table.CheckSyntax;

import java.util.ArrayList;

public class Type {
    CustomObject simpleObject;
    FunctionCom functionCom;
    StringCom stringCom;
    NumberCom numberCom;
    ListCom listCom;
    StaticCom staticCom;


    public ArrayList<String> getDataWriteFile(int index){
        ArrayList<String> data = new ArrayList<>();
        for (int i = 0; i < listCom.stringLists.size() ; i++) {
            data.add(listCom.stringLists.get(i).data);
        }
        return data;
    }

    public String getIsEmpty(){
        return staticCom.firstNameVariable+'-'+staticCom.secondNameVariable;
    }

    public boolean checkCode(int index) throws Exception {
        if (simpleObject != null) {
            simpleObject.checkCode(index);
        } else if(functionCom != null) {
            if(!CheckSyntax.getInstance().addDataToCheck(CheckSyntax.ANY,index)){
                throw new Exception("Syntax Error function");
            }
        } else if (stringCom !=null){
            if(!CheckSyntax.getInstance().addDataToCheck(CheckSyntax.ANY,index)){
                throw new Exception("Syntax Error string_3");
            }
            // add ANY .
        } else if (numberCom !=null) {
            if(!CheckSyntax.getInstance().addDataToCheck(CheckSyntax.ANY,index)){
                throw new Exception("Syntax Error number ");
            }
        } else if (listCom !=null){
            listCom.checkCode(index);
        } else if (staticCom !=null ) {
            if(!CheckSyntax.getInstance().addDataToCheck(CheckSyntax.ANY,index)){
                throw new Exception("Syntax Error static");
            }
        }
        return true;
    }


    public CustomObject getSimpleObject() {
        return simpleObject;
    }

    public void setSimpleObject(CustomObject simpleObject) {
        this.simpleObject = simpleObject;
    }

    public FunctionCom getFunctionCom() {
        return functionCom;
    }

    public void setFunctionCom(FunctionCom functionCom) {
        this.functionCom = functionCom;
    }

    public StringCom getStringCom() {
        return stringCom;
    }

    public void setStringCom(StringCom stringCom) {
        this.stringCom = stringCom;
    }

    public NumberCom getNumberCom() {
        return numberCom;
    }

    public void setNumberCom(NumberCom numberCom) {
        this.numberCom = numberCom;
    }

    public ListCom getListCom() {
        return listCom;
    }

    public void setListCom(ListCom listCom) {
        this.listCom = listCom;
    }

    public StaticCom getStaticCom() {
        return staticCom;
    }

    public void setStaticCom(StaticCom staticCom) {
        this.staticCom = staticCom;
    }


    ArrayList<String> generateCode(){
        ArrayList<String> data = new ArrayList<>();
        if(simpleObject != null){
            data.add(simpleObject+"");
        }else if(functionCom!=null ){
            data.add(functionCom.toString());
        }else if(staticCom!=null){
            data.add(staticCom.toString());
        }else if(numberCom!=null){
            data.add(numberCom.getNumber());
        }else if(listCom!=null){
            data.addAll(listCom.getData());
        }else {
            data.add(stringCom.data);
        }
        return data;
    }

    @Override
    public String toString() {

        if(simpleObject != null){
            return simpleObject+"";
        }else if(functionCom!=null){
            return functionCom+"";
        }else if(staticCom!=null){
            return staticCom+"";
        }else if(numberCom!=null){
            return numberCom.getNumber()+"";
        }else if(listCom!=null){
            return  listCom +"";
        }else {
            return stringCom.getData()+"";
        }
    }


    public void generateCodeController() throws Exception {
        if(simpleObject != null){
        }else if(functionCom!=null){
            functionCom.generateCondeController();
        }else if(staticCom!=null){
        }else if(numberCom!=null){
        }else if(listCom!=null){
        }else {
//            return stringCom.getData()+"";
        }
    }


    public String getDataString(){
        return stringCom.data;
    }


    public String getNameObject(){
        return simpleObject.nameVariable;
    }

}
