/*
BSD License
Copyright (c) 2013, Tom Everett
All rights reserved.
Redistribution and use in source and binary forms, with or without
modification, are permitted provided that the following conditions
are met:
1. Redistributions of source code must retain the above copyright
   notice, this list of conditions and the following disclaimer.
2. Redistributions in binary form must reproduce the above copyright
   notice, this list of conditions and the following disclaimer in the
   documentation and/or other materials provided with the distribution.
3. Neither the name of Tom Everett nor the names of its contributors
   may be used to endorse or promote products derived from this software
   without specific prior written permission.
THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS
"AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT
LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR
A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT
HOLDER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL,
SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT
LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE,
DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY
THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
(INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE
OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
*/

/* For convenience, Grammar is rewote to direct left recursion 
instead of recursive descent */

grammar calculator;

prog:   stat+ ;

stat:   expr NEWLINE                # printExpr
    |   VARIABLE '=' expr NEWLINE   # assign
    |   NEWLINE                     # blank
    ;

expr:   expr op='^' expr            # Power    // Put this first
    |   expr op=('*'|'/') expr      # MulDiv
    |   expr op=('+'|'-') expr      # AddSub
    |   op=('+'|'-') atom           # Signed
    |   atom                        # Atoms
    |   LOG'('expr',' expr')'       # Logarithm
    |   LN'('expr')'	            # NaturalLogarithm
    |   SQRT'('expr')'	            # SquareRoot
    |   SIN'('expr')'		    # Sine
    |   ASIN'('expr')'		    # ASine
    |   COS'('expr')'		    # Cosine
    |   ACOS'('expr')'		    # ACosine
    |   TAN'('expr')'		    # Tangent
    |   ATAN'('expr')'	            # ATangent
 // | I     #ConstantI
    ;

atom
    :   INT                         # Integer
    |   DOUBLE		            # Double
    |   PI                          # ConstantPI
    |   EULER                       # ConstantE
    |   SCIENTIFIC_NUMBER           # Scientific
    |   VARIABLE                    # Variable
    |   LPAREN expr RPAREN          # Braces
    ;

INT  : [0-9]+;

DOUBLE : [0-9]+'.'[0-9]+;


SCIENTIFIC_NUMBER
   : INT+ ((E1 | E2) SIGN? NUMBER)
   ;

COS
   : 'cos'
   ;


SIN
   : 'sin'
   ;


TAN
   : 'tan'
   ;


ACOS
   : 'acos'
   ;


ASIN
   : 'asin'
   ;


ATAN
   : 'atan'
   ;


LN
   : 'ln'
   ;


LOG
   : 'log'
   ;


SQRT
   : 'sqrt'
   ;


LPAREN
   : '('
   ;


RPAREN
   : ')'
   ;


PLUS
   : '+'
   ;


MINUS
   : '-'
   ;


TIMES
   : '*'
   ;


DIV
   : '/'
   ;


GT
   : '>'
   ;


LT
   : '<'
   ;


EQ
   : '='
   ;


COMMA
   : ','
   ;


POINT
   : '.'
   ;


POW
   : '^'
   ;


PI
   : 'pi'
   ;


EULER
   : E2
   ;


I
   : 'i'
   ;


VARIABLE
   : VALID_ID_START VALID_ID_CHAR*
   ;


fragment VALID_ID_START
   : ('a' .. 'z') | ('A' .. 'Z') | '_'
   ;


fragment VALID_ID_CHAR
   : VALID_ID_START | ('0' .. '9')
   ;


NUMBER
   : ('0' .. '9') + ('.' ('0' .. '9') +)?
   ;


fragment E1
   : 'E'
   ;


fragment E2
   : 'e'
   ;


fragment SIGN
   : ('+' | '-')
   ;

NEWLINE:'\r'? '\n' ;     // return newlines to parser (is end-statement signal)

WS
   : [ \r\n\t] + -> skip
   ;
