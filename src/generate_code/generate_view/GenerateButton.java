package generate_code.generate_view;

public class GenerateButton implements GenerateUI{
    String title;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public GenerateButton() {

    }

    @Override
    public String generateCode() throws Exception {
        return "<input type=\"submit\" value = \""+title+"\">\n";
//        return "<input type=\"submit\" name=\""+id+"\" value = \""+text+"\">\n";
    }

}
