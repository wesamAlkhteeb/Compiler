package ast.classes;

import generate_code.generate_model.GenerateModel;

import java.util.Objects;

public class StaticCom {
    String firstNameVariable;
    String secondNameVariable;

    @Override
    public String toString() {
        if ((Objects.equals(firstNameVariable, "form") || Objects.equals(firstNameVariable, "header"))
                && Objects.equals(GenerateModel.getInstance().getScreenStateProcess(), "Controller")) {
        } else {
            GenerateModel.getInstance().addVariableStatic(firstNameVariable, secondNameVariable);
        }
        return "$" + secondNameVariable;
    }

    public String getFirstNameVariable() {
        return firstNameVariable;
    }

    public void setFirstNameVariable(String firstNameVariable) {
        this.firstNameVariable = firstNameVariable;
    }

    public String getSecondNameVariable() {
        return secondNameVariable;
    }

    public void setSecondNameVariable(String secondNameVariable) {
        this.secondNameVariable = secondNameVariable;
    }

    public String generateCodeController() throws Exception {
        if (Objects.equals(firstNameVariable, "form") ) {
            return " $_GET[\"" + secondNameVariable.trim() + "\"]" ;
        } else {
            return "$" + secondNameVariable ;
        }
    }

    public String getIDs() {
        return firstNameVariable.trim() + "-" + secondNameVariable.trim();
    }

}
