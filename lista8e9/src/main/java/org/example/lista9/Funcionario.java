package org.example.lista9;

public abstract class Funcionario {

    protected String nome;
    protected double salario;


    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }


    public abstract double calcularSalario();


    public void mostrarInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Salário: $" + calcularSalario());
    }
}
