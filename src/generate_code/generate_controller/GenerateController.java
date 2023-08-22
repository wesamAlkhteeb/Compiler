package generate_code.generate_controller;

import java.util.Objects;

public class GenerateController {

    String header ="" , body="";

    public String getHeader() {
        return header;
    }

    public String getBody() {
        return body;
    }

    public void addData(String type , String data){
        if(Objects.equals(type, "header")){
            header+=data;
        }
        else if(Objects.equals(type, "body")){
            body+=data;
        }
    }

}
