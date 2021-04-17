package com.agenda;

public class Venda {

    private Pessoa cliente;

    private Evento evento;

    private Setor setor;

    private Double valor;

    public Venda(Pessoa cliente, Evento evento, Setor setor) {
        this.cliente = cliente;
        this.evento = evento;
        this.setor = setor;
        valor = setor.getPreco();
    }

    @Override
    public String toString() {
        return "[" + cliente.getNome() + ", " + evento.getNome() + ", " + setor.getNome() + "]";
    }
}
