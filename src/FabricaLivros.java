public class FabricaLivros implements FabricaProduto{
    @Override
    public Produto criarProduto(String nome, Double preco) {
        return new ProdutoLivro(nome, preco);
    }
}
