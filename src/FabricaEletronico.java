public class FabricaEletronico implements FabricaProduto {

    @Override
    public Produto criarProduto(String nome, Double preco) {
        return new ProdutoEletronico(nome, preco);
    }
}
