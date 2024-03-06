package org.example.lista8.ex2;


class Smartphone extends ProdutoEletronico {
    private String modelo;


    public Smartphone(String nome, double preco, String modelo) {
        super(nome, preco);
        this.modelo = modelo;
    }

    @Override
    public void mostrarInformacoes() {
        System.out.println("Produto: " + nome);
        System.out.println("Modelo: " + modelo);
        System.out.println("Preço: $" + preco);
    }
}
