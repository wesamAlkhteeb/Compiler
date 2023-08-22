package ast.classes;

/*

                   👍✔😂❤😢😄😄😄
                   👍✔😂❤😢😄😄😄
                   👍✔😂❤😢😄😄😄
                   👍✔😂❤😢😄😄😄
                   👍✔😂❤😢😄😄😄
                   👍✔😂❤😢😄😄😄

               Note  : this class for two grammar (simpleobject & objectsScreen)

                   👍✔😂❤😢😄😄😄
                   👍✔😂❤😢😄😄😄
                   👍✔😂❤😢😄😄😄
                   👍✔😂❤😢😄😄😄v
                   👍✔😂❤😢😄😄😄
 */

import generate_code.generate_model.GenerateModel;
import generate_code.sample_table.CheckSyntax;

import java.util.ArrayList;
import java.util.Objects;

public class CustomObject {
    String nameVariable;
    ArrayList<Attribute> attributeList = new ArrayList<>();


    public String getNameVariable() {
        return nameVariable;
    }

    public ArrayList<Attribute> getAttributeList() {
        return attributeList;
    }

    public void setNameVariable(String nameVariable) {
        this.nameVariable = nameVariable;
    }

    public void addAttribute(Attribute attribute) {
        this.attributeList.add(attribute);
    }


    public boolean checkCode(int index) throws Exception {
        if (index == 0) {
            for (int i = 0; i < attributeList.size(); i++) {
                CheckSyntax.getInstance().addDataToCheck(nameVariable, index);
                attributeList.get(i).checkCode(index + 1);
            }
        } else {
            if (!CheckSyntax.getInstance().addDataToCheck(nameVariable, index)) {
                throw new Exception("Syntax Error : Error in the word " + nameVariable);
            }
        }
        return true;
    }


    public void errorHandlingBody() throws Exception {
        if (nameVariable.equals("Text") && testNumberOfParameter(1)) {
            throw new Exception("Text must have one parameter  ( title ).");
        } else if (nameVariable.equals("TextOut") && testNumberOfParameter(1)) {
            throw new Exception("TextOut must have one parameter ( title ).");
        } else if (nameVariable.equals("HeaderText") && testNumberOfParameter(2)
        ) {
            throw new Exception("HeaderText must have two parameters (typeFont , title ).");
        } else if (nameVariable.equals("HyperLink") && testNumberOfParameter(2)
        ) {
            throw new Exception("HyperLink must have two parameters ( title , page ).");
        } else if (nameVariable.equals("Form") && testNumberOfParameter(2)
        ) {
            throw new Exception("Form must have two parameters ( action , view ).");
        } else if (nameVariable.equals("Image") && testNumberOfParameter(3)
        ) {
            throw new Exception("Image must have three parameters ( width , height , source ).");
        } else if (nameVariable.equals("InputText") && testNumberOfParameter(1)
        ) {
            throw new Exception("InputText must have one parameter ( id ).");
        } else if (nameVariable.equals("InputPassword") && testNumberOfParameter(1)
        ) {
            throw new Exception("InputPassword must have one parameter ( id ).");
        } else if (nameVariable.equals("Submit") && testNumberOfParameter(1)
        ) {
            throw new Exception("Submit must have one parameter ( title ).");
        }


        if (nameVariable.equals("Text") && attributeList.get(0).types.get(0).stringCom == null) {
            throw new Exception("Text must have attribute String.");
        } else if (nameVariable.equals("TextOut") && attributeList.get(0).types.get(0).staticCom == null) {

            throw new Exception("TextOut must have attribute static.");
        } else if (nameVariable.equals("HeaderText") &&
                attributeList.get(0).types.get(0).numberCom == null &&
                attributeList.get(0).types.get(1).stringCom == null
        ) {
            throw new Exception("HeaderText must have attribute static.");
        } else if (nameVariable.equals("HyperLink")
                &&
                attributeList.get(0).types.get(0).stringCom == null &&
                attributeList.get(0).types.get(1).simpleObject == null
        ) {
            throw new Exception("HyperLink must have attribute number then static.");
        } else if (nameVariable.equals("Form")
                &&
                attributeList.get(0).types.get(0).stringCom == null &&
                attributeList.get(0).types.get(1).listCom == null
        ) {
            throw new Exception("Form must have attribute String then List.");
        } else if (nameVariable.equals("Image")
                &&
                attributeList.get(0).types.get(0).stringCom == null &&
                attributeList.get(0).types.get(1).numberCom == null &&
                attributeList.get(0).types.get(2).numberCom == null
        ) {
            throw new Exception("Image must have attribute String then Number then Number.");
        } else if (nameVariable.equals("InputText")
                &&
                attributeList.get(0).types.get(0).stringCom == null
        ) {
            throw new Exception("InputText must have attribute String.");
        } else if (nameVariable.equals("InputPassword")
                &&
                attributeList.get(0).types.get(0).stringCom == null
        ) {
            throw new Exception("InputPassword must have attribute String.");
        } else if (nameVariable.equals("Submit")
                &&
                attributeList.get(0).types.get(0).stringCom == null
        ) {
            throw new Exception("Submit must have attribute String.");
        }
    }

