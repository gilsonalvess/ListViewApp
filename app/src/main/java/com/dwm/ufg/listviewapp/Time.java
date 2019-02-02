package com.dwm.ufg.listviewapp;

import java.io.Serializable;

public class Time implements Serializable {
    private String nome;
    private int brasao;

    public Time(String nome, int brasao) {
        this.nome = nome;
        this.brasao = brasao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getBrasao() {
        return brasao;
    }

    public void setBrasao(int brasao) {
        this.brasao = brasao;
    }

    @Override
    public String toString() {
        return nome;
    }
}
