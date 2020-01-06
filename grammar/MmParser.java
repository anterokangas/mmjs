// Generated from MmParser.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MmParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		Comment=1, WS=2, CommandStart=3, Text=4, CommandWS=5, Role=6, RoleCommandWS=7, 
		RoleName=8, RoleParameterStart=9, RolePitch=10, RoleCommandEnd=11, IntegerWS=12, 
		Integer=13, IntegerParameterEnd=14;
	public static final int
		RULE_mm = 0, RULE_part = 1, RULE_command = 2, RULE_roleCommand = 3, RULE_roleParameters = 4, 
		RULE_roleParameter = 5;
	private static String[] makeRuleNames() {
		return new String[] {
			"mm", "part", "command", "roleCommand", "roleParameters", "roleParameter"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, "'Role'", null, null, null, "'pitch'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "Comment", "WS", "CommandStart", "Text", "CommandWS", "Role", "RoleCommandWS", 
			"RoleName", "RoleParameterStart", "RolePitch", "RoleCommandEnd", "IntegerWS", 
			"Integer", "IntegerParameterEnd"
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
	public String getGrammarFileName() { return "MmParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MmParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class MmContext extends ParserRuleContext {
		public List<PartContext> part() {
			return getRuleContexts(PartContext.class);
		}
		public PartContext part(int i) {
			return getRuleContext(PartContext.class,i);
		}
		public MmContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MmParserListener ) ((MmParserListener)listener).enterMm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MmParserListener ) ((MmParserListener)listener).exitMm(this);
		}
	}

	public final MmContext mm() throws RecognitionException {
		MmContext _localctx = new MmContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_mm);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(15);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CommandStart || _la==Text) {
				{
				{
				setState(12);
				part();
				}
				}
				setState(17);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class PartContext extends ParserRuleContext {
		public TerminalNode Text() { return getToken(MmParser.Text, 0); }
		public CommandContext command() {
			return getRuleContext(CommandContext.class,0);
		}
		public PartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_part; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MmParserListener ) ((MmParserListener)listener).enterPart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MmParserListener ) ((MmParserListener)listener).exitPart(this);
		}
	}

	public final PartContext part() throws RecognitionException {
		PartContext _localctx = new PartContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_part);
		try {
			setState(20);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Text:
				enterOuterAlt(_localctx, 1);
				{
				setState(18);
				match(Text);
				}
				break;
			case CommandStart:
				enterOuterAlt(_localctx, 2);
				{
				setState(19);
				command();
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

	public static class CommandContext extends ParserRuleContext {
		public TerminalNode CommandStart() { return getToken(MmParser.CommandStart, 0); }
		public RoleCommandContext roleCommand() {
			return getRuleContext(RoleCommandContext.class,0);
		}
		public CommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_command; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MmParserListener ) ((MmParserListener)listener).enterCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MmParserListener ) ((MmParserListener)listener).exitCommand(this);
		}
	}

	public final CommandContext command() throws RecognitionException {
		CommandContext _localctx = new CommandContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_command);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(22);
			match(CommandStart);
			{
			setState(23);
			roleCommand();
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

	public static class RoleCommandContext extends ParserRuleContext {
		public TerminalNode Role() { return getToken(MmParser.Role, 0); }
		public TerminalNode RoleName() { return getToken(MmParser.RoleName, 0); }
		public RoleParametersContext roleParameters() {
			return getRuleContext(RoleParametersContext.class,0);
		}
		public TerminalNode RoleCommandEnd() { return getToken(MmParser.RoleCommandEnd, 0); }
		public RoleCommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_roleCommand; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MmParserListener ) ((MmParserListener)listener).enterRoleCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MmParserListener ) ((MmParserListener)listener).exitRoleCommand(this);
		}
	}

	public final RoleCommandContext roleCommand() throws RecognitionException {
		RoleCommandContext _localctx = new RoleCommandContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_roleCommand);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(25);
			match(Role);
			setState(26);
			match(RoleName);
			setState(27);
			roleParameters();
			setState(28);
			match(RoleCommandEnd);
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

	public static class RoleParametersContext extends ParserRuleContext {
		public List<RoleParameterContext> roleParameter() {
			return getRuleContexts(RoleParameterContext.class);
		}
		public RoleParameterContext roleParameter(int i) {
			return getRuleContext(RoleParameterContext.class,i);
		}
		public RoleParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_roleParameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MmParserListener ) ((MmParserListener)listener).enterRoleParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MmParserListener ) ((MmParserListener)listener).exitRoleParameters(this);
		}
	}

	public final RoleParametersContext roleParameters() throws RecognitionException {
		RoleParametersContext _localctx = new RoleParametersContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_roleParameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(33);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==RoleParameterStart) {
				{
				{
				setState(30);
				roleParameter();
				}
				}
				setState(35);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class RoleParameterContext extends ParserRuleContext {
		public TerminalNode RoleParameterStart() { return getToken(MmParser.RoleParameterStart, 0); }
		public TerminalNode RolePitch() { return getToken(MmParser.RolePitch, 0); }
		public TerminalNode Integer() { return getToken(MmParser.Integer, 0); }
		public TerminalNode IntegerParameterEnd() { return getToken(MmParser.IntegerParameterEnd, 0); }
		public RoleParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_roleParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MmParserListener ) ((MmParserListener)listener).enterRoleParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MmParserListener ) ((MmParserListener)listener).exitRoleParameter(this);
		}
	}

	public final RoleParameterContext roleParameter() throws RecognitionException {
		RoleParameterContext _localctx = new RoleParameterContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_roleParameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(36);
			match(RoleParameterStart);
			{
			setState(37);
			match(RolePitch);
			setState(38);
			match(Integer);
			setState(39);
			match(IntegerParameterEnd);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\20,\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\3\2\7\2\20\n\2\f\2\16\2\23\13\2\3\3"+
		"\3\3\5\3\27\n\3\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\7\6\"\n\6\f\6\16\6"+
		"%\13\6\3\7\3\7\3\7\3\7\3\7\3\7\2\2\b\2\4\6\b\n\f\2\2\2(\2\21\3\2\2\2\4"+
		"\26\3\2\2\2\6\30\3\2\2\2\b\33\3\2\2\2\n#\3\2\2\2\f&\3\2\2\2\16\20\5\4"+
		"\3\2\17\16\3\2\2\2\20\23\3\2\2\2\21\17\3\2\2\2\21\22\3\2\2\2\22\3\3\2"+
		"\2\2\23\21\3\2\2\2\24\27\7\6\2\2\25\27\5\6\4\2\26\24\3\2\2\2\26\25\3\2"+
		"\2\2\27\5\3\2\2\2\30\31\7\5\2\2\31\32\5\b\5\2\32\7\3\2\2\2\33\34\7\b\2"+
		"\2\34\35\7\n\2\2\35\36\5\n\6\2\36\37\7\r\2\2\37\t\3\2\2\2 \"\5\f\7\2!"+
		" \3\2\2\2\"%\3\2\2\2#!\3\2\2\2#$\3\2\2\2$\13\3\2\2\2%#\3\2\2\2&\'\7\13"+
		"\2\2\'(\7\f\2\2()\7\17\2\2)*\7\20\2\2*\r\3\2\2\2\5\21\26#";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}