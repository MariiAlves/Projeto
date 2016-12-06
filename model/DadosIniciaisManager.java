package com.example.anair.nutrihelp.model;

import java.util.LinkedList;

/**
 * Created by anair on 11/11/2016.
 */

public enum DadosIniciaisManager {

    INSTANCE;

    private LinkedList<DadosIniciais> dadosIniciais;

    DadosIniciaisManager() {
        dadosIniciais = new LinkedList<>();
    }

    public void add(DadosIniciais dados){ dadosIniciais.add(dados); }

    public boolean remove (DadosIniciais dados){ return dadosIniciais.remove(dados); }

    public DadosIniciais get(int index){ return dadosIniciais.get(index); }

    public Iterable<DadosIniciais> getAll(){ return dadosIniciais; }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        for (DadosIniciais dados : dadosIniciais) {
            sb.append(dados);
        }
        return sb.toString();
    }
}
