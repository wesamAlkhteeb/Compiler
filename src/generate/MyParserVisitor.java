package generate;
// Generated from C:/Users/Wesam_KH/IdeaProjects/compiler_2/src\MyParser.g4 by ANTLR 4.10.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link MyParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface MyParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link MyParser#startCompielr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStartCompielr(MyParser.StartCompielrContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyParser#objectsScreens}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectsScreens(MyParser.ObjectsScreensContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyParser#objectsScreen}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectsScreen(MyParser.ObjectsScreenContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyParser#attribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttribute(MyParser.AttributeContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(MyParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyParser#simpleobject}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleobject(MyParser.SimpleobjectContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(MyParser.FunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyParser#string}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString(MyParser.StringContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(MyParser.NumberContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyParser#list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList(MyParser.ListContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyParser#static}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatic(MyParser.StaticContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyParser#stringList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringList(MyParser.StringListContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyParser#cntr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCntr(MyParser.CntrContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyParser#defineObj}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefineObj(MyParser.DefineObjContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyParser#equalObj}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualObj(MyParser.EqualObjContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition(MyParser.ConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyParser#objectBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectBody(MyParser.ObjectBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyParser#compair}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompair(MyParser.CompairContext ctx);
}