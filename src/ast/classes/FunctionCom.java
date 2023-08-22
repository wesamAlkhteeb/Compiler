package ast.classes;

import generate_code.generate_model.GenerateModel;

import java.util.ArrayList;

public class FunctionCom {

    ArrayList<Cntr> cntrs = new ArrayList<>();

    @Override
    public String toString() {
        return cntrs.toString();
    }

    public void addCntr(Cntr cntr) {
        this.cntrs.add(cntr);
    }

    public void generateCondeController() throws Exception {
        for (int i = 0; i < cntrs.size(); i++) {
            if (cntrs.get(i).getDefineObj() != null &&
                    cntrs.get(i).getDefineObj().getEqualObj() != null &&
                    cntrs.get(i).getDefineObj().getEqualObj().isReadFileFile() &&
                    !GenerateModel.getInstance().isReadFile()
            ) {
                GenerateModel.getInstance().addDataToController("$myfile = fopen(\"" + cntrs.get(i).getDefineObj().getEqualObj().getObjectBody().getAttributeList().get(0).getTypes().get(0) + "\", \"r\");\n");
                GenerateModel.getInstance().setReadFile(true);
            }
            cntrs.get(i).generateCondeController();
        }
        if (GenerateModel.getInstance().isReadFile()) {
            GenerateModel.getInstance().addDataToController("fclose($myfile);\n\n");
            GenerateModel.getInstance().setReadFile(false);
        }
    }
}
