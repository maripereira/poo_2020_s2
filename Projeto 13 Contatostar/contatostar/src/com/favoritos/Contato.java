package com.favoritos;

import java.util.ArrayList;
import java.util.List;

public class Contato extends ContatoStar{
    private String name;

    private String prefix;

    private List<Fone> fones = new ArrayList<>();

    public Contato(String name, List<Fone> fones) {
        this.name = name;
    }

    public Contato(String name) {
        this.name = name;
    }

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public void setFones(List<Fone> fones) {
        this.fones = fones;
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
        StringBuilder sb = new StringBuilder();
        if(this.isStar())
            sb.append("@ ");
        else
            sb.append("- ");
        for(Fone fone: this.fones) {
            sb.append(this.name + "[" + fone.getNumber() + "] ");
        }
        return String.valueOf(sb);
    }
}
