package generate_code.generate_view;

public class GenerateParagraph implements GenerateUI{
    String title ;

    @Override
    public String generateCode() throws Exception {
        return " <b>"+title+"</b>\n";
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public GenerateParagraph() {
    }

    public GenerateParagraph(String title) {
        this.title = title;
    }

}
