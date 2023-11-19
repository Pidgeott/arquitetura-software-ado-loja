public class FabricaRoupa implements FabricaProduto{

    @Override
    public Produto criarProduto(String nome, Double preco) {

        return new ProdutoRoupa(nome, preco);
    }
}
