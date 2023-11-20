package com.senac.model;

public class ProdutoLivro implements Produto{
    private String nome;
    private Double preco;

    public ProdutoLivro(String nome, Double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public ProdutoLivro() {

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Produto Livro - Nome: " + nome + ", Valor: $" + preco);
    }
}
