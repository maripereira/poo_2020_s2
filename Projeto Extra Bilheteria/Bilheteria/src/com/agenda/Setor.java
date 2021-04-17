package com.agenda;

public class Setor {

    private String nome;

    private Double preco;

    private int quantidade;

    private int capacidade;

    public Setor(String nome, Double preco, int capacidade) {
        this.nome = nome;
        this.preco = preco;
        this.capacidade = capacidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public void vender(){
        this.quantidade++;
    }

    @Override
    public String toString() {
        return "[" + this.nome + "]";
    }
}
