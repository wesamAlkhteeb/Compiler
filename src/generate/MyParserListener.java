package generate;
// Generated from C:/Users/Wesam_KH/IdeaProjects/compiler_2/src\MyParser.g4 by ANTLR 4.10.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MyParser}.
 */
public interface MyParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MyParser#startCompielr}.
	 * @param ctx the parse tree
	 */
	void enterStartCompielr(MyParser.StartCompielrContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParser#startCompielr}.
	 * @param ctx the parse tree
	 */
	void exitStartCompielr(MyParser.StartCompielrContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyParser#objectsScreens}.
	 * @param ctx the parse tree
	 */
	void enterObjectsScreens(MyParser.ObjectsScreensContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParser#objectsScreens}.
	 * @param ctx the parse tree
	 */
	void exitObjectsScreens(MyParser.ObjectsScreensContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyParser#objectsScreen}.
	 * @param ctx the parse tree
	 */
	void enterObjectsScreen(MyParser.ObjectsScreenContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParser#objectsScreen}.
	 * @param ctx the parse tree
	 */
	void exitObjectsScreen(MyParser.ObjectsScreenContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyParser#attribute}.
	 * @param ctx the parse tree
	 */
	void enterAttribute(MyParser.AttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParser#attribute}.
	 * @param ctx the parse tree
	 */
	void exitAttribute(MyParser.AttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(MyParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(MyParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyParser#simpleobject}.
	 * @param ctx the parse tree
	 */
	void enterSimpleobject(MyParser.SimpleobjectContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParser#simpleobject}.
	 * @param ctx the parse tree
	 */
	void exitSimpleobject(MyParser.SimpleobjectContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(MyParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(MyParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyParser#string}.
	 * @param ctx the parse tree
	 */
	void enterString(MyParser.StringContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParser#string}.
	 * @param ctx the parse tree
	 */
	void exitString(MyParser.StringContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(MyParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(MyParser.NumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyParser#list}.
	 * @param ctx the parse tree
	 */
	void enterList(MyParser.ListContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParser#list}.
	 * @param ctx the parse tree
	 */
	void exitList(MyParser.ListContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyParser#static}.
	 * @param ctx the parse tree
	 */
	void enterStatic(MyParser.StaticContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParser#static}.
	 * @param ctx the parse tree
	 */
	void exitStatic(MyParser.StaticContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyParser#stringList}.
	 * @param ctx the parse tree
	 */
	void enterStringList(MyParser.StringListContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParser#stringList}.
	 * @param ctx the parse tree
	 */
	void exitStringList(MyParser.StringListContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyParser#cntr}.
	 * @param ctx the parse tree
	 */
	void enterCntr(MyParser.CntrContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParser#cntr}.
	 * @param ctx the parse tree
	 */
	void exitCntr(MyParser.CntrContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyParser#defineObj}.
	 * @param ctx the parse tree
	 */
	void enterDefineObj(MyParser.DefineObjContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParser#defineObj}.
	 * @param ctx the parse tree
	 */
	void exitDefineObj(MyParser.DefineObjContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyParser#equalObj}.
	 * @param ctx the parse tree
	 */
	void enterEqualObj(MyParser.EqualObjContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParser#equalObj}.
	 * @param ctx the parse tree
	 */
	void exitEqualObj(MyParser.EqualObjContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(MyParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(MyParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyParser#objectBody}.
	 * @param ctx the parse tree
	 */
	void enterObjectBody(MyParser.ObjectBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParser#objectBody}.
	 * @param ctx the parse tree
	 */
	void exitObjectBody(MyParser.ObjectBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyParser#compair}.
	 * @param ctx the parse tree
	 */
	void enterCompair(MyParser.CompairContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParser#compair}.
	 * @param ctx the parse tree
	 */
	void exitCompair(MyParser.CompairContext ctx);
}