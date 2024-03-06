package org.example.lista8.ex1;


class Quadrado extends Forma {

    private double lado;


    public Quadrado(double lado) {
        super("Quadrado");
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        return lado * lado;
    }
}
