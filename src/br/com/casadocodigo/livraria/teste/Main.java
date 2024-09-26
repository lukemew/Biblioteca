package br.com.casadocodigo.livraria.teste;

import br.com.casadocodigo.livraria.Autor;
import br.com.casadocodigo.livraria.produtos.Ebook;
import br.com.casadocodigo.livraria.produtos.Livro;
import br.com.casadocodigo.livraria.produtos.LivroFisico;
import br.com.casadocodigo.livraria.produtos.Produto;

import java.io.FileNotFoundException;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Autor autor = new Autor();
        autor.setNome("João Marrocos");
        autor.setIdade(21);

        Ebook ebook = new Ebook(autor);
        ebook.setNome("CDI");
        ebook.setValor(29.90);

        Livro livro = new LivroFisico(autor);
        livro.setNome("Java 8 Prático");
        livro.setDescricao("Novos recursos da linguagem");
        livro.setValor(59.90);
        livro.setISBN("978-65-4422-23-6");

        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        carrinho.adiciona(livro);
        carrinho.adiciona(ebook);

        Produto[] produtos = carrinho.getProdutos();

        for(int i = 0; i < produtos.length; i++){
            try {
                Produto produto = produtos[i];
                if(produto != null){
                    System.out.println("Adicionando: " + produto.getNome() + ": R$" + produto.getValor());
                }
            } catch (Exception e){
                System.out.println("Deu erro no índice" + i + e.getMessage());
                e.printStackTrace();
            }
        }


    }
}