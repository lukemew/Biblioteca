package br.com.casadocodigo.livraria.produtos;

import br.com.casadocodigo.livraria.Autor;

public abstract class Livro implements Produto {
    private String titulo;
    private String descricao;
    private String ISBN;
    private int ano;
    private double valor;
    private Autor autor;
    private boolean impresso;

    public Livro(Autor autor) {
        this.autor = autor;
        this.ISBN = "000-00-00000-00-0";
        this.impresso = true;
    }

    public Livro() {
        this.ISBN = "000-00-00000-00-0";
    }

    public void mostrarDetalhes() {
        System.out.println("Exibindo Informações do Livro:");
        if (this.titulo.length() < 2) {
            System.out.println("Título Inválido");
        } else {
            System.out.println("Título: " + this.titulo);
        }

        System.out.println("Descrição: " + this.descricao);
        System.out.println("Ano: " + this.ano);
        System.out.println("Valor: " + this.valor);
        System.out.println("ISBN: " + this.ISBN);
        System.out.println("--");

        if (autor != null) {
            autor.mostrarDetalhes();
        }
    }

    public void setNome(String nome) {
        this.titulo = nome;
    }

    public String getNome(){
        return this.titulo;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getValor() {
        return this.valor;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

}
