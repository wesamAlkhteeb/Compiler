package generate_code.generate_view;

public class GeneratePassword implements  GenerateUI{


    String id;

    public GeneratePassword() {}

    public GeneratePassword(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String generateCode() {
        return "<input type=\"text\" name = "+id+">\n";
    }

}
