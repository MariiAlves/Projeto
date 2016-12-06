package com.example.anair.nutrihelp.model;

/**
 * Created by anair on 11/11/2016.
 */

public class DadosIniciais {

    private int altura;
    private int peso;
    private enum objetivos{perderPeso, manterPeso, aumentarPeso};

    public DadosIniciais(int altura, int peso, String objetivos) {
        this.altura = altura;
        this.peso = peso;
        objetivos = objetivos;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(altura).append('\'');
        sb.append(peso).append('\'');
        return sb.toString();
    }
}
