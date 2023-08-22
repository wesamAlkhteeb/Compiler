package ast.classes;

import generate_code.sample_table.CheckSyntax;

import java.util.ArrayList;

public class ListCom {
    ArrayList<CustomObject> customObjects = new ArrayList<>();
    ArrayList<StringList> stringLists = new ArrayList<StringList>();
    public void addObjToCustomObjects(CustomObject customObject){
        this.customObjects.add(customObject);
    }

    public void addStringToStringList(StringList stringList){
        this.stringLists.add(stringList);
    }

    public boolean checkCode(int index) throws Exception {
        if(customObjects.size()!=0){
            for (int i = 0; i < customObjects.size() ; i++) {
                customObjects.get(i).checkCode(index);
            }
        }else {
            if(!CheckSyntax.getInstance().addDataToCheck(CheckSyntax.ANY,index)){
                throw new Exception("Syntax Error ***");
            }
        }
        return  true;
    }

    ArrayList<String> getData(){
        ArrayList<String > data = new ArrayList<>();
        if(stringLists!=null){
            for (int i = 0; i < stringLists.size(); i++) {
                data .add(stringLists.get(i).data);
            }
        }else  if(customObjects !=null){
            for (int i = 0; i < customObjects.size(); i++) {
                data .add(customObjects.get(i).nameVariable);
            }
        }
        return data;
    }

    @Override
    public String toString() {
        String a = customObjects.toString() + stringLists.toString();
        return a;
    }
}
