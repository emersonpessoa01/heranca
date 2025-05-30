package br.com.cdb.heranca.model;

public class Professor extends Funcionario {
    public int numeroDeAulas;

    public Professor(String nome, long cpf, double salario, int numeroDeAulas){
        super(nome, cpf, salario);
        this.numeroDeAulas = numeroDeAulas;
    }

    //SOBRECARGA DE MÉTODOS
    public void novoSalario(double novoSalario) {
        this.salario = novoSalario;
    }
    public void novoSalario(double novoSalario, int nAulasAdicionais) {
        this.salario = novoSalario;
        this.numeroDeAulas += nAulasAdicionais;
    }
    
     // SOBRESCRITA DE MÉTODOS
    @Override
    public void apresentar() {
        System.out.println("Olá, eu sou o professor: " + nome);
    }
    
}
