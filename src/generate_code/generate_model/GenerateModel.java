package generate_code.generate_model;

import generate_code.generate_view.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.Objects;

public class GenerateModel {

    private int indexObject = 0;
    private static GenerateModel generateModel;
    private String screenStateProcess;
    private String screenStateProcessController;

    public String getScreenStateProcessController() {
        return screenStateProcessController;
    }

    public void setScreenStateProcessController(String screenStateProcessController) {
        this.screenStateProcessController = screenStateProcessController;
    }

    public int getIndexObject() {
        return indexObject;
    }


    public void plusIndexObject() {
        indexObject++;
    }

    public void minusIndexObject() {
        indexObject--;
    }

    private ArrayList<ScreenModel> screenModels;

    private GenerateModel() {
        screenModels = new ArrayList<>();
    }

    public static GenerateModel getInstance() {
        if (generateModel == null) {
            generateModel = new GenerateModel();
        }
        return generateModel;
    }

    public void addScreen(String nameString) throws Exception {
        for (int i = 0; i < screenModels.size(); i++) {
            if (screenModels.get(i).getNameScreen().trim().equals(nameString.trim())) {
                throw new Exception("Duplicate screen definition : " + nameString);
            }
        }
        screenModels.add(new ScreenModel(nameString));
    }

    public void setScreenStateProcess(String screenStateProcess) {
        this.screenStateProcess = screenStateProcess;
    }

    public void addObjectOne(String nameObject) {
        screenModels.get(screenModels.size() - 1).getBody().add(getView(nameObject));
    }

    // يعني عندي فورم بضيف فيه شو في عندي view
    //أو بكون عندي تفاصيل ضمن view متل أنو نقلني ع شاشة home()
    public void addObjectTwo(String nameObject) {
        if (screenModels.isEmpty() || screenModels.get(screenModels.size() - 1).getBody().isEmpty()) {
            return;
        }
        if (screenModels.get(screenModels.size() - 1).getBody().
                get(screenModels.get(screenModels.size() - 1).getBody().size() - 1)
                instanceof GenerateForm
        ) {
            ((GenerateForm) screenModels.get(screenModels.size() - 1).getBody().
                    get(screenModels.get(screenModels.size() - 1).getBody().size() - 1)).addView(getView(nameObject));
        }
    }

    private GenerateUI getView(String nameObject) {
        switch (nameObject) {
            case "Form": {
                return new GenerateForm();
            }
            case "HeaderText": {
                return new GenerateHeaderText();
            }
            case "Text":
            case "TextOut": {
                return new GenerateText();
            }
            case "NewLine": {
                return new GenerateNewLine();
            }
            case "HyperLink": {
                return new GenerateHyperLink();
            }
            case "InputText": {
                return new GenerateInputText();
            }
            case "Image": {
                return new GenerateImageForm();
            }
            case "Submit": {
                return new GenerateButton();
            }
            case "InputPassword": {
                return new GenerateInputPassword();
            }
        }
        return null;
    }

    public String getScreenStateProcess() {
        return screenStateProcess;
    }

    public ArrayList<ScreenModel> getScreenModels() {
        return screenModels;
    }


    public boolean notSkipState(String name) {
        return Objects.equals(name, "NewLine") || Objects.equals(name, "view");
    }


    public ScreenModel getLastScreenList() {
        if (screenModels.isEmpty()) {
            return new ScreenModel("A");
        }
        return screenModels.get(screenModels.size() - 1);
    }


    public void addVariableStatic(String first, String second) {
        if (getLastScreenList().getStaticLanguage().containsKey(first)) {
            if (!getLastScreenList().getStaticLanguage().get(first).contains(second)) {
                getLastScreenList().getStaticLanguage().get(first).add(second);
            }
        } else {
            getLastScreenList().getStaticLanguage().put(first, new ArrayList<>(Collections.singletonList(second)));
        }
    }


    public void addDataOne(Map<String, ArrayList<String>> data) {
        if (getLastScreenList().getLastUIList() instanceof GenerateForm) {
            if (Objects.equals(data.get("action").get(0), "null") || data.get("action").get(0) == null) {

                ((GenerateForm) getLastScreenList().getLastUIList()).setMove("");
            } else {
                ((GenerateForm) getLastScreenList().getLastUIList()).setMove(data.get("action").get(0));
            }
        } else if (getLastScreenList().getLastUIList() instanceof GenerateHeaderText) {
            ((GenerateHeaderText) getLastScreenList().getLastUIList()).setHeaderNumber(data.get("typeFont").get(0).trim());
            ((GenerateHeaderText) getLastScreenList().getLastUIList()).setTitle(data.get("title").get(0));
        } else if (getLastScreenList().getLastUIList() instanceof GenerateText) {
            ((GenerateText) getLastScreenList().getLastUIList()).setTitle(data.get("title").get(0));
        } else if (getLastScreenList().getLastUIList() instanceof GenerateHyperLink) {
            ((GenerateHyperLink) getLastScreenList().getLastUIList()).setNextPage(data.get("page").get(0));
            ((GenerateHyperLink) getLastScreenList().getLastUIList()).setTitle(data.get("title").get(0));
        }
    }


    public void addDataTwo(Map<String, ArrayList<String>> data) {
        if (getLastScreenList().getLastUIList() instanceof GenerateForm) {
            ((GenerateForm) getLastScreenList().getLastUIList()).addDataTwo(data);
        }
    }

    public void addDataToController(String data) {
        getLastScreenList().getGenerateController().addData(this.screenStateProcessController, data);
    }

    private boolean isReadFile = false;
    private boolean isWriteFile = false;

    public boolean isWriteFile() {
        return isWriteFile;
    }

    public void setWriteFile(boolean writeFile) {
        isWriteFile = writeFile;
    }

    public boolean isReadFile() {
        return isReadFile;
    }

    public void setReadFile(boolean readFile) {
        isReadFile = readFile;
    }


    public void errorHandling() throws Exception {
        for (int i = 0; i < screenModels.size(); i++) {
            for (int j = 0; j < screenModels.get(i).getTestMoveScreen().size(); j++) {
                int k = 0;
                String test = screenModels.get(i).getTestMoveScreen().get(j).trim();
                for (; k < screenModels.size(); k++) {
                    String sc = screenModels.get(k).getNameScreen().trim();
//                    System.out.println(sc + " " + test);
                    if (sc.equals(test)) {
                        break;
                    }
                }
                if (k >= screenModels.size()) {
                    throw new Exception(test + " is not define ");
                }
            }
        }
        testMoveScreenController();
    }

    public void testMoveScreen(String name, String nameScreen) throws Exception {
        if (nameScreen.equals(name.trim())) {
            throw new Exception("\"move\" parameter data " + name + " move to same screen ");
        }
        for (int i = 0; i < screenModels.size(); i++) {

            if (name.trim().equals(screenModels.get(i).getNameScreen())) {
                return;
            }
        }
        throw new Exception("\"move\" parameter data \"" + name + "\" isn't define ");
    }

    ArrayList<String> screenRequire = new ArrayList<>();

    public ArrayList<String> getScreenRequire() {
        return screenRequire;
    }

    public void testMoveScreenController() {
        for (int i = 0; i < screenModels.size(); i++) {
            for (int j = 0; j < screenRequire.size(); j++) {
                if(screenModels.get(i).getNameScreen().trim().equals(
                        screenRequire.get(j).trim()
                )){

                }
            }
        }
    }

}



