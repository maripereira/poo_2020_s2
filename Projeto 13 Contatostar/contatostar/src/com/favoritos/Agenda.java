package com.favoritos;

import java.util.ArrayList;
import java.util.List;

public class Agenda extends AgendaStar{

    public Agenda() {
        super();
    }

    public Agenda(List<Contato> contatos) {
        super(contatos);
    }

    public Contato getContato(String name) {
        for(Contato contato: getContatos()){
            if(contato.getName().equals(name)){
                return contato;
            }
        }
        return null;
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
        getContatos().add(novo);
    }

    public void rmContact(String nome) {
        for(Contato contato: getContatos()){
            if(contato.getName().equals(nome)){
                getContatos().remove(contato);
            }
        }
    }

    private Contato contatoExiste(String nome) {
        Contato contatoExistente = null;
        for (Contato contato : getContatos()) {
            if(contato.getName().equals(nome))
                contatoExistente = contato;
        }
        return contatoExistente != null ? contatoExistente : null;
    }

    public List<Contato> search(String pattern) {
        List<Contato> aux = new ArrayList<Contato>();

        for (Contato contato: getContatos()){
            if (contato.getName().contains(pattern)) {
                aux.add(contato);
            }
        }
        for (Contato contato : aux) {
            System.out.println(contato);
        }
        return aux;
    }

}
