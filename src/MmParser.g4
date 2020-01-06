parser grammar Mm

options { tokenVocab = MmLexer; }

model : part * ;

part
    : string
    | command
    ;

command
    : CommandStart
    ( roleCommand
    ) 
    ;

roleCommand : Role RoleName roleParameters RoleCommandEnd;

roleParameters : roleParameter* ;

roleParameter
    : RoleParameterStart
    ( RolePitch Integer IntegerEnd
    )
    ;


