package org.example.lista8.ex2;


class Televisao extends ProdutoEletronico {

    private int polegadas;

    public Televisao(String nome, double preco, int polegadas) {
        super(nome, preco);
        this.polegadas = polegadas;
    }
    @Override
    public void mostrarInformacoes() {
        System.out.println("Produto: " + nome);
        System.out.println("Tamanho: " + polegadas + " polegadas");
        System.out.println("Preço: $" + preco);
    }
}
