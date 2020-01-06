lexer grammar Mm;

Comment : '(*' .*? '*)' -> skip ;

CommandStart : LPAREN -> pushMode(CommandMode) ;
StringStart : ~RPAREN -> pushMode(StringMode) ;

mode DefinitionsMode ;
LPAREN : '(' ;
RPAREN : ')' ;

mode CommandMode;

mode StringMode ;