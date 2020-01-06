// Generated from MmLexer.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MmLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		Comment=1, WS=2, CommandStart=3, Text=4, CommandWS=5, Role=6, RoleCommandWS=7, 
		RoleName=8, RoleParameterStart=9, RolePitch=10, RoleCommandEnd=11, IntegerWS=12, 
		Integer=13, IntegerParameterEnd=14;
	public static final int
		CommandMode=1, RoleCommandMode=2, IntegerParameterMode=3;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE", "CommandMode", "RoleCommandMode", "IntegerParameterMode"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"Comment", "WS", "CommandStart", "Text", "CommandWS", "Role", "RoleCommandWS", 
			"RoleName", "RoleParameterStart", "RolePitch", "RoleCommandEnd", "IntegerWS", 
			"Integer", "IntegerParameterEnd"
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


	public MmLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "MmLexer.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\20u\b\1\b\1\b\1\b"+
		"\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n"+
		"\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\3\2\3\2\3\2\7\2"+
		"\'\n\2\f\2\16\2*\13\2\3\2\3\2\3\2\3\2\3\2\3\3\6\3\62\n\3\r\3\16\3\63\3"+
		"\3\3\3\3\4\3\4\3\4\3\4\3\5\6\5=\n\5\r\5\16\5>\3\6\3\6\3\6\3\6\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\b\6\bM\n\b\r\b\16\bN\3\b\3\b\3\t\3\t\3\n\3\n\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\r\6\rd\n\r\r"+
		"\r\16\re\3\r\3\r\3\16\5\16k\n\16\3\16\6\16n\n\16\r\16\16\16o\3\17\3\17"+
		"\3\17\3\17\3(\2\20\6\3\b\4\n\5\f\6\16\7\20\b\22\t\24\n\26\13\30\f\32\r"+
		"\34\16\36\17 \20\6\2\3\4\5\7\5\2\13\f\17\17\"\"\4\2$$)+\7\2\60\60\62;"+
		"C\\aac|\4\2--//\3\2\62;\2x\2\6\3\2\2\2\2\b\3\2\2\2\2\n\3\2\2\2\2\f\3\2"+
		"\2\2\3\16\3\2\2\2\3\20\3\2\2\2\4\22\3\2\2\2\4\24\3\2\2\2\4\26\3\2\2\2"+
		"\4\30\3\2\2\2\4\32\3\2\2\2\5\34\3\2\2\2\5\36\3\2\2\2\5 \3\2\2\2\6\"\3"+
		"\2\2\2\b\61\3\2\2\2\n\67\3\2\2\2\f<\3\2\2\2\16@\3\2\2\2\20D\3\2\2\2\22"+
		"L\3\2\2\2\24R\3\2\2\2\26T\3\2\2\2\30V\3\2\2\2\32^\3\2\2\2\34c\3\2\2\2"+
		"\36j\3\2\2\2 q\3\2\2\2\"#\7*\2\2#$\7,\2\2$(\3\2\2\2%\'\13\2\2\2&%\3\2"+
		"\2\2\'*\3\2\2\2()\3\2\2\2(&\3\2\2\2)+\3\2\2\2*(\3\2\2\2+,\7,\2\2,-\7+"+
		"\2\2-.\3\2\2\2./\b\2\2\2/\7\3\2\2\2\60\62\t\2\2\2\61\60\3\2\2\2\62\63"+
		"\3\2\2\2\63\61\3\2\2\2\63\64\3\2\2\2\64\65\3\2\2\2\65\66\b\3\2\2\66\t"+
		"\3\2\2\2\678\7*\2\289\3\2\2\29:\b\4\3\2:\13\3\2\2\2;=\n\3\2\2<;\3\2\2"+
		"\2=>\3\2\2\2><\3\2\2\2>?\3\2\2\2?\r\3\2\2\2@A\5\b\3\2AB\3\2\2\2BC\b\6"+
		"\2\2C\17\3\2\2\2DE\7T\2\2EF\7q\2\2FG\7n\2\2GH\7g\2\2HI\3\2\2\2IJ\b\7\4"+
		"\2J\21\3\2\2\2KM\t\2\2\2LK\3\2\2\2MN\3\2\2\2NL\3\2\2\2NO\3\2\2\2OP\3\2"+
		"\2\2PQ\b\b\2\2Q\23\3\2\2\2RS\t\4\2\2S\25\3\2\2\2TU\7*\2\2U\27\3\2\2\2"+
		"VW\7r\2\2WX\7k\2\2XY\7v\2\2YZ\7e\2\2Z[\7j\2\2[\\\3\2\2\2\\]\b\13\5\2]"+
		"\31\3\2\2\2^_\7+\2\2_`\3\2\2\2`a\b\f\6\2a\33\3\2\2\2bd\t\2\2\2cb\3\2\2"+
		"\2de\3\2\2\2ec\3\2\2\2ef\3\2\2\2fg\3\2\2\2gh\b\r\2\2h\35\3\2\2\2ik\t\5"+
		"\2\2ji\3\2\2\2jk\3\2\2\2km\3\2\2\2ln\t\6\2\2ml\3\2\2\2no\3\2\2\2om\3\2"+
		"\2\2op\3\2\2\2p\37\3\2\2\2qr\7+\2\2rs\3\2\2\2st\b\17\6\2t!\3\2\2\2\r\2"+
		"\3\4\5(\63>Nejo\7\b\2\2\7\3\2\4\4\2\7\5\2\6\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}