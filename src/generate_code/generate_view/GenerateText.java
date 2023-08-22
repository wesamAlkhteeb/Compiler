package generate_code.generate_view;

public class GenerateText implements GenerateUI{

    private String title;

    public GenerateText() {
    }

    public GenerateText(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String generateCode() {
        if(title !=null && title.startsWith("$") ){
            return "<?php\n echo "+title+";\n ?>\n";
        }
        return "<b>"+title + "</b>\n";
    }
}
