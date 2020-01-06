parser grammar MmParser ;

options { tokenVocab=MmLexer ; }

mm : part* ;

part
    : Text
    | command
    ;

command
    : CommandStart
    ( roleCommand
    | callCommand
    ) 
    ;

roleCommand : Role RoleName roleParameters RoleCommandEnd ;

roleParameters : roleParameter* ;

roleParameter
    : RoleParameterStart
    ( RolePitch Integer IntegerParameterEnd
    )
    ;

callCommand : CallName Text* CallCommandEnd ;



