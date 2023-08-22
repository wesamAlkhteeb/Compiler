lexer grammar MyLexer;

NAME_VAR: [_a-zA-Z][[a-zA-Z0-9]* (' '|'\r'? '\n'|'\t')*;
PRACETOBJECTOPEN : '(' (' '|'\r'? '\n'|'\t')* -> pushMode(PRACKET_OBJECT);


mode PRACKET_OBJECT ;
POEQUAlCOMPAIR:'==' (' '|'\r'? '\n'|'\t')*;
PO_AND:'&&' (' '|'\r'? '\n'|'\t')*;
PRACET_OBJECT_CLOSE : ')' (' '|'\r'? '\n'|'\t')* -> popMode;
PONAME_VAR: [_a-zA-Z][a-zA-Z0-9]* (' '|'\r'? '\n'|'\t')*;
PODEFINITION: ':'(' '|'\r'? '\n'|'\t')*;
PRACET_LIST_OPEN : '[' (' '|'\r'? '\n'|'\t')* -> pushMode(PRACKET_LIST);
PRACET_OBJECT_INNER_OPEN : '(' (' '|'\r'? '\n'|'\t')* -> pushMode(PRACKET_OBJECT);
PRACET_BODY_OPEN : '{' (' '|'\r'? '\n'|'\t')* ->  pushMode(PRACKET_BODY);
DOUBLE_QUOTATION_OPEN : '"' (' '|'\r'? '\n'|'\t')* -> pushMode(DoubleQuotation);
POCOMMA : ',' (' '|'\r'? '\n'|'\t')*;
PODOT : '.' (' '|'\r'? '\n'|'\t')*;
PONUMBER : [0-9]+ (' '|'\r'? '\n'|'\t')*;


mode PRACKET_LIST ;
PRACET_LIST_CLOSE : ']' (' '|'\r'? '\n'|'\t')* -> popMode;
PLDOUBLE_QUOTATION_OPEN : ["] (' '|'\r'? '\n'|'\t')* -> pushMode(DoubleQuotation);
PLPRACET_OBJECT_OPEN : '(' (' '|'\r'? '\n'|'\t')* -> pushMode(PRACKET_OBJECT);
PLCOMMA : ',' (' '|'\r'? '\n'|'\t')*;
PLNAME_VAR: [_a-zA-Z][[a-zA-Z0-9]* (' '|'\r'? '\n'|'\t')*;


mode PRACKET_BODY ;
PRACET_BODY_CLOSE : '}' (' '|'\r'? '\n'|'\t')* -> popMode;
PBPRACET_OBJECT_INNER_OPEN : '(' (' '|'\r'? '\n'|'\t')* -> pushMode(PRACKET_OBJECT);
PBPRACET_BODY_OPEN:  '{' (' '|'\r'? '\n'|'\t')* ->  pushMode(PRACKET_BODY);
PBIF:'if' (' '|'\r'? '\n'|'\t')*;
PBSQ: ';' (' '|'\r'? '\n'|'\t')*;
PBEQUAL:'=' (' '|'\r'? '\n'|'\t')*;
PBNAME_VAR: [_a-zA-Z][a-zA-Z0-9]* (' '|'\r'? '\n'|'\t')*;


mode DoubleQuotation;
DOUBLE_QUOTATION_CLOSE : ["] (' '|'\r'? '\n'|'\t')* -> popMode;
DQTEXT_STRING : ~('<'|'{'|','|':'|'"')+;

