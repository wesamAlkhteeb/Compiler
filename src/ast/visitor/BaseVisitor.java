package ast.visitor;


import ast.classes.*;
import generate.*;

public class BaseVisitor extends MyParserBaseVisitor {

    @Override
    public StartCompiler visitStartCompielr(MyParser.StartCompielrContext ctx) {
        StartCompiler startCompiler = new StartCompiler();
        if(ctx != null){
            if(ctx.NAME_VAR()!=null) startCompiler.setNameVariable(ctx.NAME_VAR().getText());
            if(ctx.objectsScreens()!=null) startCompiler.setObjectScreen(visitObjectsScreens(ctx.objectsScreens()));

        }
        return startCompiler;
    }

    @Override
    public ObjectScreens visitObjectsScreens(MyParser.ObjectsScreensContext ctx) {
        ObjectScreens objectScreens = new ObjectScreens();
        if(ctx != null){
            if(ctx.PONAME_VAR()!=null) objectScreens.setVariable(ctx.PONAME_VAR().getText());
            for (int i = 0; i <ctx.objectsScreen().size() ; i++) {
                objectScreens.addCustomObjectToList(visitObjectsScreen(ctx.objectsScreen(i)));
            }
        }
        return objectScreens;
    }

    @Override
    public CustomObject visitObjectsScreen(MyParser.ObjectsScreenContext ctx) {
        CustomObject customObject = new CustomObject();
        if(ctx!=null){
            customObject.setNameVariable(ctx.PLNAME_VAR().getText());
            for (int i = 0; i < ctx.attribute().size(); i++) {
                customObject.addAttribute(visitAttribute(ctx.attribute(i)));
            }
        }
        return customObject;
    }

    @Override
    public Attribute visitAttribute(MyParser.AttributeContext ctx) {
        Attribute attribute = new Attribute();
        if(ctx != null){
            for (int i = 0; i < ctx.PONAME_VAR().size(); i++) {
                attribute.addNameVariable(ctx.PONAME_VAR(i).getText());

            }
            for (int i = 0; i < ctx.type().size(); i++) {
                attribute.addType(visitType(ctx.type(i)));
            }
        }
        return attribute;
    }

    @Override
    public Type visitType(MyParser.TypeContext ctx) {
        Type type = new Type();
        if(ctx!=null){
            if(ctx.simpleobject()!=null) type.setSimpleObject(visitSimpleobject(ctx.simpleobject()));
            if(ctx.function()!=null) type.setFunctionCom(visitFunction(ctx.function()));
            if(ctx.string()!=null) type.setStringCom(visitString(ctx.string()));
            if(ctx.number()!=null) type.setNumberCom(visitNumber(ctx.number()));
            if(ctx.list()!=null) type.setListCom(visitList(ctx.list()));
            if(ctx.static_()!=null) type.setStaticCom(visitStatic(ctx.static_()));
        }
        return type;
    }

    @Override
    public ListCom visitList(MyParser.ListContext ctx) {
        ListCom listCom = new ListCom();
        if(ctx!=null){
            for (int i = 0; i < ctx.objectsScreen().size(); i++) {
                listCom.addObjToCustomObjects(visitObjectsScreen(ctx.objectsScreen(i)));
            }
            for (int i = 0; i < ctx.simpleobject().size(); i++) {
                listCom.addObjToCustomObjects(visitSimpleobject(ctx.simpleobject(i)));
            }

            for (int i = 0; i < ctx.stringList().size(); i++) {
                listCom.addStringToStringList(visitStringList(ctx.stringList(i)));
            }
        }
        return listCom;
    }

    @Override
    public StringList visitStringList(MyParser.StringListContext ctx) {
        StringList stringList = new StringList();
        if(ctx!=null){
            if(ctx.DQTEXT_STRING()!=null)stringList.setData(ctx.DQTEXT_STRING().getText());
        }
        return stringList;
    }

    @Override
    public CustomObject visitSimpleobject(MyParser.SimpleobjectContext ctx) {
        CustomObject customObject = new CustomObject();
        if(ctx!=null){
            if(ctx.PONAME_VAR() !=null)customObject.setNameVariable(ctx.PONAME_VAR().getText());
            for (int i = 0; i < ctx.attribute().size(); i++) {
                customObject.addAttribute(visitAttribute(ctx.attribute(i)));
            }
        }
        return customObject;
    }

