package com.dwm.ufg.listviewapp;

public class Time {
    private String nome;
    private String brasao;

    public Time(String nome, String brasao) {
        this.nome = nome;
        this.brasao = brasao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getBrasao() {
        return brasao;
    }

    public void setBrasao(String brasao) {
        this.brasao = brasao;
    }

    @Override
    public String toString() {
        return nome;
    }
}
