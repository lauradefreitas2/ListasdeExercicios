package org.example.lista8.ex2;

abstract class ProdutoEletronico {

    protected String nome;
    protected double preco;


    public ProdutoEletronico(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public abstract void mostrarInformacoes();
}
