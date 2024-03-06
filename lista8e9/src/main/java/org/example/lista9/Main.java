package org.example.lista9;

public class Main {
    public static void main(String[] args) {

        Funcionario gerente = new Gerente("João", 3000, "Financeiro");
        Funcionario desenvolvedor = new Desenvolvedor("Maria", 2500, "Java");


        Departamento departamentoTI = new Departamento("TI");


        departamentoTI.adicionarFuncionario(gerente);
        departamentoTI.adicionarFuncionario(desenvolvedor);


        departamentoTI.mostrarFuncionarios();

    }
}
