parser grammar MyParser;

options { tokenVocab= MyLexer; }
//StartApp (  ) from out
startCompielr: ( NAME_VAR PRACETOBJECTOPEN objectsScreens PRACET_OBJECT_CLOSE )?;
// mode ()  , objectScreen grammer in mode []
objectsScreens: PONAME_VAR PODEFINITION PRACET_LIST_OPEN (objectsScreen (PLCOMMA objectsScreen)*)? PRACET_LIST_CLOSE;
// in mode [] , attribute in mode ()
objectsScreen : PLNAME_VAR PLPRACET_OBJECT_OPEN (attribute (POCOMMA attribute)*)?   PRACET_OBJECT_CLOSE;
// in () mode;
attribute : (PONAME_VAR PODEFINITION type(POCOMMA PONAME_VAR PODEFINITION  type)*)?;

type:(simpleobject | function | string | number | list | static);

//simpleobject && function && string && number && list .. in () mode;
// () mode
simpleobject: PONAME_VAR PRACET_OBJECT_INNER_OPEN (attribute (POCOMMA attribute)*)? PRACET_OBJECT_CLOSE;
function: PRACET_OBJECT_INNER_OPEN PRACET_OBJECT_CLOSE PRACET_BODY_OPEN cntr* PRACET_BODY_CLOSE;
string: DOUBLE_QUOTATION_OPEN DQTEXT_STRING? DOUBLE_QUOTATION_CLOSE;
number: PONUMBER;
// in [] mode
list: PRACET_LIST_OPEN ((objectsScreen|simpleobject |stringList) (PLCOMMA (objectsScreen|simpleobject|stringList))*)? PRACET_LIST_CLOSE;
static:PONAME_VAR PODOT PONAME_VAR;

// in [] mode
stringList:PLDOUBLE_QUOTATION_OPEN DQTEXT_STRING DOUBLE_QUOTATION_CLOSE;

// in {} mode
cntr:condition |defineObj ;

defineObj: equalObj;
equalObj: PBNAME_VAR PBEQUAL objectBody PBSQ;

// in {} mode ,compair in () mode
condition: PBIF PBPRACET_OBJECT_INNER_OPEN (compair (PO_AND compair)*) PRACET_OBJECT_CLOSE  PBPRACET_BODY_OPEN (objectBody PBSQ)* PRACET_BODY_CLOSE;

// in {} mode
objectBody: PBNAME_VAR PBPRACET_OBJECT_INNER_OPEN (attribute (POCOMMA attribute)* ) PRACET_OBJECT_CLOSE  ;

//in () mode
compair : (static POEQUAlCOMPAIR static )| (simpleobject);