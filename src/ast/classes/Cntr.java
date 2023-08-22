package ast.classes;

import generate_code.generate_model.GenerateModel;

public class Cntr {
    Condition condition;
    DefineObj defineObj;

    @Override
    public String toString() {
        return
                (condition!=null?condition:"" ).toString() +
                (defineObj!=null?defineObj :"");
    }

    public Condition getCondition() {
        return condition;
    }

    public void setCondition(Condition condition) {
        this.condition = condition;
    }

    public DefineObj getDefineObj() {
        return defineObj;
    }

    public void setDefineObj(DefineObj defineObj) {
        this.defineObj = defineObj;
    }



    public void generateCondeController() throws Exception {
        if(condition!=null){
            condition.generateCondeController();
        }
        if(defineObj !=null){
            defineObj.generateCodeController();
        }
    }

}
