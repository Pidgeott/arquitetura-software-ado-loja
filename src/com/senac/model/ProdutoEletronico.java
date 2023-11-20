package com.senac.model;

public class ProdutoEletronico implements Produto {
    private String nome;
    private Double preco;

    public ProdutoEletronico(String nome, Double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public ProdutoEletronico() {

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
        System.out.println("Produto Eletrônico - Nome: " + nome + ", Valor: $" + preco);
    }
}
