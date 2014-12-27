//works!!!
grammar ToyLanguage;

@header {
package toyLanguage.gen;
}

program
    :   statementSequence
    ;

statementSequence
    :   statement (';' statement)* ';'*
    ;

statement
    :   expression
    |   booleanExpression
    |   passStatement
    |   ifStatement
    ;

statements
    :   statement
    |   statementBlock
    ;

expression
    :   '-' expression                                        #NegateExpr
    |   <assoc=right> expression op='^' expression            #ExponExpr
    |   <assoc=left>  expression op=('*'|'/'|'%') expression  #MulDivModExpr
    |   <assoc=left>  expression op=('+'|'-') expression      #AddSubExpr
    |   bind                                                  #BindExpr
    |   constant                                              #ConstantExpr
    |   identifier                                            #IdentifierExpr
    |   functionCall                                          #FunctionCallExpr
    |   lambdaFunction                                        #LambdaFunctionExpr
    |   '(' expression ')'                                    #ParensExpr
    ;

statementBlock
    :   '{' statementSequence '}'
    ;

passStatement
    :   'pass'
    ;

ifStatement
    : 'if' booleanExpression 'then' statements ('else' statements)?
    ;

booleanExpression
    :   '!' booleanExpression                                       #NegateBoolExpr
    |   booleanExpression op=('&&'|'||') booleanExpression          #BoolAndOrExpr
    |   expression op=('=='|'!=') expression                        #BoolEqualExpr
    |   expression op=('>='|'<='|'>'|'<') expression                #BoolRelationalExpr
    |   booleanConstant                                             #BoolConst
    |   expression                                                  #BoolExpr
    ;

booleanConstant
    :   'true'
    |   'false'
    ;

bind
    :   identifier '=' expression
    ;

lambdaFunction
    :   lambdaFunctionParameters '=>' statements
    ;

lambdaFunctionParameters
    :   parameter
    |   parenthesizedParameterList
    ;

functionCall
    :   namedFunctionCall
    |   lambdaFunctionCall
    ;

namedFunctionCall
    :   identifier parenthesizedArgumentList
    ;

lambdaFunctionCall
    :   '(' lambdaFunction ')' parenthesizedArgumentList
    ;

parenthesizedParameterList
    :   '(' parameterList? ')'
    ;

parenthesizedArgumentList
    :   '(' argumentList? ')'
    ;

parameter
    :   identifier
    ;

argument
    :   expression
    ;

parameterList
    :   identifier (',' identifier)*
    ;

argumentList
    :   argument (',' argument)?
    ;

constant
    :   NumberConstant
    |   StringLiteral
    ;

identifier
    :   IdentifierNondigit
        (   IdentifierNondigit
        |   Digit
        )*
    ;

NumberConstant
    :   IntegerConstant
    |   FloatingConstant
    ;

IdentifierNondigit
    :   [a-zA-Z_]
    ;

Digit
    :   [0-9]
    ;

fragment
IntegerConstant
    :   DecimalConstant
    ;

fragment
DecimalConstant
    :   NonzeroDigit Digit*
    ;

fragment
NonzeroDigit
    :   [1-9]
    ;

fragment
FloatingConstant
    :   DecimalFloatingConstant
    ;

fragment
DecimalFloatingConstant
    :   FractionalConstant ExponentPart?
    |   DigitSequence ExponentPart
    ;

fragment
FractionalConstant
    :   DigitSequence? '.' DigitSequence
    |   DigitSequence '.'
    ;

fragment
ExponentPart
    :   'e' Sign? DigitSequence
    |   'E' Sign? DigitSequence
    ;

fragment
Sign
    :   '+' | '-'
    ;

fragment
DigitSequence
    :   Digit+
    ;

fragment
EscapeSequence
    :   SimpleEscapeSequence
    ;

fragment
SimpleEscapeSequence
    :   '\\' ['"?abfnrtv\\]
    ;

StringLiteral
    :   '"' SCharSequence? '"'
    ;

fragment
SCharSequence
    :   SChar+
    ;

fragment
SChar
    :   ~["\\\r\n]
    |   EscapeSequence
    ;

Whitespace
    :   [ \t]+
        -> skip
    ;

Newline
    :   (   '\r' '\n'?
        |   '\n'
        )
        -> skip
    ;

BlockComment
    :   '/*' .*? '*/'
        -> skip
    ;

LineComment
    :   '//' ~[\r\n]*
        -> skip
    ;

Comma : ',';
Semi : ';';
Assign : '=';
Arrow : '=>';
LeftParen : '(';
RightParen : ')';
LeftBrace : '{';
RightBrace : '}';
Plus : '+';
Minus : '-';
Star : '*';
Div : '/';
Mod : '%';
Caret : '^';
AndAnd : '&&';
OrOr : '||';
Not : '!';
Equal : '==';
NotEqual : '!=';
Less : '<';
LessEqual : '<=';
Greater : '>';
GreaterEqual : '>=';