package br.com.cdb.heranca.model;

public class Pessoa {
    public String nome;
    public long cpf;

    public Pessoa(String nome, long cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    void apresentar() {
        System.out.println("Olá, meu nome é: " + nome + ", CPF: " + cpf);
    }

    // SOBRESCRITA DE MÉTODOS
    @Override
    public String toString() {
        return this.nome +" - " + this.cpf;
    }
}
