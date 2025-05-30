package br.com.cdb.heranca.model;

public class Funcionario extends Pessoa {

    private double salario;

    public Funcionario(String nome, long cpf, double salario) {
        super(nome, cpf);
        this.salario = salario;
    }

    
}
