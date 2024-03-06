package org.example.lista9;


public class Gerente extends Funcionario {

    private String departamento;


    public Gerente(String nome, double salario, String departamento) {
        super(nome, salario);
        this.departamento = departamento;
    }


    @Override
    public double calcularSalario() {
        return salario + 1000;
    }
}