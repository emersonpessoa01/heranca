package br.com.cdb.heranca.model;

public class Aluno extends Pessoa {
    private int numeroMatricula;

    public Aluno(String nome, long cpf, int numeroMatricula) {
        super(nome, cpf);
        this.numeroMatricula = numeroMatricula;
    }
    


    

}
