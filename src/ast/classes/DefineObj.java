package ast.classes;

import generate_code.generate_model.GenerateModel;

import java.util.ArrayList;

public class DefineObj {
    EqualObj equalObj;

    @Override
    public String toString() {
        return "DefineObj{" +
                (equalObj != null ? "equalObj=" + equalObj : "") +
                '}';
    }

    public EqualObj getEqualObj() {
        return equalObj;
    }

    public void setEqualObj(EqualObj equalObj) {
        this.equalObj = equalObj;
    }

    public void generateCodeController() throws Exception {
        if (equalObj != null) {
            equalObj.generateCodeController();
        }
    }
}
