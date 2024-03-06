package org.example.lista8.ex3;


class Gato extends Animal {

    private String corPelagem;


    public Gato(String nome, int idade, String corPelagem) {
        super(nome, idade);
        this.corPelagem = corPelagem;
    }

    @Override
    public void mostrarInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade + " anos");
        System.out.println("Cor da Pelagem: " + corPelagem);
    }
}
