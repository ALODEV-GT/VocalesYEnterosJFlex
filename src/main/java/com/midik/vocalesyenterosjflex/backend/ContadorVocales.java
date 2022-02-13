package com.midik.vocalesyenterosjflex.backend;

import javax.swing.JTextArea;

public class ContadorVocales {

    private JTextArea taSalida;
    private int numPalabras1Vocal = 0;
    private int numPalabras2Vocal = 0;
    private int numPalabras3Vocal = 0;
    private int numPalabras4Vocal = 0;
    private int numPalabras5Vocal = 0;

    public ContadorVocales(JTextArea taSalida) {
        this.taSalida = taSalida;
    }
    
    public void evaluarPalabra(String lexema){
        int numVocales = contarVocales(lexema);
        switch(numVocales){
            case 1:
                this.numPalabras1Vocal++;
                break;
            case 2:
                this.numPalabras2Vocal++;
                break;
            case 3:
                this.numPalabras3Vocal++;
                break;
            case 4:
                this.numPalabras4Vocal++;
                break;
            case 5:
                this.numPalabras5Vocal++;
                break;
            default:
                //nada
        }
    }

    private int contarVocales(String palabra) {
        int numVocales = 0;
        char caracter;
        for (int i = 0; i < palabra.length(); i++) {
            caracter = palabra.charAt(i);
            switch (caracter) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    numVocales++;
                default:
                //No hacer nada
            }
        }
        return numVocales;
    }

    public void imprimirContadores(){
        taSalida.append(
                "Palabras con 1 vocal: " + this.numPalabras1Vocal
            + "\nPalabras con 2 vocales: " + this.numPalabras2Vocal
            + "\nPalabras con 3 vocales: " + this.numPalabras3Vocal
            + "\nPalabras con 4 vocales: " + this.numPalabras4Vocal
            + "\nPalabras con 5 vocales: " + this.numPalabras5Vocal + "\n"
        );
    } 
}
