package org.example.lista8.ex3;

public class Main {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro("Rex", 5, "Labrador Retriever");
        Gato gato = new Gato("Whiskers", 3, "Branca");

        // Exibindo informações dos animais
        System.out.println("Informações do Cachorro:");
        cachorro.mostrarInformacoes();
        System.out.println(); // Linha em branco para separação
        System.out.println("Informações do Gato:");
        gato.mostrarInformacoes();

    }
}
