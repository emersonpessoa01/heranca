package br.com.cdb.heranca.model;

public class Aluno extends Pessoa {
    private int numeroMatricula;

    public Aluno(String nome, long cpf, int numeroMatricula) {
        super(nome, cpf);
        this.numeroMatricula = numeroMatricula;
    }

    // SOBRESCRITA DE MÉTODOS
    @Override
    public void apresentar() {
        System.out.println("Olá, eu sou o aluno: " + nome + " e minha matrícula é: " + numeroMatricula);
    }

}
