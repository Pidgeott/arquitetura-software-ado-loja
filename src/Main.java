import java.util.List;

public class Main {

    public static void main(String[] args) {

        System.out.println("Hello world!");

        FabricaProduto fabricaEletronico = new FabricaEletronico();
        Produto produtoEletronico = fabricaEletronico.criarProduto("Computador", 5000.00);
        produtoEletronico.exibirDetalhes();

        FabricaProduto fabricaRoupa = new FabricaRoupa();
        Produto produtoRoupa = fabricaRoupa.criarProduto("Calça Jeans", 50.00);
        produtoRoupa.exibirDetalhes();

        FabricaProduto fabricaLivro = new FabricaLivros();
        Produto produtoLivro = fabricaLivro.criarProduto("1984", 50.00);
        produtoLivro.exibirDetalhes();

        List<Produto> produtos = inicializarProdutos();

        for (ProdutoLivro produto : produtos) {
            System.out.println("Nome: " + produto.getNome() + ", Preço: R$" + produto.getPreco());
        }
    }
}