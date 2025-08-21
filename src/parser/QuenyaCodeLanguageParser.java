// Generated from QuenyaCodeLanguage.g4 by ANTLR 4.13.2
package parser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class QuenyaCodeLanguageParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, ID=23, INT=24, FLOAT=25, 
		STRING=26, WS=27, SC=28, AC=29, FC=30;
	public static final int
		RULE_program = 0, RULE_statement = 1, RULE_declaration = 2, RULE_assignment = 3, 
		RULE_input = 4, RULE_print = 5, RULE_ifStatement = 6, RULE_whileStatement = 7, 
		RULE_doWhileStatement = 8, RULE_condition = 9, RULE_expression = 10, RULE_mathOp = 11, 
		RULE_relationalOp = 12, RULE_type = 13;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "statement", "declaration", "assignment", "input", "print", 
			"ifStatement", "whileStatement", "doWhileStatement", "condition", "expression", 
			"mathOp", "relationalOp", "type"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'yesta'", "'metta'", "'harya'", "'tulta'", "'-'", "'tanc\\u00EB'", 
			"'='", "'n\\u00E1'", "'sand\\u00EB'", "'l\\u00E1'", "'\\u00FAri\\u00EB'", 
			"'car\\u00EB'", "'yo'", "'nac'", "'etya'", "'h\\u00FAta'", "'hauta'", 
			"'nanca'", "'ve'", "'\\u00FAv\\u00EBa'", "'n\\u00F3r\\u00EBa'", "'l\\u00FAm\\u00EBa'", 
			null, null, null, null, null, "'::'", "'<'", "'>'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, "ID", 
			"INT", "FLOAT", "STRING", "WS", "SC", "AC", "FC"
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
	public String getGrammarFileName() { return "QuenyaCodeLanguage.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public QuenyaCodeLanguageParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuenyaCodeLanguageListener ) ((QuenyaCodeLanguageListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuenyaCodeLanguageListener ) ((QuenyaCodeLanguageListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuenyaCodeLanguageVisitor ) return ((QuenyaCodeLanguageVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(28);
			match(T__0);
			setState(32);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 14686528L) != 0)) {
				{
				{
				setState(29);
				statement();
				}
				}
				setState(34);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(35);
			match(T__1);
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

	@SuppressWarnings("CheckReturnValue")
	public static class StatementContext extends ParserRuleContext {
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public InputContext input() {
			return getRuleContext(InputContext.class,0);
		}
		public PrintContext print() {
			return getRuleContext(PrintContext.class,0);
		}
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public WhileStatementContext whileStatement() {
			return getRuleContext(WhileStatementContext.class,0);
		}
		public DoWhileStatementContext doWhileStatement() {
			return getRuleContext(DoWhileStatementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuenyaCodeLanguageListener ) ((QuenyaCodeLanguageListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuenyaCodeLanguageListener ) ((QuenyaCodeLanguageListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuenyaCodeLanguageVisitor ) return ((QuenyaCodeLanguageVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			setState(44);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(37);
				declaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(38);
				assignment();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(39);
				input();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(40);
				print();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(41);
				ifStatement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(42);
				whileStatement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(43);
				doWhileStatement();
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

	@SuppressWarnings("CheckReturnValue")
	public static class DeclarationContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(QuenyaCodeLanguageParser.ID, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SC() { return getToken(QuenyaCodeLanguageParser.SC, 0); }
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuenyaCodeLanguageListener ) ((QuenyaCodeLanguageListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuenyaCodeLanguageListener ) ((QuenyaCodeLanguageListener)listener).exitDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuenyaCodeLanguageVisitor ) return ((QuenyaCodeLanguageVisitor<? extends T>)visitor).visitDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(46);
			type();
			setState(47);
			match(ID);
			setState(48);
			match(T__2);
			setState(49);
			expression(0);
			setState(50);
			match(SC);
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

	@SuppressWarnings("CheckReturnValue")
	public static class AssignmentContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(QuenyaCodeLanguageParser.ID, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SC() { return getToken(QuenyaCodeLanguageParser.SC, 0); }
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuenyaCodeLanguageListener ) ((QuenyaCodeLanguageListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuenyaCodeLanguageListener ) ((QuenyaCodeLanguageListener)listener).exitAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuenyaCodeLanguageVisitor ) return ((QuenyaCodeLanguageVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52);
			match(ID);
			setState(53);
			match(T__2);
			setState(54);
			expression(0);
			setState(55);
			match(SC);
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

	@SuppressWarnings("CheckReturnValue")
	public static class InputContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(QuenyaCodeLanguageParser.ID, 0); }
		public TerminalNode STRING() { return getToken(QuenyaCodeLanguageParser.STRING, 0); }
		public TerminalNode SC() { return getToken(QuenyaCodeLanguageParser.SC, 0); }
		public InputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_input; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuenyaCodeLanguageListener ) ((QuenyaCodeLanguageListener)listener).enterInput(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuenyaCodeLanguageListener ) ((QuenyaCodeLanguageListener)listener).exitInput(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuenyaCodeLanguageVisitor ) return ((QuenyaCodeLanguageVisitor<? extends T>)visitor).visitInput(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InputContext input() throws RecognitionException {
		InputContext _localctx = new InputContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_input);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(57);
			type();
			setState(58);
			match(ID);
			setState(59);
			match(T__3);
			setState(60);
			match(T__4);
			setState(61);
			match(STRING);
			setState(62);
			match(T__4);
			setState(63);
			match(SC);
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

	@SuppressWarnings("CheckReturnValue")
	public static class PrintContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(QuenyaCodeLanguageParser.STRING, 0); }
		public TerminalNode SC() { return getToken(QuenyaCodeLanguageParser.SC, 0); }
		public TerminalNode ID() { return getToken(QuenyaCodeLanguageParser.ID, 0); }
		public PrintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuenyaCodeLanguageListener ) ((QuenyaCodeLanguageListener)listener).enterPrint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuenyaCodeLanguageListener ) ((QuenyaCodeLanguageListener)listener).exitPrint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuenyaCodeLanguageVisitor ) return ((QuenyaCodeLanguageVisitor<? extends T>)visitor).visitPrint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintContext print() throws RecognitionException {
		PrintContext _localctx = new PrintContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_print);
		try {
			setState(75);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(65);
				match(T__5);
				setState(66);
				match(T__4);
				setState(67);
				match(STRING);
				setState(68);
				match(T__4);
				setState(69);
				match(SC);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(70);
				match(T__5);
				setState(71);
				match(T__4);
				setState(72);
				match(ID);
				setState(73);
				match(T__6);
				setState(74);
				match(SC);
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

	@SuppressWarnings("CheckReturnValue")
	public static class IfStatementContext extends ParserRuleContext {
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public List<TerminalNode> AC() { return getTokens(QuenyaCodeLanguageParser.AC); }
		public TerminalNode AC(int i) {
			return getToken(QuenyaCodeLanguageParser.AC, i);
		}
		public List<TerminalNode> FC() { return getTokens(QuenyaCodeLanguageParser.FC); }
		public TerminalNode FC(int i) {
			return getToken(QuenyaCodeLanguageParser.FC, i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuenyaCodeLanguageListener ) ((QuenyaCodeLanguageListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuenyaCodeLanguageListener ) ((QuenyaCodeLanguageListener)listener).exitIfStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuenyaCodeLanguageVisitor ) return ((QuenyaCodeLanguageVisitor<? extends T>)visitor).visitIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_ifStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
			match(T__7);
			setState(78);
			match(T__8);
			setState(79);
			condition();
			setState(80);
			match(AC);
			setState(84);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 14686528L) != 0)) {
				{
				{
				setState(81);
				statement();
				}
				}
				setState(86);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(87);
			match(FC);
			setState(98);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__9) {
				{
				setState(88);
				match(T__9);
				setState(89);
				match(T__8);
				setState(90);
				match(AC);
				setState(94);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 14686528L) != 0)) {
					{
					{
					setState(91);
					statement();
					}
					}
					setState(96);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(97);
				match(FC);
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

	@SuppressWarnings("CheckReturnValue")
	public static class WhileStatementContext extends ParserRuleContext {
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode AC() { return getToken(QuenyaCodeLanguageParser.AC, 0); }
		public TerminalNode FC() { return getToken(QuenyaCodeLanguageParser.FC, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public WhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuenyaCodeLanguageListener ) ((QuenyaCodeLanguageListener)listener).enterWhileStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuenyaCodeLanguageListener ) ((QuenyaCodeLanguageListener)listener).exitWhileStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuenyaCodeLanguageVisitor ) return ((QuenyaCodeLanguageVisitor<? extends T>)visitor).visitWhileStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileStatementContext whileStatement() throws RecognitionException {
		WhileStatementContext _localctx = new WhileStatementContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_whileStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
			match(T__10);
			setState(101);
			match(T__8);
			setState(102);
			condition();
			setState(103);
			match(AC);
			setState(107);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 14686528L) != 0)) {
				{
				{
				setState(104);
				statement();
				}
				}
				setState(109);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(110);
			match(FC);
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

	@SuppressWarnings("CheckReturnValue")
	public static class DoWhileStatementContext extends ParserRuleContext {
		public TerminalNode AC() { return getToken(QuenyaCodeLanguageParser.AC, 0); }
		public TerminalNode FC() { return getToken(QuenyaCodeLanguageParser.FC, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode SC() { return getToken(QuenyaCodeLanguageParser.SC, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public DoWhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_doWhileStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuenyaCodeLanguageListener ) ((QuenyaCodeLanguageListener)listener).enterDoWhileStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuenyaCodeLanguageListener ) ((QuenyaCodeLanguageListener)listener).exitDoWhileStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuenyaCodeLanguageVisitor ) return ((QuenyaCodeLanguageVisitor<? extends T>)visitor).visitDoWhileStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DoWhileStatementContext doWhileStatement() throws RecognitionException {
		DoWhileStatementContext _localctx = new DoWhileStatementContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_doWhileStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			match(T__11);
			setState(113);
			match(T__10);
			setState(114);
			match(AC);
			setState(118);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 14686528L) != 0)) {
				{
				{
				setState(115);
				statement();
				}
				}
				setState(120);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(121);
			match(FC);
			setState(122);
			match(T__10);
			setState(123);
			match(T__8);
			setState(124);
			condition();
			setState(125);
			match(SC);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ConditionContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public RelationalOpContext relationalOp() {
			return getRuleContext(RelationalOpContext.class,0);
		}
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuenyaCodeLanguageListener ) ((QuenyaCodeLanguageListener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuenyaCodeLanguageListener ) ((QuenyaCodeLanguageListener)listener).exitCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuenyaCodeLanguageVisitor ) return ((QuenyaCodeLanguageVisitor<? extends T>)visitor).visitCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_condition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			expression(0);
			setState(128);
			relationalOp();
			setState(129);
			expression(0);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(QuenyaCodeLanguageParser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(QuenyaCodeLanguageParser.FLOAT, 0); }
		public TerminalNode ID() { return getToken(QuenyaCodeLanguageParser.ID, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public MathOpContext mathOp() {
			return getRuleContext(MathOpContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuenyaCodeLanguageListener ) ((QuenyaCodeLanguageListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuenyaCodeLanguageListener ) ((QuenyaCodeLanguageListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuenyaCodeLanguageVisitor ) return ((QuenyaCodeLanguageVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 20;
		enterRecursionRule(_localctx, 20, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				{
				setState(132);
				match(INT);
				}
				break;
			case FLOAT:
				{
				setState(133);
				match(FLOAT);
				}
				break;
			case ID:
				{
				setState(134);
				match(ID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(143);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expression);
					setState(137);
					if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
					setState(138);
					mathOp();
					setState(139);
					expression(5);
					}
					} 
				}
				setState(145);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MathOpContext extends ParserRuleContext {
		public MathOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mathOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuenyaCodeLanguageListener ) ((QuenyaCodeLanguageListener)listener).enterMathOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuenyaCodeLanguageListener ) ((QuenyaCodeLanguageListener)listener).exitMathOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuenyaCodeLanguageVisitor ) return ((QuenyaCodeLanguageVisitor<? extends T>)visitor).visitMathOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MathOpContext mathOp() throws RecognitionException {
		MathOpContext _localctx = new MathOpContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_mathOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(146);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 122880L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	@SuppressWarnings("CheckReturnValue")
	public static class RelationalOpContext extends ParserRuleContext {
		public RelationalOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationalOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuenyaCodeLanguageListener ) ((QuenyaCodeLanguageListener)listener).enterRelationalOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuenyaCodeLanguageListener ) ((QuenyaCodeLanguageListener)listener).exitRelationalOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuenyaCodeLanguageVisitor ) return ((QuenyaCodeLanguageVisitor<? extends T>)visitor).visitRelationalOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelationalOpContext relationalOp() throws RecognitionException {
		RelationalOpContext _localctx = new RelationalOpContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_relationalOp);
		try {
			setState(156);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(148);
				match(T__16);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(149);
				match(T__17);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(150);
				match(T__18);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(151);
				match(T__19);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(152);
				match(T__16);
				setState(153);
				match(T__18);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(154);
				match(T__17);
				setState(155);
				match(T__18);
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

	@SuppressWarnings("CheckReturnValue")
	public static class TypeContext extends ParserRuleContext {
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuenyaCodeLanguageListener ) ((QuenyaCodeLanguageListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuenyaCodeLanguageListener ) ((QuenyaCodeLanguageListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuenyaCodeLanguageVisitor ) return ((QuenyaCodeLanguageVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			_la = _input.LA(1);
			if ( !(_la==T__20 || _la==T__21) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 10:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u001e\u00a1\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0001\u0000\u0001\u0000\u0005\u0000\u001f"+
		"\b\u0000\n\u0000\f\u0000\"\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0003\u0001-\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0003\u0005L\b\u0005\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0005\u0006S\b\u0006\n\u0006\f\u0006V\t\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0005\u0006"+
		"]\b\u0006\n\u0006\f\u0006`\t\u0006\u0001\u0006\u0003\u0006c\b\u0006\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0005\u0007j\b"+
		"\u0007\n\u0007\f\u0007m\t\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0005\bu\b\b\n\b\f\bx\t\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0003\n\u0088\b\n\u0001\n\u0001\n\u0001\n\u0001\n\u0005\n\u008e"+
		"\b\n\n\n\f\n\u0091\t\n\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f"+
		"\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0003\f\u009d\b\f\u0001\r\u0001"+
		"\r\u0001\r\u0000\u0001\u0014\u000e\u0000\u0002\u0004\u0006\b\n\f\u000e"+
		"\u0010\u0012\u0014\u0016\u0018\u001a\u0000\u0002\u0001\u0000\r\u0010\u0001"+
		"\u0000\u0015\u0016\u00a7\u0000\u001c\u0001\u0000\u0000\u0000\u0002,\u0001"+
		"\u0000\u0000\u0000\u0004.\u0001\u0000\u0000\u0000\u00064\u0001\u0000\u0000"+
		"\u0000\b9\u0001\u0000\u0000\u0000\nK\u0001\u0000\u0000\u0000\fM\u0001"+
		"\u0000\u0000\u0000\u000ed\u0001\u0000\u0000\u0000\u0010p\u0001\u0000\u0000"+
		"\u0000\u0012\u007f\u0001\u0000\u0000\u0000\u0014\u0087\u0001\u0000\u0000"+
		"\u0000\u0016\u0092\u0001\u0000\u0000\u0000\u0018\u009c\u0001\u0000\u0000"+
		"\u0000\u001a\u009e\u0001\u0000\u0000\u0000\u001c \u0005\u0001\u0000\u0000"+
		"\u001d\u001f\u0003\u0002\u0001\u0000\u001e\u001d\u0001\u0000\u0000\u0000"+
		"\u001f\"\u0001\u0000\u0000\u0000 \u001e\u0001\u0000\u0000\u0000 !\u0001"+
		"\u0000\u0000\u0000!#\u0001\u0000\u0000\u0000\" \u0001\u0000\u0000\u0000"+
		"#$\u0005\u0002\u0000\u0000$\u0001\u0001\u0000\u0000\u0000%-\u0003\u0004"+
		"\u0002\u0000&-\u0003\u0006\u0003\u0000\'-\u0003\b\u0004\u0000(-\u0003"+
		"\n\u0005\u0000)-\u0003\f\u0006\u0000*-\u0003\u000e\u0007\u0000+-\u0003"+
		"\u0010\b\u0000,%\u0001\u0000\u0000\u0000,&\u0001\u0000\u0000\u0000,\'"+
		"\u0001\u0000\u0000\u0000,(\u0001\u0000\u0000\u0000,)\u0001\u0000\u0000"+
		"\u0000,*\u0001\u0000\u0000\u0000,+\u0001\u0000\u0000\u0000-\u0003\u0001"+
		"\u0000\u0000\u0000./\u0003\u001a\r\u0000/0\u0005\u0017\u0000\u000001\u0005"+
		"\u0003\u0000\u000012\u0003\u0014\n\u000023\u0005\u001c\u0000\u00003\u0005"+
		"\u0001\u0000\u0000\u000045\u0005\u0017\u0000\u000056\u0005\u0003\u0000"+
		"\u000067\u0003\u0014\n\u000078\u0005\u001c\u0000\u00008\u0007\u0001\u0000"+
		"\u0000\u00009:\u0003\u001a\r\u0000:;\u0005\u0017\u0000\u0000;<\u0005\u0004"+
		"\u0000\u0000<=\u0005\u0005\u0000\u0000=>\u0005\u001a\u0000\u0000>?\u0005"+
		"\u0005\u0000\u0000?@\u0005\u001c\u0000\u0000@\t\u0001\u0000\u0000\u0000"+
		"AB\u0005\u0006\u0000\u0000BC\u0005\u0005\u0000\u0000CD\u0005\u001a\u0000"+
		"\u0000DE\u0005\u0005\u0000\u0000EL\u0005\u001c\u0000\u0000FG\u0005\u0006"+
		"\u0000\u0000GH\u0005\u0005\u0000\u0000HI\u0005\u0017\u0000\u0000IJ\u0005"+
		"\u0007\u0000\u0000JL\u0005\u001c\u0000\u0000KA\u0001\u0000\u0000\u0000"+
		"KF\u0001\u0000\u0000\u0000L\u000b\u0001\u0000\u0000\u0000MN\u0005\b\u0000"+
		"\u0000NO\u0005\t\u0000\u0000OP\u0003\u0012\t\u0000PT\u0005\u001d\u0000"+
		"\u0000QS\u0003\u0002\u0001\u0000RQ\u0001\u0000\u0000\u0000SV\u0001\u0000"+
		"\u0000\u0000TR\u0001\u0000\u0000\u0000TU\u0001\u0000\u0000\u0000UW\u0001"+
		"\u0000\u0000\u0000VT\u0001\u0000\u0000\u0000Wb\u0005\u001e\u0000\u0000"+
		"XY\u0005\n\u0000\u0000YZ\u0005\t\u0000\u0000Z^\u0005\u001d\u0000\u0000"+
		"[]\u0003\u0002\u0001\u0000\\[\u0001\u0000\u0000\u0000]`\u0001\u0000\u0000"+
		"\u0000^\\\u0001\u0000\u0000\u0000^_\u0001\u0000\u0000\u0000_a\u0001\u0000"+
		"\u0000\u0000`^\u0001\u0000\u0000\u0000ac\u0005\u001e\u0000\u0000bX\u0001"+
		"\u0000\u0000\u0000bc\u0001\u0000\u0000\u0000c\r\u0001\u0000\u0000\u0000"+
		"de\u0005\u000b\u0000\u0000ef\u0005\t\u0000\u0000fg\u0003\u0012\t\u0000"+
		"gk\u0005\u001d\u0000\u0000hj\u0003\u0002\u0001\u0000ih\u0001\u0000\u0000"+
		"\u0000jm\u0001\u0000\u0000\u0000ki\u0001\u0000\u0000\u0000kl\u0001\u0000"+
		"\u0000\u0000ln\u0001\u0000\u0000\u0000mk\u0001\u0000\u0000\u0000no\u0005"+
		"\u001e\u0000\u0000o\u000f\u0001\u0000\u0000\u0000pq\u0005\f\u0000\u0000"+
		"qr\u0005\u000b\u0000\u0000rv\u0005\u001d\u0000\u0000su\u0003\u0002\u0001"+
		"\u0000ts\u0001\u0000\u0000\u0000ux\u0001\u0000\u0000\u0000vt\u0001\u0000"+
		"\u0000\u0000vw\u0001\u0000\u0000\u0000wy\u0001\u0000\u0000\u0000xv\u0001"+
		"\u0000\u0000\u0000yz\u0005\u001e\u0000\u0000z{\u0005\u000b\u0000\u0000"+
		"{|\u0005\t\u0000\u0000|}\u0003\u0012\t\u0000}~\u0005\u001c\u0000\u0000"+
		"~\u0011\u0001\u0000\u0000\u0000\u007f\u0080\u0003\u0014\n\u0000\u0080"+
		"\u0081\u0003\u0018\f\u0000\u0081\u0082\u0003\u0014\n\u0000\u0082\u0013"+
		"\u0001\u0000\u0000\u0000\u0083\u0084\u0006\n\uffff\uffff\u0000\u0084\u0088"+
		"\u0005\u0018\u0000\u0000\u0085\u0088\u0005\u0019\u0000\u0000\u0086\u0088"+
		"\u0005\u0017\u0000\u0000\u0087\u0083\u0001\u0000\u0000\u0000\u0087\u0085"+
		"\u0001\u0000\u0000\u0000\u0087\u0086\u0001\u0000\u0000\u0000\u0088\u008f"+
		"\u0001\u0000\u0000\u0000\u0089\u008a\n\u0004\u0000\u0000\u008a\u008b\u0003"+
		"\u0016\u000b\u0000\u008b\u008c\u0003\u0014\n\u0005\u008c\u008e\u0001\u0000"+
		"\u0000\u0000\u008d\u0089\u0001\u0000\u0000\u0000\u008e\u0091\u0001\u0000"+
		"\u0000\u0000\u008f\u008d\u0001\u0000\u0000\u0000\u008f\u0090\u0001\u0000"+
		"\u0000\u0000\u0090\u0015\u0001\u0000\u0000\u0000\u0091\u008f\u0001\u0000"+
		"\u0000\u0000\u0092\u0093\u0007\u0000\u0000\u0000\u0093\u0017\u0001\u0000"+
		"\u0000\u0000\u0094\u009d\u0005\u0011\u0000\u0000\u0095\u009d\u0005\u0012"+
		"\u0000\u0000\u0096\u009d\u0005\u0013\u0000\u0000\u0097\u009d\u0005\u0014"+
		"\u0000\u0000\u0098\u0099\u0005\u0011\u0000\u0000\u0099\u009d\u0005\u0013"+
		"\u0000\u0000\u009a\u009b\u0005\u0012\u0000\u0000\u009b\u009d\u0005\u0013"+
		"\u0000\u0000\u009c\u0094\u0001\u0000\u0000\u0000\u009c\u0095\u0001\u0000"+
		"\u0000\u0000\u009c\u0096\u0001\u0000\u0000\u0000\u009c\u0097\u0001\u0000"+
		"\u0000\u0000\u009c\u0098\u0001\u0000\u0000\u0000\u009c\u009a\u0001\u0000"+
		"\u0000\u0000\u009d\u0019\u0001\u0000\u0000\u0000\u009e\u009f\u0007\u0001"+
		"\u0000\u0000\u009f\u001b\u0001\u0000\u0000\u0000\u000b ,KT^bkv\u0087\u008f"+
		"\u009c";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}