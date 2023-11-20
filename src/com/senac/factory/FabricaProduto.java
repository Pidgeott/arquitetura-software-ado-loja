package com.senac.factory;

import com.senac.model.Produto;

public interface FabricaProduto {
    Produto criarProduto(String nome, Double preco);
}
