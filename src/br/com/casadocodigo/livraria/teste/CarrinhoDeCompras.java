package br.com.casadocodigo.livraria.teste;

import br.com.casadocodigo.livraria.produtos.Produto;

public class CarrinhoDeCompras {

    private double total;
    private Produto[] produtos = new Produto[10];
    private int contador = 0;


    public void adiciona(Produto produto) {
        System.out.println("Adicionando: " + produto);
        produtos[contador] = produto;
        contador++;
        System.out.println("Valor: " + produto.getValor());
    }

    public Produto[] getProdutos() {
        return produtos;
    }

}
