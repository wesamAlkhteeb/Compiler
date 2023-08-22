package ast.classes;

import generate_code.sample_table.CheckSyntax;

public class StartCompiler {
    String nameVariable;
    ObjectScreens objectScreen;

    public String getNameVariable() {
        return nameVariable;
    }

    public void setNameVariable(String nameVariable) {
        this.nameVariable = nameVariable;
    }

    public ObjectScreens getObjectScreen() {
        return objectScreen;
    }

    public void setObjectScreen(ObjectScreens objectScreen) {
        this.objectScreen = objectScreen;
    }

    public void checkCode(int index) {

        try {
            if (!CheckSyntax.getInstance().addDataToCheck(nameVariable, index)) {
                throw new Exception("Syntax Error : check your code about keyword (( " + nameVariable + " )).");
            }
            objectScreen.checkCode(index+1);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public String toString() {
        checkCode(0);
        String a = nameVariable + " " + objectScreen;
        return "";
    }
}
