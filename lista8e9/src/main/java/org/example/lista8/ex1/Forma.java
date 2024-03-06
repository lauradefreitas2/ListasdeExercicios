package org.example.lista8.ex1;
abstract class Forma {

    protected String tipo;


    public Forma(String tipo) {
        this.tipo = tipo;
    }

    public abstract double calcularArea();

    public void mostrarInformacoes() {
        System.out.println("Tipo de forma: " + tipo);
        System.out.println("Área: " + calcularArea());
    }
}
