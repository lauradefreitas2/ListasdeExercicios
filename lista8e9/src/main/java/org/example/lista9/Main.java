package org.example.lista9;

public class Main {
    public static void main(String[] args) {

        Departamento departamentoTI = new Departamento("TI");

        Gerente gerente = new Gerente("João", 3000, 1000);
        Desenvolvedor desenvolvedor = new Desenvolvedor("Maria", 2500);
        Analista analista = new Analista("Carlos", 2000);

        departamentoTI.adicionarFuncionario(gerente);
        departamentoTI.adicionarFuncionario(desenvolvedor);
        departamentoTI.adicionarFuncionario(analista);

        departamentoTI.mostrarFuncionarios();

    }
}
