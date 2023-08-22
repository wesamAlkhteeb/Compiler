package ast.classes;

public class StringList {
    String data;

    @Override
    public String toString() {
        return "StringList{" +
                "data='" + data + '\'' +
                '}';
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
