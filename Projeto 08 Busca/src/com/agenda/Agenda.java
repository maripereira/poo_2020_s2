package com.agenda;

import java.util.ArrayList;
import java.util.List;

public class Agenda {

    private List<Contato> contatos = new ArrayList<>();

    public Agenda() { }

    public Contato getContato(String name) {
        for(Contato contato: this.contatos){
            if(contato.getName().equals(name)){
                return contato;
            }
        }
        return null;
    }

    public void setContatos(List<Contato> contatos) {
        this.contatos = contatos;
    }

    public void addContact(Contato contato) {
        String name = contato.getName();
        List<Fone> fones = contato.getFones();
        Contato existente = contatoExiste(name);
        if(existente != null) {
            for(Fone fone: fones){
                existente.addFone(fone);
            }
        }
        Contato novo = new Contato(name, fones);
        this.contatos.add(novo);
    }

    public void rmContact(String nome) {
        for(Contato contato: this.contatos){
            if(contato.getName().equals(nome)){
                this.contatos.remove(contato);
            }
        }
    }

    private Contato contatoExiste(String nome) {
        Contato contatoExistente = null;
        for (Contato contato : this.contatos) {
            if(contato.getName().equals(nome))
                contatoExistente = contato;
        }
        return contatoExistente != null ? contatoExistente : null;
    }

    public List<Contato> search(String pattern) {
        return this.contatos;
    }

    @Override
    public String toString() {
        return "Agenda{" +
                "contatos=" + contatos +
                '}';
    }
}
