package org.example.lista9;

public class Analista extends FuncionarioBase {
    public Analista(String nome, double salarioBase) {
        super(nome, salarioBase);
    }

    @Override
    public double calcularSalario() {
        return salarioBase;
    }
}
