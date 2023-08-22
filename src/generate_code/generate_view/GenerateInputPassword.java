package generate_code.generate_view;

public class GenerateInputPassword implements GenerateUI {
    String id;

    public GenerateInputPassword() {}

    public GenerateInputPassword(String id) {
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
        return "<input type=\"password\" name = \""+id+"\">\n";
    }
}
