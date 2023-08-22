
package generate;

// Generated from C:/Users/Wesam_KH/IdeaProjects/compiler_2/src\MyParser.g4 by ANTLR 4.10.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MyParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		NAME_VAR=1, PRACETOBJECTOPEN=2, POEQUAlCOMPAIR=3, PO_AND=4, PRACET_OBJECT_CLOSE=5, 
		PONAME_VAR=6, PODEFINITION=7, PRACET_LIST_OPEN=8, PRACET_OBJECT_INNER_OPEN=9, 
		PRACET_BODY_OPEN=10, DOUBLE_QUOTATION_OPEN=11, POCOMMA=12, PODOT=13, PONUMBER=14, 
		PRACET_LIST_CLOSE=15, PLDOUBLE_QUOTATION_OPEN=16, PLPRACET_OBJECT_OPEN=17, 
		PLCOMMA=18, PLNAME_VAR=19, PRACET_BODY_CLOSE=20, PBPRACET_OBJECT_INNER_OPEN=21, 
		PBPRACET_BODY_OPEN=22, PBIF=23, PBSQ=24, PBEQUAL=25, PBNAME_VAR=26, DOUBLE_QUOTATION_CLOSE=27, 
		DQTEXT_STRING=28;
	public static final int
		RULE_startCompielr = 0, RULE_objectsScreens = 1, RULE_objectsScreen = 2, 
		RULE_attribute = 3, RULE_type = 4, RULE_simpleobject = 5, RULE_function = 6, 
		RULE_string = 7, RULE_number = 8, RULE_list = 9, RULE_static = 10, RULE_stringList = 11, 
		RULE_cntr = 12, RULE_defineObj = 13, RULE_equalObj = 14, RULE_condition = 15, 
		RULE_objectBody = 16, RULE_compair = 17;
	private static String[] makeRuleNames() {
		return new String[] {
			"startCompielr", "objectsScreens", "objectsScreen", "attribute", "type", 
			"simpleobject", "function", "string", "number", "list", "static", "stringList", 
			"cntr", "defineObj", "equalObj", "condition", "objectBody", "compair"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "NAME_VAR", "PRACETOBJECTOPEN", "POEQUAlCOMPAIR", "PO_AND", "PRACET_OBJECT_CLOSE", 
			"PONAME_VAR", "PODEFINITION", "PRACET_LIST_OPEN", "PRACET_OBJECT_INNER_OPEN", 
			"PRACET_BODY_OPEN", "DOUBLE_QUOTATION_OPEN", "POCOMMA", "PODOT", "PONUMBER", 
			"PRACET_LIST_CLOSE", "PLDOUBLE_QUOTATION_OPEN", "PLPRACET_OBJECT_OPEN", 
			"PLCOMMA", "PLNAME_VAR", "PRACET_BODY_CLOSE", "PBPRACET_OBJECT_INNER_OPEN", 
			"PBPRACET_BODY_OPEN", "PBIF", "PBSQ", "PBEQUAL", "PBNAME_VAR", "DOUBLE_QUOTATION_CLOSE", 
			"DQTEXT_STRING"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "MyParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MyParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class StartCompielrContext extends ParserRuleContext {
		public TerminalNode NAME_VAR() { return getToken(MyParser.NAME_VAR, 0); }
		public TerminalNode PRACETOBJECTOPEN() { return getToken(MyParser.PRACETOBJECTOPEN, 0); }
		public ObjectsScreensContext objectsScreens() {
			return getRuleContext(ObjectsScreensContext.class,0);
		}
		public TerminalNode PRACET_OBJECT_CLOSE() { return getToken(MyParser.PRACET_OBJECT_CLOSE, 0); }
		public StartCompielrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_startCompielr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterStartCompielr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitStartCompielr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor ) return ((MyParserVisitor<? extends T>)visitor).visitStartCompielr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StartCompielrContext startCompielr() throws RecognitionException {
		StartCompielrContext _localctx = new StartCompielrContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_startCompielr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(41);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NAME_VAR) {
				{
				setState(36);
				match(NAME_VAR);
				setState(37);
				match(PRACETOBJECTOPEN);
				setState(38);
				objectsScreens();
				setState(39);
				match(PRACET_OBJECT_CLOSE);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ObjectsScreensContext extends ParserRuleContext {
		public TerminalNode PONAME_VAR() { return getToken(MyParser.PONAME_VAR, 0); }
		public TerminalNode PODEFINITION() { return getToken(MyParser.PODEFINITION, 0); }
		public TerminalNode PRACET_LIST_OPEN() { return getToken(MyParser.PRACET_LIST_OPEN, 0); }
		public TerminalNode PRACET_LIST_CLOSE() { return getToken(MyParser.PRACET_LIST_CLOSE, 0); }
		public List<ObjectsScreenContext> objectsScreen() {
			return getRuleContexts(ObjectsScreenContext.class);
		}
		public ObjectsScreenContext objectsScreen(int i) {
			return getRuleContext(ObjectsScreenContext.class,i);
		}
		public List<TerminalNode> PLCOMMA() { return getTokens(MyParser.PLCOMMA); }
		public TerminalNode PLCOMMA(int i) {
			return getToken(MyParser.PLCOMMA, i);
		}
		public ObjectsScreensContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objectsScreens; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterObjectsScreens(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitObjectsScreens(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor ) return ((MyParserVisitor<? extends T>)visitor).visitObjectsScreens(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjectsScreensContext objectsScreens() throws RecognitionException {
		ObjectsScreensContext _localctx = new ObjectsScreensContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_objectsScreens);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(43);
			match(PONAME_VAR);
			setState(44);
			match(PODEFINITION);
			setState(45);
			match(PRACET_LIST_OPEN);
			setState(54);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PLNAME_VAR) {
				{
				setState(46);
				objectsScreen();
				setState(51);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==PLCOMMA) {
					{
					{
					setState(47);
					match(PLCOMMA);
					setState(48);
					objectsScreen();
					}
					}
					setState(53);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(56);
			match(PRACET_LIST_CLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ObjectsScreenContext extends ParserRuleContext {
		public TerminalNode PLNAME_VAR() { return getToken(MyParser.PLNAME_VAR, 0); }
		public TerminalNode PLPRACET_OBJECT_OPEN() { return getToken(MyParser.PLPRACET_OBJECT_OPEN, 0); }
		public TerminalNode PRACET_OBJECT_CLOSE() { return getToken(MyParser.PRACET_OBJECT_CLOSE, 0); }
		public List<AttributeContext> attribute() {
			return getRuleContexts(AttributeContext.class);
		}
		public AttributeContext attribute(int i) {
			return getRuleContext(AttributeContext.class,i);
		}
		public List<TerminalNode> POCOMMA() { return getTokens(MyParser.POCOMMA); }
		public TerminalNode POCOMMA(int i) {
			return getToken(MyParser.POCOMMA, i);
		}
		public ObjectsScreenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objectsScreen; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterObjectsScreen(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitObjectsScreen(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor ) return ((MyParserVisitor<? extends T>)visitor).visitObjectsScreen(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjectsScreenContext objectsScreen() throws RecognitionException {
		ObjectsScreenContext _localctx = new ObjectsScreenContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_objectsScreen);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
			match(PLNAME_VAR);
			setState(59);
			match(PLPRACET_OBJECT_OPEN);
			setState(68);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(60);
				attribute();
				setState(65);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==POCOMMA) {
					{
					{
					setState(61);
					match(POCOMMA);
					setState(62);
					attribute();
					}
					}
					setState(67);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
			setState(70);
			match(PRACET_OBJECT_CLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AttributeContext extends ParserRuleContext {
		public List<TerminalNode> PONAME_VAR() { return getTokens(MyParser.PONAME_VAR); }
		public TerminalNode PONAME_VAR(int i) {
			return getToken(MyParser.PONAME_VAR, i);
		}
		public List<TerminalNode> PODEFINITION() { return getTokens(MyParser.PODEFINITION); }
		public TerminalNode PODEFINITION(int i) {
			return getToken(MyParser.PODEFINITION, i);
		}
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<TerminalNode> POCOMMA() { return getTokens(MyParser.POCOMMA); }
		public TerminalNode POCOMMA(int i) {
			return getToken(MyParser.POCOMMA, i);
		}
		public AttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitAttribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor ) return ((MyParserVisitor<? extends T>)visitor).visitAttribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributeContext attribute() throws RecognitionException {
		AttributeContext _localctx = new AttributeContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_attribute);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PONAME_VAR) {
				{
				setState(72);
				match(PONAME_VAR);
				setState(73);
				match(PODEFINITION);
				setState(74);
				type();
				setState(81);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(75);
						match(POCOMMA);
						setState(76);
						match(PONAME_VAR);
						setState(77);
						match(PODEFINITION);
						setState(78);
						type();
						}
						} 
					}
					setState(83);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeContext extends ParserRuleContext {
		public SimpleobjectContext simpleobject() {
			return getRuleContext(SimpleobjectContext.class,0);
		}
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public ListContext list() {
			return getRuleContext(ListContext.class,0);
		}
		public StaticContext static_() {
			return getRuleContext(StaticContext.class,0);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor ) return ((MyParserVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(86);
				simpleobject();
				}
				break;
			case 2:
				{
				setState(87);
				function();
				}
				break;
			case 3:
				{
				setState(88);
				string();
				}
				break;
			case 4:
				{
				setState(89);
				number();
				}
				break;
			case 5:
				{
				setState(90);
				list();
				}
				break;
			case 6:
				{
				setState(91);
				static_();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SimpleobjectContext extends ParserRuleContext {
		public TerminalNode PONAME_VAR() { return getToken(MyParser.PONAME_VAR, 0); }
		public TerminalNode PRACET_OBJECT_INNER_OPEN() { return getToken(MyParser.PRACET_OBJECT_INNER_OPEN, 0); }
		public TerminalNode PRACET_OBJECT_CLOSE() { return getToken(MyParser.PRACET_OBJECT_CLOSE, 0); }
		public List<AttributeContext> attribute() {
			return getRuleContexts(AttributeContext.class);
		}
		public AttributeContext attribute(int i) {
			return getRuleContext(AttributeContext.class,i);
		}
		public List<TerminalNode> POCOMMA() { return getTokens(MyParser.POCOMMA); }
		public TerminalNode POCOMMA(int i) {
			return getToken(MyParser.POCOMMA, i);
		}
		public SimpleobjectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleobject; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterSimpleobject(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitSimpleobject(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor ) return ((MyParserVisitor<? extends T>)visitor).visitSimpleobject(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SimpleobjectContext simpleobject() throws RecognitionException {
		SimpleobjectContext _localctx = new SimpleobjectContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_simpleobject);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
			match(PONAME_VAR);
			setState(95);
			match(PRACET_OBJECT_INNER_OPEN);
			setState(104);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(96);
				attribute();
				setState(101);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==POCOMMA) {
					{
					{
					setState(97);
					match(POCOMMA);
					setState(98);
					attribute();
					}
					}
					setState(103);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
			setState(106);
			match(PRACET_OBJECT_CLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionContext extends ParserRuleContext {
		public TerminalNode PRACET_OBJECT_INNER_OPEN() { return getToken(MyParser.PRACET_OBJECT_INNER_OPEN, 0); }
		public TerminalNode PRACET_OBJECT_CLOSE() { return getToken(MyParser.PRACET_OBJECT_CLOSE, 0); }
		public TerminalNode PRACET_BODY_OPEN() { return getToken(MyParser.PRACET_BODY_OPEN, 0); }
		public TerminalNode PRACET_BODY_CLOSE() { return getToken(MyParser.PRACET_BODY_CLOSE, 0); }
		public List<CntrContext> cntr() {
			return getRuleContexts(CntrContext.class);
		}
		public CntrContext cntr(int i) {
			return getRuleContext(CntrContext.class,i);
		}
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor ) return ((MyParserVisitor<? extends T>)visitor).visitFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			match(PRACET_OBJECT_INNER_OPEN);
			setState(109);
			match(PRACET_OBJECT_CLOSE);
			setState(110);
			match(PRACET_BODY_OPEN);
			setState(114);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PBIF || _la==PBNAME_VAR) {
				{
				{
				setState(111);
				cntr();
				}
				}
				setState(116);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(117);
			match(PRACET_BODY_CLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StringContext extends ParserRuleContext {
		public TerminalNode DOUBLE_QUOTATION_OPEN() { return getToken(MyParser.DOUBLE_QUOTATION_OPEN, 0); }
		public TerminalNode DOUBLE_QUOTATION_CLOSE() { return getToken(MyParser.DOUBLE_QUOTATION_CLOSE, 0); }
		public TerminalNode DQTEXT_STRING() { return getToken(MyParser.DQTEXT_STRING, 0); }
		public StringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor ) return ((MyParserVisitor<? extends T>)visitor).visitString(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringContext string() throws RecognitionException {
		StringContext _localctx = new StringContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_string);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			match(DOUBLE_QUOTATION_OPEN);
			setState(121);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DQTEXT_STRING) {
				{
				setState(120);
				match(DQTEXT_STRING);
				}
			}

			setState(123);
			match(DOUBLE_QUOTATION_CLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NumberContext extends ParserRuleContext {
		public TerminalNode PONUMBER() { return getToken(MyParser.PONUMBER, 0); }
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor ) return ((MyParserVisitor<? extends T>)visitor).visitNumber(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_number);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			match(PONUMBER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ListContext extends ParserRuleContext {
		public TerminalNode PRACET_LIST_OPEN() { return getToken(MyParser.PRACET_LIST_OPEN, 0); }
		public TerminalNode PRACET_LIST_CLOSE() { return getToken(MyParser.PRACET_LIST_CLOSE, 0); }
		public List<ObjectsScreenContext> objectsScreen() {
			return getRuleContexts(ObjectsScreenContext.class);
		}
		public ObjectsScreenContext objectsScreen(int i) {
			return getRuleContext(ObjectsScreenContext.class,i);
		}
		public List<SimpleobjectContext> simpleobject() {
			return getRuleContexts(SimpleobjectContext.class);
		}
		public SimpleobjectContext simpleobject(int i) {
			return getRuleContext(SimpleobjectContext.class,i);
		}
		public List<StringListContext> stringList() {
			return getRuleContexts(StringListContext.class);
		}
		public StringListContext stringList(int i) {
			return getRuleContext(StringListContext.class,i);
		}
		public List<TerminalNode> PLCOMMA() { return getTokens(MyParser.PLCOMMA); }
		public TerminalNode PLCOMMA(int i) {
			return getToken(MyParser.PLCOMMA, i);
		}
		public ListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor ) return ((MyParserVisitor<? extends T>)visitor).visitList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListContext list() throws RecognitionException {
		ListContext _localctx = new ListContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			match(PRACET_LIST_OPEN);
			setState(144);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PONAME_VAR) | (1L << PLDOUBLE_QUOTATION_OPEN) | (1L << PLNAME_VAR))) != 0)) {
				{
				setState(131);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case PLNAME_VAR:
					{
					setState(128);
					objectsScreen();
					}
					break;
				case PONAME_VAR:
					{
					setState(129);
					simpleobject();
					}
					break;
				case PLDOUBLE_QUOTATION_OPEN:
					{
					setState(130);
					stringList();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(141);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==PLCOMMA) {
					{
					{
					setState(133);
					match(PLCOMMA);
					setState(137);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case PLNAME_VAR:
						{
						setState(134);
						objectsScreen();
						}
						break;
					case PONAME_VAR:
						{
						setState(135);
						simpleobject();
						}
						break;
					case PLDOUBLE_QUOTATION_OPEN:
						{
						setState(136);
						stringList();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					}
					setState(143);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(146);
			match(PRACET_LIST_CLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StaticContext extends ParserRuleContext {
		public List<TerminalNode> PONAME_VAR() { return getTokens(MyParser.PONAME_VAR); }
		public TerminalNode PONAME_VAR(int i) {
			return getToken(MyParser.PONAME_VAR, i);
		}
		public TerminalNode PODOT() { return getToken(MyParser.PODOT, 0); }
		public StaticContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_static; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterStatic(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitStatic(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor ) return ((MyParserVisitor<? extends T>)visitor).visitStatic(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StaticContext static_() throws RecognitionException {
		StaticContext _localctx = new StaticContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_static);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
			match(PONAME_VAR);
			setState(149);
			match(PODOT);
			setState(150);
			match(PONAME_VAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StringListContext extends ParserRuleContext {
		public TerminalNode PLDOUBLE_QUOTATION_OPEN() { return getToken(MyParser.PLDOUBLE_QUOTATION_OPEN, 0); }
		public TerminalNode DQTEXT_STRING() { return getToken(MyParser.DQTEXT_STRING, 0); }
		public TerminalNode DOUBLE_QUOTATION_CLOSE() { return getToken(MyParser.DOUBLE_QUOTATION_CLOSE, 0); }
		public StringListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterStringList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitStringList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor ) return ((MyParserVisitor<? extends T>)visitor).visitStringList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringListContext stringList() throws RecognitionException {
		StringListContext _localctx = new StringListContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_stringList);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(152);
			match(PLDOUBLE_QUOTATION_OPEN);
			setState(153);
			match(DQTEXT_STRING);
			setState(154);
			match(DOUBLE_QUOTATION_CLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CntrContext extends ParserRuleContext {
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public DefineObjContext defineObj() {
			return getRuleContext(DefineObjContext.class,0);
		}
		public CntrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cntr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterCntr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitCntr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor ) return ((MyParserVisitor<? extends T>)visitor).visitCntr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CntrContext cntr() throws RecognitionException {
		CntrContext _localctx = new CntrContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_cntr);
		try {
			setState(158);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PBIF:
				enterOuterAlt(_localctx, 1);
				{
				setState(156);
				condition();
				}
				break;
			case PBNAME_VAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(157);
				defineObj();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DefineObjContext extends ParserRuleContext {
		public EqualObjContext equalObj() {
			return getRuleContext(EqualObjContext.class,0);
		}
		public DefineObjContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defineObj; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterDefineObj(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitDefineObj(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor ) return ((MyParserVisitor<? extends T>)visitor).visitDefineObj(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefineObjContext defineObj() throws RecognitionException {
		DefineObjContext _localctx = new DefineObjContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_defineObj);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			equalObj();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EqualObjContext extends ParserRuleContext {
		public TerminalNode PBNAME_VAR() { return getToken(MyParser.PBNAME_VAR, 0); }
		public TerminalNode PBEQUAL() { return getToken(MyParser.PBEQUAL, 0); }
		public ObjectBodyContext objectBody() {
			return getRuleContext(ObjectBodyContext.class,0);
		}
		public TerminalNode PBSQ() { return getToken(MyParser.PBSQ, 0); }
		public EqualObjContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equalObj; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterEqualObj(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitEqualObj(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor ) return ((MyParserVisitor<? extends T>)visitor).visitEqualObj(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EqualObjContext equalObj() throws RecognitionException {
		EqualObjContext _localctx = new EqualObjContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_equalObj);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(162);
			match(PBNAME_VAR);
			setState(163);
			match(PBEQUAL);
			setState(164);
			objectBody();
			setState(165);
			match(PBSQ);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConditionContext extends ParserRuleContext {
		public TerminalNode PBIF() { return getToken(MyParser.PBIF, 0); }
		public TerminalNode PBPRACET_OBJECT_INNER_OPEN() { return getToken(MyParser.PBPRACET_OBJECT_INNER_OPEN, 0); }
		public TerminalNode PRACET_OBJECT_CLOSE() { return getToken(MyParser.PRACET_OBJECT_CLOSE, 0); }
		public TerminalNode PBPRACET_BODY_OPEN() { return getToken(MyParser.PBPRACET_BODY_OPEN, 0); }
		public TerminalNode PRACET_BODY_CLOSE() { return getToken(MyParser.PRACET_BODY_CLOSE, 0); }
		public List<CompairContext> compair() {
			return getRuleContexts(CompairContext.class);
		}
		public CompairContext compair(int i) {
			return getRuleContext(CompairContext.class,i);
		}
		public List<ObjectBodyContext> objectBody() {
			return getRuleContexts(ObjectBodyContext.class);
		}
		public ObjectBodyContext objectBody(int i) {
			return getRuleContext(ObjectBodyContext.class,i);
		}
		public List<TerminalNode> PBSQ() { return getTokens(MyParser.PBSQ); }
		public TerminalNode PBSQ(int i) {
			return getToken(MyParser.PBSQ, i);
		}
		public List<TerminalNode> PO_AND() { return getTokens(MyParser.PO_AND); }
		public TerminalNode PO_AND(int i) {
			return getToken(MyParser.PO_AND, i);
		}
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor ) return ((MyParserVisitor<? extends T>)visitor).visitCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_condition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
			match(PBIF);
			setState(168);
			match(PBPRACET_OBJECT_INNER_OPEN);
			{
			setState(169);
			compair();
			setState(174);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PO_AND) {
				{
				{
				setState(170);
				match(PO_AND);
				setState(171);
				compair();
				}
				}
				setState(176);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
			setState(177);
			match(PRACET_OBJECT_CLOSE);
			setState(178);
			match(PBPRACET_BODY_OPEN);
			setState(184);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PBNAME_VAR) {
				{
				{
				setState(179);
				objectBody();
				setState(180);
				match(PBSQ);
				}
				}
				setState(186);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(187);
			match(PRACET_BODY_CLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ObjectBodyContext extends ParserRuleContext {
		public TerminalNode PBNAME_VAR() { return getToken(MyParser.PBNAME_VAR, 0); }
		public TerminalNode PBPRACET_OBJECT_INNER_OPEN() { return getToken(MyParser.PBPRACET_OBJECT_INNER_OPEN, 0); }
		public TerminalNode PRACET_OBJECT_CLOSE() { return getToken(MyParser.PRACET_OBJECT_CLOSE, 0); }
		public List<AttributeContext> attribute() {
			return getRuleContexts(AttributeContext.class);
		}
		public AttributeContext attribute(int i) {
			return getRuleContext(AttributeContext.class,i);
		}
		public List<TerminalNode> POCOMMA() { return getTokens(MyParser.POCOMMA); }
		public TerminalNode POCOMMA(int i) {
			return getToken(MyParser.POCOMMA, i);
		}
		public ObjectBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objectBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterObjectBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitObjectBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor ) return ((MyParserVisitor<? extends T>)visitor).visitObjectBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjectBodyContext objectBody() throws RecognitionException {
		ObjectBodyContext _localctx = new ObjectBodyContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_objectBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(189);
			match(PBNAME_VAR);
			setState(190);
			match(PBPRACET_OBJECT_INNER_OPEN);
			{
			setState(191);
			attribute();
			setState(196);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==POCOMMA) {
				{
				{
				setState(192);
				match(POCOMMA);
				setState(193);
				attribute();
				}
				}
				setState(198);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
			setState(199);
			match(PRACET_OBJECT_CLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CompairContext extends ParserRuleContext {
		public List<StaticContext> static_() {
			return getRuleContexts(StaticContext.class);
		}
		public StaticContext static_(int i) {
			return getRuleContext(StaticContext.class,i);
		}
		public TerminalNode POEQUAlCOMPAIR() { return getToken(MyParser.POEQUAlCOMPAIR, 0); }
		public SimpleobjectContext simpleobject() {
			return getRuleContext(SimpleobjectContext.class,0);
		}
		public CompairContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compair; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterCompair(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitCompair(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor ) return ((MyParserVisitor<? extends T>)visitor).visitCompair(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompairContext compair() throws RecognitionException {
		CompairContext _localctx = new CompairContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_compair);
		try {
			setState(206);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(201);
				static_();
				setState(202);
				match(POEQUAlCOMPAIR);
				setState(203);
				static_();
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(205);
				simpleobject();
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u001c\u00d1\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"+
		"\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0003\u0000*\b\u0000\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0005"+
		"\u00012\b\u0001\n\u0001\f\u00015\t\u0001\u0003\u00017\b\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0005\u0002@\b\u0002\n\u0002\f\u0002C\t\u0002\u0003\u0002E\b\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0005\u0003P\b\u0003\n\u0003\f\u0003S\t"+
		"\u0003\u0003\u0003U\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0003\u0004]\b\u0004\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0005\u0005d\b\u0005\n\u0005"+
		"\f\u0005g\t\u0005\u0003\u0005i\b\u0005\u0001\u0005\u0001\u0005\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0005\u0006q\b\u0006\n\u0006\f\u0006"+
		"t\t\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0003\u0007"+
		"z\b\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0003\t\u0084\b\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003\t\u008a"+
		"\b\t\u0005\t\u008c\b\t\n\t\f\t\u008f\t\t\u0003\t\u0091\b\t\u0001\t\u0001"+
		"\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\f\u0001\f\u0003\f\u009f\b\f\u0001\r\u0001\r\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0005\u000f\u00ad\b\u000f\n\u000f"+
		"\f\u000f\u00b0\t\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0005\u000f\u00b7\b\u000f\n\u000f\f\u000f\u00ba\t\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0005\u0010\u00c3\b\u0010\n\u0010\f\u0010\u00c6\t\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0003\u0011\u00cf\b\u0011\u0001\u0011\u0000\u0000\u0012\u0000\u0002\u0004"+
		"\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \""+
		"\u0000\u0000\u00d9\u0000)\u0001\u0000\u0000\u0000\u0002+\u0001\u0000\u0000"+
		"\u0000\u0004:\u0001\u0000\u0000\u0000\u0006T\u0001\u0000\u0000\u0000\b"+
		"\\\u0001\u0000\u0000\u0000\n^\u0001\u0000\u0000\u0000\fl\u0001\u0000\u0000"+
		"\u0000\u000ew\u0001\u0000\u0000\u0000\u0010}\u0001\u0000\u0000\u0000\u0012"+
		"\u007f\u0001\u0000\u0000\u0000\u0014\u0094\u0001\u0000\u0000\u0000\u0016"+
		"\u0098\u0001\u0000\u0000\u0000\u0018\u009e\u0001\u0000\u0000\u0000\u001a"+
		"\u00a0\u0001\u0000\u0000\u0000\u001c\u00a2\u0001\u0000\u0000\u0000\u001e"+
		"\u00a7\u0001\u0000\u0000\u0000 \u00bd\u0001\u0000\u0000\u0000\"\u00ce"+
		"\u0001\u0000\u0000\u0000$%\u0005\u0001\u0000\u0000%&\u0005\u0002\u0000"+
		"\u0000&\'\u0003\u0002\u0001\u0000\'(\u0005\u0005\u0000\u0000(*\u0001\u0000"+
		"\u0000\u0000)$\u0001\u0000\u0000\u0000)*\u0001\u0000\u0000\u0000*\u0001"+
		"\u0001\u0000\u0000\u0000+,\u0005\u0006\u0000\u0000,-\u0005\u0007\u0000"+
		"\u0000-6\u0005\b\u0000\u0000.3\u0003\u0004\u0002\u0000/0\u0005\u0012\u0000"+
		"\u000002\u0003\u0004\u0002\u00001/\u0001\u0000\u0000\u000025\u0001\u0000"+
		"\u0000\u000031\u0001\u0000\u0000\u000034\u0001\u0000\u0000\u000047\u0001"+
		"\u0000\u0000\u000053\u0001\u0000\u0000\u00006.\u0001\u0000\u0000\u0000"+
		"67\u0001\u0000\u0000\u000078\u0001\u0000\u0000\u000089\u0005\u000f\u0000"+
		"\u00009\u0003\u0001\u0000\u0000\u0000:;\u0005\u0013\u0000\u0000;D\u0005"+
		"\u0011\u0000\u0000<A\u0003\u0006\u0003\u0000=>\u0005\f\u0000\u0000>@\u0003"+
		"\u0006\u0003\u0000?=\u0001\u0000\u0000\u0000@C\u0001\u0000\u0000\u0000"+
		"A?\u0001\u0000\u0000\u0000AB\u0001\u0000\u0000\u0000BE\u0001\u0000\u0000"+
		"\u0000CA\u0001\u0000\u0000\u0000D<\u0001\u0000\u0000\u0000DE\u0001\u0000"+
		"\u0000\u0000EF\u0001\u0000\u0000\u0000FG\u0005\u0005\u0000\u0000G\u0005"+
		"\u0001\u0000\u0000\u0000HI\u0005\u0006\u0000\u0000IJ\u0005\u0007\u0000"+
		"\u0000JQ\u0003\b\u0004\u0000KL\u0005\f\u0000\u0000LM\u0005\u0006\u0000"+
		"\u0000MN\u0005\u0007\u0000\u0000NP\u0003\b\u0004\u0000OK\u0001\u0000\u0000"+
		"\u0000PS\u0001\u0000\u0000\u0000QO\u0001\u0000\u0000\u0000QR\u0001\u0000"+
		"\u0000\u0000RU\u0001\u0000\u0000\u0000SQ\u0001\u0000\u0000\u0000TH\u0001"+
		"\u0000\u0000\u0000TU\u0001\u0000\u0000\u0000U\u0007\u0001\u0000\u0000"+
		"\u0000V]\u0003\n\u0005\u0000W]\u0003\f\u0006\u0000X]\u0003\u000e\u0007"+
		"\u0000Y]\u0003\u0010\b\u0000Z]\u0003\u0012\t\u0000[]\u0003\u0014\n\u0000"+
		"\\V\u0001\u0000\u0000\u0000\\W\u0001\u0000\u0000\u0000\\X\u0001\u0000"+
		"\u0000\u0000\\Y\u0001\u0000\u0000\u0000\\Z\u0001\u0000\u0000\u0000\\["+
		"\u0001\u0000\u0000\u0000]\t\u0001\u0000\u0000\u0000^_\u0005\u0006\u0000"+
		"\u0000_h\u0005\t\u0000\u0000`e\u0003\u0006\u0003\u0000ab\u0005\f\u0000"+
		"\u0000bd\u0003\u0006\u0003\u0000ca\u0001\u0000\u0000\u0000dg\u0001\u0000"+
		"\u0000\u0000ec\u0001\u0000\u0000\u0000ef\u0001\u0000\u0000\u0000fi\u0001"+
		"\u0000\u0000\u0000ge\u0001\u0000\u0000\u0000h`\u0001\u0000\u0000\u0000"+
		"hi\u0001\u0000\u0000\u0000ij\u0001\u0000\u0000\u0000jk\u0005\u0005\u0000"+
		"\u0000k\u000b\u0001\u0000\u0000\u0000lm\u0005\t\u0000\u0000mn\u0005\u0005"+
		"\u0000\u0000nr\u0005\n\u0000\u0000oq\u0003\u0018\f\u0000po\u0001\u0000"+
		"\u0000\u0000qt\u0001\u0000\u0000\u0000rp\u0001\u0000\u0000\u0000rs\u0001"+
		"\u0000\u0000\u0000su\u0001\u0000\u0000\u0000tr\u0001\u0000\u0000\u0000"+
		"uv\u0005\u0014\u0000\u0000v\r\u0001\u0000\u0000\u0000wy\u0005\u000b\u0000"+
		"\u0000xz\u0005\u001c\u0000\u0000yx\u0001\u0000\u0000\u0000yz\u0001\u0000"+
		"\u0000\u0000z{\u0001\u0000\u0000\u0000{|\u0005\u001b\u0000\u0000|\u000f"+
		"\u0001\u0000\u0000\u0000}~\u0005\u000e\u0000\u0000~\u0011\u0001\u0000"+
		"\u0000\u0000\u007f\u0090\u0005\b\u0000\u0000\u0080\u0084\u0003\u0004\u0002"+
		"\u0000\u0081\u0084\u0003\n\u0005\u0000\u0082\u0084\u0003\u0016\u000b\u0000"+
		"\u0083\u0080\u0001\u0000\u0000\u0000\u0083\u0081\u0001\u0000\u0000\u0000"+
		"\u0083\u0082\u0001\u0000\u0000\u0000\u0084\u008d\u0001\u0000\u0000\u0000"+
		"\u0085\u0089\u0005\u0012\u0000\u0000\u0086\u008a\u0003\u0004\u0002\u0000"+
		"\u0087\u008a\u0003\n\u0005\u0000\u0088\u008a\u0003\u0016\u000b\u0000\u0089"+
		"\u0086\u0001\u0000\u0000\u0000\u0089\u0087\u0001\u0000\u0000\u0000\u0089"+
		"\u0088\u0001\u0000\u0000\u0000\u008a\u008c\u0001\u0000\u0000\u0000\u008b"+
		"\u0085\u0001\u0000\u0000\u0000\u008c\u008f\u0001\u0000\u0000\u0000\u008d"+
		"\u008b\u0001\u0000\u0000\u0000\u008d\u008e\u0001\u0000\u0000\u0000\u008e"+
		"\u0091\u0001\u0000\u0000\u0000\u008f\u008d\u0001\u0000\u0000\u0000\u0090"+
		"\u0083\u0001\u0000\u0000\u0000\u0090\u0091\u0001\u0000\u0000\u0000\u0091"+
		"\u0092\u0001\u0000\u0000\u0000\u0092\u0093\u0005\u000f\u0000\u0000\u0093"+
		"\u0013\u0001\u0000\u0000\u0000\u0094\u0095\u0005\u0006\u0000\u0000\u0095"+
		"\u0096\u0005\r\u0000\u0000\u0096\u0097\u0005\u0006\u0000\u0000\u0097\u0015"+
		"\u0001\u0000\u0000\u0000\u0098\u0099\u0005\u0010\u0000\u0000\u0099\u009a"+
		"\u0005\u001c\u0000\u0000\u009a\u009b\u0005\u001b\u0000\u0000\u009b\u0017"+
		"\u0001\u0000\u0000\u0000\u009c\u009f\u0003\u001e\u000f\u0000\u009d\u009f"+
		"\u0003\u001a\r\u0000\u009e\u009c\u0001\u0000\u0000\u0000\u009e\u009d\u0001"+
		"\u0000\u0000\u0000\u009f\u0019\u0001\u0000\u0000\u0000\u00a0\u00a1\u0003"+
		"\u001c\u000e\u0000\u00a1\u001b\u0001\u0000\u0000\u0000\u00a2\u00a3\u0005"+
		"\u001a\u0000\u0000\u00a3\u00a4\u0005\u0019\u0000\u0000\u00a4\u00a5\u0003"+
		" \u0010\u0000\u00a5\u00a6\u0005\u0018\u0000\u0000\u00a6\u001d\u0001\u0000"+
		"\u0000\u0000\u00a7\u00a8\u0005\u0017\u0000\u0000\u00a8\u00a9\u0005\u0015"+
		"\u0000\u0000\u00a9\u00ae\u0003\"\u0011\u0000\u00aa\u00ab\u0005\u0004\u0000"+
		"\u0000\u00ab\u00ad\u0003\"\u0011\u0000\u00ac\u00aa\u0001\u0000\u0000\u0000"+
		"\u00ad\u00b0\u0001\u0000\u0000\u0000\u00ae\u00ac\u0001\u0000\u0000\u0000"+
		"\u00ae\u00af\u0001\u0000\u0000\u0000\u00af\u00b1\u0001\u0000\u0000\u0000"+
		"\u00b0\u00ae\u0001\u0000\u0000\u0000\u00b1\u00b2\u0005\u0005\u0000\u0000"+
		"\u00b2\u00b8\u0005\u0016\u0000\u0000\u00b3\u00b4\u0003 \u0010\u0000\u00b4"+
		"\u00b5\u0005\u0018\u0000\u0000\u00b5\u00b7\u0001\u0000\u0000\u0000\u00b6"+
		"\u00b3\u0001\u0000\u0000\u0000\u00b7\u00ba\u0001\u0000\u0000\u0000\u00b8"+
		"\u00b6\u0001\u0000\u0000\u0000\u00b8\u00b9\u0001\u0000\u0000\u0000\u00b9"+
		"\u00bb\u0001\u0000\u0000\u0000\u00ba\u00b8\u0001\u0000\u0000\u0000\u00bb"+
		"\u00bc\u0005\u0014\u0000\u0000\u00bc\u001f\u0001\u0000\u0000\u0000\u00bd"+
		"\u00be\u0005\u001a\u0000\u0000\u00be\u00bf\u0005\u0015\u0000\u0000\u00bf"+
		"\u00c4\u0003\u0006\u0003\u0000\u00c0\u00c1\u0005\f\u0000\u0000\u00c1\u00c3"+
		"\u0003\u0006\u0003\u0000\u00c2\u00c0\u0001\u0000\u0000\u0000\u00c3\u00c6"+
		"\u0001\u0000\u0000\u0000\u00c4\u00c2\u0001\u0000\u0000\u0000\u00c4\u00c5"+
		"\u0001\u0000\u0000\u0000\u00c5\u00c7\u0001\u0000\u0000\u0000\u00c6\u00c4"+
		"\u0001\u0000\u0000\u0000\u00c7\u00c8\u0005\u0005\u0000\u0000\u00c8!\u0001"+
		"\u0000\u0000\u0000\u00c9\u00ca\u0003\u0014\n\u0000\u00ca\u00cb\u0005\u0003"+
		"\u0000\u0000\u00cb\u00cc\u0003\u0014\n\u0000\u00cc\u00cf\u0001\u0000\u0000"+
		"\u0000\u00cd\u00cf\u0003\n\u0005\u0000\u00ce\u00c9\u0001\u0000\u0000\u0000"+
		"\u00ce\u00cd\u0001\u0000\u0000\u0000\u00cf#\u0001\u0000\u0000\u0000\u0015"+
		")36ADQT\\ehry\u0083\u0089\u008d\u0090\u009e\u00ae\u00b8\u00c4\u00ce";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}