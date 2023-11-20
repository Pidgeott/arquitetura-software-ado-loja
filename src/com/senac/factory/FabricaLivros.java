package com.senac.factory;

import com.senac.model.Produto;
import com.senac.model.ProdutoLivro;

public class FabricaLivros implements FabricaProduto{
    @Override
    public Produto criarProduto(String nome, Double preco) {
        return new ProdutoLivro(nome, preco);
    }
}
