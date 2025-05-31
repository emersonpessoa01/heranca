package br.com.cdb.heranca.model;

// Classe abstrata Pessoa não pode ser instanciada diretamente,
// mas pode ser estendida por outras classes como Aluno, Funcionario, etc.
public abstract class Pessoa {
    public String nome;
    public long cpf;

    public Pessoa(String nome, long cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public abstract void apresentar();

    // SOBRESCRITA DE MÉTODOS
    @Override
    public String toString() {
        return this.nome +" - " + this.cpf;
    }
}
