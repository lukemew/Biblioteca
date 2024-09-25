package br.com.casadocodigo.livraria;

public class Autor {
    String nome;
    int idade;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void mostrarDetalhes() {
        System.out.println("Exibindo informações do Autor:");
        System.out.println("Nome do autor: " + this.nome);
        System.out.println("Idade: " + this.idade);
        System.out.println("------------");
    }
}
