parser grammar Mm

options { tokenVocab = MmLexer; }

model : part * ;

part
    : string
    | command
    ;
