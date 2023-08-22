package generate_code.generate_view;

public class GenerateHeaderText implements GenerateUI{

    String title ;
    String headerNumber;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getHeaderNumber() {
        return headerNumber;
    }

    public void setHeaderNumber(String headerNumber) {
        this.headerNumber = headerNumber;
    }

    public GenerateHeaderText(String title, String headerNumber) {
        this.title = title;
        this.headerNumber = headerNumber;
    }

    public GenerateHeaderText() {
    }

    @Override
    public String generateCode() throws Exception {

//        headerNumber = "1";
        int a = Integer.parseInt(headerNumber.trim());
        if(a < 1 || a >6){
            System.out.println(a);
            throw new Exception("can't be type font " + headerNumber + "type font must be between 1,6");
        }
        return "<h"+headerNumber+">"+ title+ "</h"+headerNumber+">\n";
    }

}
