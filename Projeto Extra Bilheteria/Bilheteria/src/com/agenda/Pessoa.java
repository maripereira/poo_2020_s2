package com.agenda;

public class Pessoa {

    private String nome;

    private boolean meia;

    private String ehMeia;

    public Pessoa(String nome, boolean pagaMeia) {
        this.nome = nome;
        this.meia = pagaMeia;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean isMeia() {
        return meia;
    }

    public void setMeia(boolean meia) {
        this.meia = meia;
    }

    public void setEhMeia() {
        if(this.meia)
            this.ehMeia = "sim";
        else
            this.ehMeia = "nao";
    }

    @Override
    public String toString() {
        return "[" + nome + ", " + ehMeia + "]";
    }
}
