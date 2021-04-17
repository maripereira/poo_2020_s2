package com.favoritos;

import java.util.ArrayList;
import java.util.List;

public abstract class AgendaStar {

    private List<Contato> contatos = new ArrayList<>();

    public AgendaStar(List<Contato> contatos) {
        this.contatos = contatos;
    }

    public AgendaStar() {

    }

    public List<Contato> getContatos() {
        return contatos;
    }

    public void setContatos(List<Contato> contatos) {
        this.contatos = contatos;
    }

    public void star(String name, boolean value){
        for(Contato contato: this.contatos){
            if(contato.getName().equals(name))
                contato.setStar(value);
        }
    }
    // @ ana [0:tim:3434] [1:casa:4567] [2:oi:8754]
    public String getStarred(){
        StringBuilder sb = new StringBuilder();
        List<Contato> contato = (List<Contato>) this.contatos.stream()
                .filter(c -> c.isStar())
                .map(c -> {
                    return sb.append(c.toString());
                });

        return String.valueOf(sb);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        List<Contato> contato;
        contato = (List<Contato>) this.contatos.stream()
                .map(c -> {
                    return sb.append(c.toString());
                });

        return String.valueOf(sb);
    }
}
