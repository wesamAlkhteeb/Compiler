package ast.classes;

public class NumberCom {
    String number ;

    @Override
    public String toString() {
        return "NumberCom : "+number  ;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}
