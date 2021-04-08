package com.agenda;

import java.util.ArrayList;
import java.util.List;

public class Contato {
    private String name;

    private String prefix;

    private List<Fone> fones = new ArrayList<>();

    public Contato(String name, List<Fone> fones) {
        this.name = name;
    }

    public Contato(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public List<Fone> getFones() {
        return fones;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addFone(Fone fone) {
        this.fones.add(fone);
    }

    public void rmFone(int index){
        this.fones.remove(index);
    }


    @Override
    public String toString() {
        return "Contato{" +
                "name='" + name + '\'' +
                ", fones=" + fones +
                '}';
    }
}
