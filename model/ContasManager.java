package com.example.anair.nutrihelp.model;

import java.util.LinkedList;

/**
 * Created by anair on 19/10/2016.
 */

public enum ContasManager {

    INSTANCE;

    private LinkedList<Conta> contas;

    ContasManager() {
        contas = new LinkedList<>();

    }


    public void add(Conta conta){ contas.add(conta); }

    public boolean remove (Conta conta){ return contas.remove(conta); }

    public Conta get(int index){ return contas.get(index); }

    public Iterable<Conta> getAll(){ return contas; }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        for (Conta conta : contas) {
            sb.append(conta);
        }
        return sb.toString();
    }
}
