package generate_code.generate_view;

public class GenerateInputText implements GenerateUI {

    String id;

    public GenerateInputText() {}

    public GenerateInputText(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String generateCode() throws Exception {
        return "<input type=\"text\" name = \""+id+"\">\n";
    }
}



//أختبر id كل الدخل