package br.com.cdb.heranca.model;

public class Professor extends Funcionario {
    public int numeroDeAulas;

    public Professor(String nome, long cpf, double salario, int numeroDeAulas){
        super(nome, cpf, salario);
        this.numeroDeAulas = numeroDeAulas;
    }
    
}
