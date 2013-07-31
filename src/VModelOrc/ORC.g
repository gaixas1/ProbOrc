grammar ORC;

options {
    output=AST; 
    ASTLabelType=CommonTree;
    
}

tokens {
    IF = 'If';
    LET = '1';
    LP = '(';
    RP = ')';
    OTHER = ';';
    PAR = '|';
    SEL = '!';
    TRUE = 'true';
    FALSE = 'false' ;
}

@header {
    package output;
}
@lexer::header {
    package output;
}


expr : nameExpr^ varList '='! pruExpr ;

pruExpr
	: othExpr ('<'^ (nameVar '<'! | SEL) pruExpr)? ;

othExpr
    	: parExpr (OTHER^ othExpr)? ;
    
parExpr
    : PAR^ num seqExpr
    | seqExpr (PAR^ parExpr)? ;

    
seqExpr 
    : atom ('>'^ nameVar? '>'! seqExpr)? ;


atom 
    : IF^ LP! evalExpr RP!
    | LET^ varList
    | nameSite^ varList
    | LP! pruExpr RP!;



evalExpr : (nameVar | value) (('=' | ('>=') | ('<=')| ('>') | ('<') | ('!='))^ (nameVar | value))? ;

value :  TRUE | FALSE;
varList  : LP^ (nameVar (','! nameVar)*)? RP! ;
nameExpr : UNAME ;
nameSite : UNAME ;
nameVar  : LNAME ;
num  : NUM+ ;

NUM :  DIGIT+ ;
UNAME : UPPER (DIGIT | LOWER | UPPER)*;
LNAME : LOWER (DIGIT | LOWER | UPPER)*;
fragment DIGIT : '0'..'9' ;
fragment LOWER : 'a'..'z' ;
fragment UPPER : 'A'..'Z' ;


WS  :   ( ' '
        | '\t'
        | '\r'
        | '\n'
        ) {$channel=HIDDEN;}
    ;

