package com.example.anair.nutrihelp.model;

import java.util.Date;

/**
 * Created by anair on 19/10/2016.
 */

public class Conta {

    private String nome;
    private Date dataNascimento;
    private enum genero{feminino,masculino}
    private String email;
    private String password;
    private String confirmPassword;


    public Conta(String nome, Date dataNascimento, String genero, String email, String password, String confirmPassword) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        genero = genero;
        this.email = email;
        this.password = password;
        this.confirmPassword = confirmPassword;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(nome).append('\'');
        sb.append(dataNascimento);
        sb.append(email).append('\'');
        sb.append(password).append('\'');
        sb.append(confirmPassword).append('\'');
        return sb.toString();
    }
}
