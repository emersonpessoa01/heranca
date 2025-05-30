package br.com.cdb.heranca.model;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Pessoa fulano = new Pessoa(null, 0);
        fulano.nome = "Fulano";
        fulano.cpf = 12345678901L;

        fulano.apresentar();

        Aluno aluno1 = new Aluno(null, 0, 0);
        aluno1.nome = "Aluno 1";
        // aluno1.apresentar();

        Funcionario funcionario = new Funcionario(null, 0, 0);
        funcionario.nome = "Funcionário 1";
        funcionario.cpf = 12345678901L;
        funcionario.salario = 3000.00;
        // funcionario.apresentar();

        Professor professor = new Professor(null, 0, 0, 0);
        professor.nome = "Professor 1";
        professor.cpf = 12345678901L;
        professor.salario = 5000.00;
        professor.numeroDeAulas = 10;
        professor.novoSalario(5500.00, 2); // Sobrecarga de método
        // professor.apresentar();

        Faxineiro faxineiro = new Faxineiro(null, 0, 0, 0);
        faxineiro.nome = "Faxineiro 1";
        faxineiro.cpf = 12345678901L;
        faxineiro.salario = 2000.00;
        faxineiro.turno = 1;
        // faxineiro.apresentar();

        ArrayList<Pessoa> listaDaEscola = new ArrayList<>();
        listaDaEscola.add(fulano);
        listaDaEscola.add(aluno1);
        listaDaEscola.add(funcionario);
        listaDaEscola.add(professor);
        listaDaEscola.add(faxineiro);

        //POLIMORFISMO
        for (Pessoa pessoa : listaDaEscola) {
            pessoa.apresentar();

           
            // Polimorfismo do tipo downcasting
            if (pessoa instanceof Professor) {
                System.out.println("O número de aulas do professor é: " + ((Professor) pessoa).numeroDeAulas);

            }

        }

    }
}
