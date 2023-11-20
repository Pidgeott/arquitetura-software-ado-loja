package com.senac.factory;

import com.senac.model.Produto;
import com.senac.model.ProdutoRoupa;

public class FabricaRoupa implements FabricaProduto{

    @Override
    public Produto criarProduto(String nome, Double preco) {

        return new ProdutoRoupa(nome, preco);
    }
}
