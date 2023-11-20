package com.senac.model;

import java.util.ArrayList;
import java.util.List;

public class Carrinho {
    public List<Produto> produtos;

    public Carrinho() {
        produtos = new ArrayList<>();
    }

    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
    }

    public void removerProduto(Produto produto) {
        produtos.remove(produto);
    }

    public double calcularTotal() {
        double total = 0.0;
        for (Produto produto : produtos) {
            total += produto.getPreco();
        }
        return total;
    }

    public void exibirProdutos() {
        for (Produto produto : produtos) {
            produto.exibirDetalhes();
        }
    }
    
    public void limparCarrinho() {
        produtos.clear();
    }

}
