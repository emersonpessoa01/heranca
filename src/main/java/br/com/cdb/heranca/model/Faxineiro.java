package br.com.cdb.heranca.model;

public class Faxineiro extends Funcionario {
    public int turno;

    public Faxineiro(String nome, long cpf, double salario, int turno) {
        super(nome, cpf, salario);
        this.turno = turno;
    }
     // SOBRESCRITA DE MÉTODOS
    @Override
    public void apresentar() {
        System.out.println("Olá, eu sou o faxineiro: " + nome);
    }
    
}
