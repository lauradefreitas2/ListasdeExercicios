package org.example.lista9;


public class Desenvolvedor extends Funcionario {

    private String linguagem;


    public Desenvolvedor(String nome, double salario, String linguagem) {
        super(nome, salario);
        this.linguagem = linguagem;
    }


    @Override
    public double calcularSalario() {
        return salario;
    }
}
