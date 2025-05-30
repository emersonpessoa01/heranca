package br.com.cdb.heranca.model;

public class Funcionario extends Pessoa {

    public double salario;

    public Funcionario(String nome, long cpf, double salario) {
        super(nome, cpf);
        this.salario = salario;

    }
     // SOBRESCRITA DE MÉTODOS
    @Override
    public void apresentar() {
        System.out.println("Olá, eu sou o funcionário: " + nome);
    }

}
