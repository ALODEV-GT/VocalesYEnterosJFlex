package com.midik.vocalesyenterosjflex.backend;

public class Token {

    private String tipoToken;
    private String lexema;
    private int numLinea;
    private int numColumna;

    public Token(String tipoToken, String lexema, int numLinea, int numColumna) {
        this.tipoToken = tipoToken;
        this.lexema = lexema;
        this.numLinea = numLinea;
        this.numColumna = numColumna;
    }

    public String getTipoToken() {
        return tipoToken;
    }

    public String getLexema() {
        return lexema;
    }

    public int getNumLinea() {
        return numLinea;
    }

    public int getNumColumna() {
        return numColumna;
    }

    @Override
    public String toString() {
        return this.tipoToken + ": " + this.lexema + " Linea: " + this.numLinea + " Columna: " + this.numColumna + "\n";
    }
}