    @Override
    public String toString() {
        try {
            errorHandlingBody();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        GenerateModel.getInstance().plusIndexObject();
        try {
            checkCode(0);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        if (GenerateModel.getInstance().getIndexObject() == 1) {
            try {
                GenerateModel.getInstance().addScreen(nameVariable.trim());
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        } else if (GenerateModel.getInstance().getIndexObject() == 2) {
            GenerateModel.getInstance().setScreenStateProcess(nameVariable);
            if (nameVariable.equals("Controller") && attributeList.get(0).types.get(0).functionCom == null) {
                try {
                    throw new Exception("data Controller must be function");
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            }
        }
        if (Objects.equals(GenerateModel.getInstance().getScreenStateProcess(), "Controller")) {
            for (int i = 0; i < attributeList.size(); i++) {
                try {
                    attributeList.get(i).generateCodeController();
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            }
        } else {
            if (GenerateModel.getInstance().getIndexObject() == 3 && Objects.equals(GenerateModel.getInstance().getScreenStateProcess(), "Body")) {
                GenerateModel.getInstance().addObjectOne(nameVariable);
                for (int i = 0; i < attributeList.size(); i++) {
                    GenerateModel.getInstance().addDataOne(attributeList.get(i).generateCode());
                }
            } else if (GenerateModel.getInstance().getIndexObject() == 4) {
                GenerateModel.getInstance().addObjectTwo(nameVariable);
                for (int i = 0; i < attributeList.size(); i++) {
                    GenerateModel.getInstance().addDataTwo(attributeList.get(i).generateCode());
                }
            }
        }

        String a = nameVariable + '\'' + attributeList;
        GenerateModel.getInstance().minusIndexObject();
        return nameVariable;
    }


    public void errorHandlingController() throws Exception {

//
//
//        try {
//            throw new Exception("this function " + nameVariable + " can't define in " + GenerateModel.getInstance().getScreenStateProcess());
//        } catch (Exception e) {
//            throw new RuntimeException(e);
//        }
//
        if (nameVariable.equals("moveScreen") && testNumberOfParameter(1)) {
            throw new Exception("moveScreen must have one parameter (page)");
        } else if (nameVariable.equals("readFromFile") && testNumberOfParameter(1)) {
            throw new Exception("readFromFile must have one parameter (path)");
        } else if (nameVariable.equals("writeToFile") && testNumberOfParameter(2)) {
            throw new Exception("writeToFile must have two parameter (path , data)");
        } else if (nameVariable.equals("isNotEmpty") && testNumberOfParameter(1)) {
            throw new Exception("isNotEmpty must have one parameter (title )");
        }
        if (nameVariable.equals("moveScreen")
                &&
                attributeList.get(0).getTypes().get(0).simpleObject == null
        ) {
            throw new Exception("moveScreen must have attribute string.");
        } else if (nameVariable.equals("readFromFile")
                &&
                attributeList.get(0).getTypes().get(0).stringCom == null
        ) {
            throw new Exception("readFromFile must have attribute string.");
        } else if (nameVariable.equals("writeToFile")
                &&
                attributeList.get(0).getTypes().get(0).stringCom == null
                &&
                attributeList.get(0).getTypes().get(1).listCom == null
        ) {
            throw new Exception("writeToFile must have attribute string then list.");
        } else if (nameVariable.equals("isNotEmpty")
                &&
                attributeList.get(0).getTypes().get(0).staticCom == null
        ) {
            throw new Exception("isNotEmpty must have attribute string.");
        }


        if (nameVariable.equals("moveScreen")) {
            if (attributeList.get(0).getTypes().get(0).getSimpleObject().getNameVariable().trim().equals(
                    GenerateModel.getInstance().getLastScreenList().getNameScreen().trim()
            )) {
                throw new Exception("\"move\" parameter data " + attributeList.get(0).getTypes().get(0).getSimpleObject().getNameVariable().trim() + " move to same screen ");
            }
           /* GenerateModel.getInstance().getScreenRequire().add(
                    attributeList.get(0).getTypes().get(0).getSimpleObject().getNameVariable()
            );*/
        }

    }


    private boolean testNumberOfParameter(int number) {
        return !attributeList.isEmpty() && attributeList.get(0).types.size() != number;
    }

    public void generateCodeController() throws Exception {
        if (!nameVariable.equals("MoveScreen") && !nameVariable.equals("readFromFile") && !nameVariable.equals("writeToFile")) {
            throw new Exception("can't use " + nameVariable + " in controller");
        }

        errorHandlingController();
        if (nameVariable.equals("MoveScreen")) {
            GenerateModel.getInstance().getLastScreenList().addTestScreen(attributeList.get(0).types.get(0).getNameObject());
            GenerateModel.getInstance().addDataToController("header(\"Location:" + attributeList.get(0).types.get(0).getNameObject() + ".php\");\n");
        } else if (nameVariable.equals("readFromFile")) {
            if (
                    !CheckSyntax.getInstance().addDataToCheck(nameVariable, 0) ||
                            !CheckSyntax.getInstance().addDataToCheck(attributeList.get(0).nameVariables.get(0), 1)) {
                throw new Exception("Exception in readFromFile");
            }
            GenerateModel.getInstance().addDataToController(" fgets($myfile);\n");
        } else if (nameVariable.equals("writeToFile")) {
            if (!CheckSyntax.getInstance().addDataToCheck(nameVariable, 0) ||
                    !CheckSyntax.getInstance().addDataToCheck(attributeList.get(0).nameVariables.get(0), 1)
                    || !CheckSyntax.getInstance().addDataToCheck(attributeList.get(0).nameVariables.get(1), 1)
            ) {
                throw new Exception("Exception in writeToFile");
            }

            int index = 0;
            for (; index < getAttributeList().get(0).nameVariables.size(); index++) {
                if (getAttributeList().get(0).nameVariables.get(index).trim().equals("data")) {
                    break;
                }
            }
            ArrayList<String> data = getAttributeList().get(0).getTypes().get(index).getDataWriteFile(index);
            for (int i = 0; i < data.size(); i++) {
                String s[] = data.get(i).split("[.]".toString());
                if (!s[0].trim().equals("form")) {
                    throw new Exception("data in write must be static inside \"\" and first data must be \"form\"");
                }
                GenerateModel.getInstance().addDataToController("fwrite($myfile,$_GET[\"" + s[1] + "\"]);\n");
                GenerateModel.getInstance().addDataToController("fwrite($myfile,\"\\n\");\n");
            }
        } else if (nameVariable.equals("isNotEmpty")) {
            String variable = attributeList.get(0).getTypes().get(0).getIsEmpty().trim();
            if (variable.split("-")[0].equals("form")) {
                GenerateModel.getInstance().addDataToController("$_Get[\"" + variable.split("-")[1] + "\"]" + "!=\"\"");
            }
            if (attributeList.get(0).getTypes().get(0).getIsEmpty().trim().split("-")[0].equals("header")) {
                GenerateModel.getInstance().addDataToController("$" + variable.split("-")[1] + "!=\"\"");
            }
        }
    }


    private boolean isEqualStateProcess(String state) {
        return Objects.equals(state, GenerateModel.getInstance().getScreenStateProcess());
    }

}
