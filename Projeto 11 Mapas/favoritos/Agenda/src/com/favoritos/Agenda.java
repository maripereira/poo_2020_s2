package com.favoritos;

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
        List<Contato> aux = new ArrayList<Contato>();

        for (Contato contato: this.contatos){
            if (contato.getName().contains(pattern)) {
                aux.add(contato);
            }
        }
        for (Contato contato : aux) {
            System.out.println(contato);
        }
        return aux;
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
