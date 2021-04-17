package com.agenda;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Bilheteria {

    private List<Venda> repVendas;

    private HashMap<String, Pessoa> repPessoas = new HashMap<String, Pessoa>();

    private Map<String, Evento> repEvento = new HashMap<String, Evento>();

    private Double caixa;

    public List<Venda> getRepVendas() {
        return repVendas;
    }

    public void setRepVendas(List<Venda> repVendas) {
        this.repVendas = repVendas;
    }

    public HashMap<String, Pessoa> getRepPessoas() {
        return repPessoas;
    }

    public void setRepPessoas(HashMap<String, Pessoa> repPessoas) {
        this.repPessoas = repPessoas;
    }

    public Map<String, Evento> getRepEvento() {
        return repEvento;
    }

    public void setRepEvento(Map<String, Evento> repEvento) {
        this.repEvento = repEvento;
    }

    public Double getCaixa() {
        return caixa;
    }

    public void setCaixa(Double caixa) {
        this.caixa = caixa;
    }

    public void vender(String cliente, String evento, String setor) throws Exception {
        Pessoa p;
        Setor set = null;
        Evento e;
        if(this.repPessoas.get(cliente) != null)
            throw new Exception("Cliente existe");
        p = this.repPessoas.get(cliente);
        if(this.repEvento.get(evento) == null)
            throw new Exception("Evento nao existe");
        e = this.repEvento.get(evento);

        for(String key: this.repEvento.keySet()) {
            e = this.repEvento.get(key);
            Map<String, Setor> s = e.getRepoSetores();
            set = s.get(setor);

            if(set == null)
                throw new Exception("Setor invalido");
        }
        Venda venda = new Venda(p, e, set);
        this.repVendas.add(venda);
    }

    public String showVendas() {
        StringBuilder showVendas = new StringBuilder();
        for(Venda venda: this.repVendas) {
            showVendas.append(venda.toString());
            showVendas.append(", ");
        }
        return showVendas.toString();
    }

    public String showPessoas() {
        StringBuilder showVendas = new StringBuilder();
        for(String key : this.repPessoas.keySet()) {
            Pessoa p = this.repPessoas.get(key);
            showVendas.append(p.toString());
            showVendas.append(", ");
        }
        return showVendas.toString();
    }

    public String showEventos() {
        StringBuilder showVendas = new StringBuilder();
        for(String key : this.repEvento.keySet()) {
            Evento e = this.repEvento.get(key);
            showVendas.append(e.toString());
            showVendas.append(", ");
        }
        return showVendas.toString();
    }

    public void addPessoa(String nome, boolean meia) {
        Pessoa pessoa = new Pessoa(nome, meia);
        this.repPessoas.put(nome, pessoa);
    }

    public void addEvento(String idEvento) {
        Evento evento = new Evento(idEvento);
        this.repEvento.put(idEvento, evento);
    }

    public void addSetor(String idEvento, String idSetor, Double preco, int capacidade) {
        Setor setor = new Setor(idSetor, preco, capacidade);
        Evento evento = (Evento) this.repEvento.get(idEvento);
        evento.addSetor(setor);
        this.repEvento.replace(evento.getNome(), evento);
    }

}
