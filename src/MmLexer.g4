lexer grammar Mm;

Comment : '(*' .*? '*)' -> skip ;

CommandStart : LPAREN -> pushMode(CommandMode) ;
StringStart : ~RPAREN -> pushMode(StringMode) ;

mode DefinitionsMode ;
LPAREN : '(' ;
RPAREN : ')' ;
WS : [ \t\r\n]+ ;
Q : ['] ;
QQ : ["] ;
ID : ~(WS | Q | QQ | LPAREN | QPAREN) ;

mode CommandMode;
CommandWS : WS -> skip ; 
Role : 'Role' -> mode(RoleCommandMode) ;

mode RoleCommandMode ;
RoleCommandWS : WS -> skip ;
RoleName : ID ;
RoleParameterStart : LPAREN ;
RolePitch : 'pitch' -> pushMode(IntegerParameterMode) ;
RoleCommandEnd : RPAREN -> popMode ; 


mode StringMode ;
QStringStart : Q -> mode(QStringMode) ;
QQStringStart : QQ -> mode(QQStringMode) ;

mode QStringMode ;
QString : ~Q* ;
QStringEnd : Q -> popMode ;

mode QQStringMode ;
QQString : ~QQ* ;
QQStringEnd : QQ -> popMode ;

mode IntegerParameterMode ;
IntegerWS : WS -> skip ;
Integer : [+\-]?[0-9]+ ;
IntegerEnd : RPAREN -> popMode ;