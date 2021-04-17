package com.agenda;

import java.util.HashMap;
import java.util.Map;

public class Evento {

    private String nome;

    private Map<String, Setor> repoSetores = new HashMap<String, Setor>();

    public Evento(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Map getRepoSetores() {
        return repoSetores;
    }

    public void setRepoSetores(Map repoSetores) {
        this.repoSetores = repoSetores;
    }

    public void addSetor(Setor setor) {
        repoSetores.put(setor.getNome(), setor);
    }

    @Override
    public String toString() {
        return "[" + this.nome + "]";
    }
}
