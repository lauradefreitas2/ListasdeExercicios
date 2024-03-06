package org.example.lista8.ex1;

class Circulo extends Forma {

    private double raio;


    public Circulo(double raio) {
        super("Círculo");
        this.raio = raio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * raio * raio;
    }
}
