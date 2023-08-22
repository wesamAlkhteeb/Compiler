package ast.classes;

import generate_code.generate_model.GenerateModel;

public class Compare {
    StaticCom staticCom1 , staticCom2;
    CustomObject customObject;

    @Override
    public String toString() {
        return  staticCom1 + " "+ staticCom2 + " " + customObject +"\n";
    }

    public StaticCom getStaticCom1() {
        return staticCom1;
    }

    public void setStaticCom1(StaticCom staticCom1) {
        this.staticCom1 = staticCom1;
    }

    public StaticCom getStaticCom2() {
        return staticCom2;
    }

    public void setStaticCom2(StaticCom staticCom2) {
        this.staticCom2 = staticCom2;
    }

    public CustomObject getCustomObject() {
        return customObject;
    }

    public void setCustomObject(CustomObject customObject) {
        this.customObject = customObject;
    }

    public void generateCondeController() throws Exception {
        if(staticCom1!=null && staticCom2!=null){
            if(!staticCom1.firstNameVariable.equals("header") && !staticCom1.firstNameVariable.equals("form")){
                throw new Exception("the variable is static you must change \""+staticCom1.firstNameVariable + "\" to header or form");
            }
            if(!staticCom2.firstNameVariable.equals("header") && !staticCom2.firstNameVariable.equals("form")){
                throw new Exception("the variable is static you must change \""+staticCom2.firstNameVariable + "\" to header or form");
            }
            if(!GenerateModel.getInstance().getLastScreenList().isContainId(staticCom1.getIDs())){
                throw new Exception(staticCom1.secondNameVariable + " is not define in " +(staticCom1.getIDs().contains("form")?"form":"header"));
            }
            else if(!GenerateModel.getInstance().getLastScreenList().isContainId(staticCom2.getIDs())){
                throw new Exception(staticCom2.secondNameVariable + " is not define in "+(staticCom1.getIDs().contains("form")?"form":"header"));
            }
            String first = staticCom1.generateCodeController();
            String second =staticCom2.generateCodeController();
            String res = "empty("+first+") == false && "+"empty("+ second+") == false  &&" + (first.contains("[")?"(":"") + first.trim() + (first.contains("[")?".=\"\\n\"":"") +  (first.contains("[")?")":"")+" == " +
                    (second.contains("[")?"(":"") + second.trim() + (second.contains("[")?".=\"\\n\"":"") + (second.contains("[")?")":"");
            System.out.println(res);
            GenerateModel.getInstance().addDataToController(res);
        }
        if(customObject != null){
            customObject.generateCodeController();
        }
    }
}
