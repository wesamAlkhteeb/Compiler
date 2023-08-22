package generate_code.generate_view;

import generate_code.generate_model.GenerateModel;

import java.util.ArrayList;
import java.util.Map;

public class GenerateForm implements GenerateUI {

    private String move;

    private ArrayList<GenerateUI> generateUIS = new ArrayList<>();

    public void addView(GenerateUI generateUI) {
        generateUIS.add(generateUI);
    }

    @Override
    public String toString() {
        return "" + generateUIS.size();
    }

    public GenerateForm() {
    }

    public String getMove() {
        return move;
    }

    public void setMove(String move) {
        this.move = move;
    }

    public ArrayList<GenerateUI> getGenerateUIS() {
        return generateUIS;
    }

    @Override
    public String generateCode() throws Exception {
        if(!move.isEmpty()){
            int i = 0;
            for (; i < GenerateModel.getInstance().getScreenModels().size(); i++) {
                if (GenerateModel.getInstance().getScreenModels().get(i).getNameScreen().trim().equals(move.trim())) {
                    break;
                }
            }
            if(i>=GenerateModel.getInstance().getScreenModels().size()){
                throw new Exception("not found screen \"" + move + "\" please edit data action in form");
            }
        }

        String finalCode = "<form action= \"" + move + (move.isEmpty()?"":".php") +"\"   method=\"get\">\n";
        for (int i = 0; i < generateUIS.size(); i++) {
            finalCode = finalCode + generateUIS.get(i).generateCode();
        }
        finalCode = finalCode + "</form>\n";
        return finalCode;
    }


    public void addDataTwo(Map<String, ArrayList<String>> data) {
        if (generateUIS.get(generateUIS.size() - 1) instanceof GenerateImageForm) {
            ((GenerateImageForm) generateUIS.get(generateUIS.size() - 1)).setSource(data.get("source").get(0));
            ((GenerateImageForm) generateUIS.get(generateUIS.size() - 1)).setHeight(data.get("height").get(0));
            ((GenerateImageForm) generateUIS.get(generateUIS.size() - 1)).setWidth(data.get("width").get(0));
        } else if (generateUIS.get(generateUIS.size() - 1) instanceof GenerateText) {
            ((GenerateText) generateUIS.get(generateUIS.size() - 1)).setTitle(data.get("title").get(0));
        } else if (generateUIS.get(generateUIS.size() - 1) instanceof GenerateInputText) {
            ((GenerateInputText) generateUIS.get(generateUIS.size() - 1)).setId(data.get("id").get(0));
        } else if (generateUIS.get(generateUIS.size() - 1) instanceof GenerateButton) {
            ((GenerateButton) generateUIS.get(generateUIS.size() - 1)).setTitle(data.get("title").get(0));
        } else if (generateUIS.get(generateUIS.size() - 1) instanceof GenerateInputPassword) {
            ((GenerateInputPassword) generateUIS.get(generateUIS.size() - 1)).setId(data.get("id").get(0));
        }
    }

}
