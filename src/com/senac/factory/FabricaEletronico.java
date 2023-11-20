package com.senac.factory;

import com.senac.model.Produto;
import com.senac.model.ProdutoEletronico;

public class FabricaEletronico implements FabricaProduto {

    @Override
    public Produto criarProduto(String nome, Double preco) {
        return new ProdutoEletronico(nome, preco);
    }
}
