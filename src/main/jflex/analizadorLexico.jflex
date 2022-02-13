/* Codigo de usuario */
package com.midik.vocalesyenterosjflex.jflex;
import com.midik.vocalesyenterosjflex.backend.Token;

%% /* Opciones, declaraciones y macros */
%class AnalizadorLexico
%unicode
%line
%column
%public
%type Token

LETRA = [a-zA-Z]
NUMERO = [0-9]

ENTERO = ({NUMERO})({NUMERO})*
PALABRA = ({LETRA})({LETRA})*

%% /* Reglas lexicas y acciones */
{ENTERO}    {Token entero = new Token("ENTERO", yytext(), yyline+1, yycolumn+1);
                            return entero;
                      }
{PALABRA}   {Token palabra = new Token("PALABRA", yytext(), yyline+1, yycolumn+1);
                        return palabra;
                       }
[^]                 {}
