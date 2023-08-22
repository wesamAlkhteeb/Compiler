package generate_code.generate_model;

import generate_code.generate_controller.GenerateController;
import generate_code.generate_view.GenerateForm;
import generate_code.generate_view.GenerateHeaderText;
import generate_code.generate_view.GenerateHyperLink;
import generate_code.generate_view.GenerateUI;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ScreenModel {
    private String nameScreen;
    private ArrayList<GenerateUI> body = new ArrayList<>();


    private Map<String, ArrayList<String>> staticLanguage = new HashMap<>();

    public ScreenModel(String nameScreen) {
        this.nameScreen = nameScreen;
    }

    public GenerateUI getLastUIList() {
        if (body.isEmpty()) {
            return null;
        }
        return body.get(body.size() - 1);
    }

    @Override
    public String toString() {
        return "ScreenModel{" + "nameScreen='" + nameScreen + '\'' + ", body=" + body + "}\n\n\n\n\n";
    }


    private void testMoveScreen(GenerateUI generateUI) throws Exception {
        if (generateUI instanceof GenerateHyperLink) {
            GenerateModel.getInstance().testMoveScreen(((GenerateHyperLink) generateUI).getNextPage(), nameScreen);
        }
        if (generateUI instanceof GenerateForm && !((GenerateForm) generateUI).getMove().isEmpty()) {
            GenerateModel.getInstance().testMoveScreen(((GenerateForm) generateUI).getMove(), nameScreen);
        }
    }

    public String generateCode() throws Exception {
        String finalCode = "";
        finalCode = "<html>\n";
        if (!getGenerateController().getHeader().isEmpty()) {
            finalCode += "<header>\n";
            finalCode += "<?php\n";
            finalCode += getGenerateController().getHeader() + "\n";
            finalCode += "?>\n";
            finalCode += "</header>\n";
        }
        if (body.size() >= 0) {
            finalCode = finalCode + "<body>\n";
            for (int i = 0; i < body.size(); i++) {
                testMoveScreen(body.get(i));
                finalCode += body.get(i).generateCode();
            }
            if (!getGenerateController().getBody().isEmpty()) {
                finalCode += "<?php\n\n";
                finalCode += getGenerateController().getBody() + "\n";
                finalCode += "?>\n";
            }
            finalCode = finalCode + "</body>\n";
        }
        finalCode = finalCode + "</html>\n";
        return finalCode;
    }

    public String getNameScreen() {
        return nameScreen;
    }

    public ArrayList<GenerateUI> getBody() {
        return body;
    }

    public Map<String, ArrayList<String>> getStaticLanguage() {
        return staticLanguage;
    }

    public void setStaticLanguage(Map<String, ArrayList<String>> staticLanguage) {
        this.staticLanguage = staticLanguage;
    }


    //________________________ controller ----------------
    GenerateController generateController = new GenerateController();

    public GenerateController getGenerateController() {
        return generateController;
    }

    // id screen

    private final ArrayList<String> idsInput = new ArrayList<>();

    public void addIDToList(String id) {
        idsInput.add(id.trim());
    }

    public boolean isContainId(String id) {
        String first = id.split("-")[0].trim(), second = id.split("-")[1].trim();
        for (int i = 0; i < idsInput.size(); i++) {
            String firstTest = idsInput.get(i).split("-")[0].trim(),
                    secondTest = idsInput.get(i).split("-")[1].trim();
            if (firstTest.equals(first) && secondTest.equals(second)) {
                return true;
            }
        }
        return false;
    }


    // test  moveScreen header (nameScreen .php)
    private ArrayList<String> testMoveScreen = new ArrayList<>();

    public void addTestScreen(String name) {
        testMoveScreen.add(name.trim());
    }

    public boolean isContainScreen(String name) {
        return testMoveScreen.contains(name.trim());
    }

    public ArrayList<String> getTestMoveScreen() {
        return testMoveScreen;
    }
}

