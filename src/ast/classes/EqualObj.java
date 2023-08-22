package ast.classes;

import generate_code.generate_model.GenerateModel;

import java.util.Objects;

public class EqualObj {
    String nameVariable;
    CustomObject objectBody;

    @Override
    public String toString() {
        return "EqualObj{" +
                "nameVariable='" + nameVariable + '\'' +
                ", objectBody=" + objectBody +
                '}';
    }

    public String getNameVariable() {
        return nameVariable;
    }

    public void setNameVariable(String nameVariable) {
        this.nameVariable = nameVariable;
    }

    public CustomObject getObjectBody() {
        return objectBody;
    }

    public void setObjectBody(CustomObject objectBody) {
        this.objectBody = objectBody;
    }


    public boolean isReadFileFile() {
        if (objectBody != null) {
            return Objects.equals(objectBody.getNameVariable(), "readFromFile");
        }
        return false;
    }
    public void generateCodeController() throws Exception {
        if( !objectBody.nameVariable.contains("readFromFile") ){
            throw new Exception(objectBody.nameVariable + " can't return data ");
        }
        if (nameVariable != null) {
            GenerateModel.getInstance().addDataToController("$" + nameVariable + " = ");
            GenerateModel.getInstance().getLastScreenList().addIDToList("header-"+nameVariable);
        }
        if (objectBody != null) {
            objectBody.generateCodeController();
        }
    }
}
