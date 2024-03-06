package org.example.lista8.ex2;

public class Main {
    public static void main(String[] args) {

        Smartphone smartphone = new Smartphone("iPhone 13", 999.99, "iPhone");
        Televisao televisao = new Televisao("Samsung 4K", 799.99, 55);


        System.out.println("Informações do Smartphone:");
        smartphone.mostrarInformacoes();
        System.out.println();
        System.out.println("Informações da Televisão:");
        televisao.mostrarInformacoes();

        System.out.println();

    }
}
