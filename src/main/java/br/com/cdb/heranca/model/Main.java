package br.com.cdb.heranca.model;

public class Main {
    public static void main(String[] args) {
       Pessoa fulano = new Pessoa(null, 0);
       fulano.nome = "Fulano";
       fulano.cpf = 12345678901L;

       fulano.apresentar();
        
    }
}
