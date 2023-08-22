package generate_code.generate_view;

import generate_code.generate_model.GenerateModel;

import java.util.function.Function;

public class GenerateHyperLink implements GenerateUI {

    private String nextPage;
    private String title;

    public GenerateHyperLink() {
    }

    public String getNextPage() {
        return nextPage;
    }

    public void setNextPage(String nextPage) {
        this.nextPage = nextPage;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String generateCode() throws Exception {
        return "<a href = \"" + nextPage + ".php\">" + title + "</a>\n";
    }
}
