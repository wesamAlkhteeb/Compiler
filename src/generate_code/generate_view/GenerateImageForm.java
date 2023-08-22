package generate_code.generate_view;

public class GenerateImageForm implements GenerateUI {

    String source, id;
    String width = "300", height = "300";

    @Override
    public String generateCode() throws Exception {
        return "<input type=\"image\" name=\"" + id + "\", src = \"" + source +
                "\" , width=" + width + " height=" + height + "  >\n";
    }

    public GenerateImageForm() {

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public GenerateImageForm(String source, String id, String width, String height) {
        this.source = source;
        this.id = id;
        this.width = width;
        this.height = height;
    }


    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getWidth() {
        return width;
    }

    public void setWidth(String width) {
        this.width = width;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

}
