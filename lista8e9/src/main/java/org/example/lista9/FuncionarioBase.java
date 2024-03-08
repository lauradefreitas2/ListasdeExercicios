package org.example.lista9;

public abstract class FuncionarioBase implements Funcionario {
    protected String nome;
    protected double salarioBase;

    public FuncionarioBase(String nome, double salarioBase) {
        this.nome = nome;
        this.salarioBase = salarioBase;
    }

    @Override
    public void mostrarInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Salário: $" + calcularSalario());
    }
}
