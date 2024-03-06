package org.example.lista8.ex3;

abstract class Animal {
    // Atributos
    protected String nome;
    protected int idade;

    // Construtor
    public Animal(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    // Método abstrato para exibir informações do animal
    public abstract void mostrarInformacoes();
}
