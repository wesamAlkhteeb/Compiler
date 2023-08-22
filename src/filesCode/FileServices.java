package filesCode;

import generate_code.generate_model.GenerateModel;

import java.io.File;
import java.io.PrintWriter;
import java.util.Objects;

public class FileServices {
    String path = "C:\\xampp\\htdocs\\compiler";
    String pathLocal = "src/filesCode/code/";

    public void SaveResult() throws Exception {

        File files = new File(pathLocal);
        for (File file : Objects.requireNonNull(files.listFiles())) {
            if(file.getName().contains(".php")){
                file.delete();
            }
        }

        PrintWriter out;
        GenerateModel.getInstance().errorHandling();
        for (int i = 0; i < GenerateModel.getInstance().getScreenModels().size(); i++) {
            try {
                out = new PrintWriter(pathLocal + GenerateModel.getInstance().getScreenModels().get(i).getNameScreen() + ".php");
                out.write(GenerateModel.getInstance().getScreenModels().get(i).generateCode());
                out.flush();
                out.close();
            } catch (Exception e) {
                throw new Exception(e);
            }
        }
    }

}
