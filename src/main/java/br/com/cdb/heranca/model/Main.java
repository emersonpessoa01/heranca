package br.com.cdb.heranca.model;

public class Main {
    public static void main(String[] args) {
       Pessoa fulano = new Pessoa(null, 0);
       fulano.nome = "Fulano";
       fulano.cpf = 12345678901L;

       fulano.apresentar();

       Aluno aluno1 = new Aluno(null, 0, 0);
        aluno1.nome = "Aluno 1";

        Funcionario funcionario = new Funcionario(null, 0, 0);
        funcionario.nome = "Funcionário 1";
        System.out.println("Nome do funcionário: " + funcionario.nome);

        Professor professor = new Professor(null, 0, 0, 0);
        professor.nome = "Professor 1";
        professor.cpf = 12345678901L;
        professor.salario = 5000.00;
        professor.numeroDeAulas = 10;
        System.out.println("Nome do professor: " + professor.nome);

        Faxineiro faxineiro = new Faxineiro(null, 0, 0, 0);
        faxineiro.nome = "Faxineiro 1";
        faxineiro.cpf = 12345678901L;
        faxineiro.salario = 2000.00;
        faxineiro.turno = 1;
        System.out.println("Nome do faxineiro: " + faxineiro.nome);
       
        
    }
}