    @Override
    public FunctionCom visitFunction(MyParser.FunctionContext ctx) {
        FunctionCom functionCom = new FunctionCom();
        if(ctx!=null){
            for (int i = 0; i < ctx.cntr().size(); i++) {
                functionCom.addCntr(visitCntr(ctx.cntr(i)));
            }
        }
        return functionCom;
    }

    @Override
    public Cntr visitCntr(MyParser.CntrContext ctx) {
        Cntr cntr = new Cntr();

        if(ctx!=null ){
            if(ctx.condition()!=null) cntr.setCondition(visitCondition(ctx.condition()));
            if(ctx.defineObj()!=null) cntr.setDefineObj(visitDefineObj(ctx.defineObj()));
        }
        return cntr;
    }

    @Override
    public DefineObj visitDefineObj(MyParser.DefineObjContext ctx) {
        DefineObj defineObj = new DefineObj();
        if(ctx !=null){
            if(ctx.equalObj()!=null)defineObj.setEqualObj(visitEqualObj(ctx.equalObj()));
        }
        return defineObj;
    }

    @Override
    public EqualObj visitEqualObj(MyParser.EqualObjContext ctx) {
        EqualObj equalObj = new EqualObj();
        if(ctx!=null){
            if(ctx.PBNAME_VAR()!=null){
                equalObj.setNameVariable(ctx.PBNAME_VAR().getText());
            }
            if(ctx.objectBody()!=null)equalObj.setObjectBody(visitObjectBody(ctx.objectBody()));
        }
        return equalObj;
    }

    @Override
    public Condition visitCondition(MyParser.ConditionContext ctx) {
        Condition condition = new Condition();
        if(ctx!= null){
            for (int i = 0; i < ctx.compair().size(); i++) {
                condition.addCompairToList(visitCompair(ctx.compair(i)));
            }
            for (int i = 0; i < ctx.objectBody().size(); i++) {
                condition.addCustomObjectToList(visitObjectBody(ctx.objectBody(i)));
            }
        }
        return condition;
    }

    @Override
    public CustomObject visitObjectBody(MyParser.ObjectBodyContext ctx) {
        CustomObject customObject = new CustomObject();
        if(ctx!=null){
            if(ctx.PBNAME_VAR() != null){
                customObject.setNameVariable(ctx.PBNAME_VAR().getText());
            }
            for(int i =0 ; i<ctx.attribute().size() ; i++){
                customObject.addAttribute(visitAttribute(ctx.attribute(i)));
            }
        }

        return customObject;
    }

    @Override
    public Compare visitCompair(MyParser.CompairContext ctx) {
        Compare compair = new Compare();
        if(ctx!=null){
            if(ctx.static_().size()!=0){
                compair.setStaticCom1(visitStatic(ctx.static_(0)));
                compair.setStaticCom2(visitStatic(ctx.static_(1)));
            }
            if(ctx.simpleobject()!=null){
                compair.setCustomObject(visitSimpleobject(ctx.simpleobject()));
            }
        }
        return compair;
    }

    @Override
    public StringCom visitString(MyParser.StringContext ctx) {
        StringCom stringCom = new StringCom();
        if(ctx != null){
            if(ctx.DQTEXT_STRING() != null ) stringCom.setData(ctx.DQTEXT_STRING().getText());
        }
        return stringCom;
    }

    @Override
    public NumberCom visitNumber(MyParser.NumberContext ctx) {
        NumberCom numberCom = new NumberCom();
        if(ctx != null){
            if(ctx.PONUMBER() != null ) numberCom.setNumber(ctx.PONUMBER().getText());
        }
        return numberCom;
    }

    @Override
    public StaticCom visitStatic(MyParser.StaticContext ctx) {
        StaticCom staticCom = new StaticCom();
        if(ctx != null){
            if(ctx.PONAME_VAR(0) != null ) staticCom.setFirstNameVariable(ctx.PONAME_VAR(0).getText());
            if(ctx.PONAME_VAR(1) != null ) staticCom.setSecondNameVariable(ctx.PONAME_VAR(1).getText());
        }
        return staticCom;
    }

}
