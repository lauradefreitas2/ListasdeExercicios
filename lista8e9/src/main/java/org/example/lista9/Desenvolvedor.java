package org.example.lista9;


public class Desenvolvedor extends FuncionarioBase {
    public Desenvolvedor(String nome, double salarioBase) {
        super(nome, salarioBase);
    }

    @Override
    public double calcularSalario() {
        return salarioBase;
    }
}
