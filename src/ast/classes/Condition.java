package ast.classes;

import generate_code.generate_model.GenerateModel;

import java.util.ArrayList;

public class Condition {
    ArrayList<Compare> compareList = new ArrayList<Compare>();

    ArrayList<CustomObject> objectBodies = new ArrayList<CustomObject>();

    public void addCompairToList(Compare compair) {
        this.compareList.add(compair);
    }

    public void addCustomObjectToList(CustomObject objectBody) {
        this.objectBodies.add(objectBody);
    }

    @Override
    public String toString() {
        return
                compareList + "" + objectBodies;
    }

    public void generateCondeController() throws Exception {
        GenerateModel.getInstance().addDataToController("if(");
        for (int i = 0; i < compareList.size(); i++) {
            compareList.get(i).generateCondeController();
            if (i < compareList.size() - 1) {
                GenerateModel.getInstance().addDataToController(" and ");
            }
        }
        GenerateModel.getInstance().addDataToController("){\n");
        for (int i = 0; i < objectBodies.size(); i++) {
            if (
                    objectBodies.get(i) != null &&
                    objectBodies.get(i).getNameVariable().equals("writeToFile")

            ) {
                GenerateModel.getInstance().addDataToController("$myfile = fopen(\"" + objectBodies.get(i).getAttributeList().get(0).getTypes().get(0) + "\", \"w\");\n");
                objectBodies.get(i).generateCodeController();
                GenerateModel.getInstance().addDataToController("fclose($myfile);\n");
                continue;
            }
            objectBodies.get(i).generateCodeController();
        }
        GenerateModel.getInstance().addDataToController("}\n");
    }
}
