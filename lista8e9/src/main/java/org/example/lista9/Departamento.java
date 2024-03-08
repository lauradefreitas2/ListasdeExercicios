package org.example.lista9;
import java.util.ArrayList;
import java.util.List;

public class Departamento {
    private String nome;
    private List<Funcionario> funcionarios;

    public Departamento(String nome) {
        this.nome = nome;
        this.funcionarios = new ArrayList<>();
    }

    public void adicionarFuncionario(Funcionario funcionario) {
        funcionarios.add(funcionario);
    }

    public void mostrarFuncionarios() {
        System.out.println("Funcionários do Departamento de " + nome + ":");
        for (Funcionario funcionario : funcionarios) {
            funcionario.mostrarInformacoes();
        }
    }
}
