import java.util.ArrayList;
import java.util.List;

public class InicializadorLoja {
    public static List<Produto> inicializarProdutos() {
        List<Produto> produtos = new ArrayList<>();

        // Adiciona alguns produtos de cada categoria à lista
        FabricaProduto fabricaLivro = new FabricaLivros();
        produtos.add(fabricaLivro.criarProduto("Aventuras Fantásticas 1", 29.99));
        produtos.add(fabricaLivro.criarProduto("Aventuras Fantásticas 2", 29.99));
        produtos.add(fabricaLivro.criarProduto("Aventuras Fantásticas 3", 29.99));
        produtos.add(fabricaLivro.criarProduto("Aventuras Fantásticas 4", 29.99));
        produtos.add(fabricaLivro.criarProduto("Aventuras Fantásticas 5", 29.99));

        FabricaProduto fabricaEletronico = new FabricaEletronico();
        produtos.add(fabricaEletronico.criarProduto("Smartphone XYZ", 499.99));
        produtos.add(fabricaEletronico.criarProduto("Smartphone ABC", 499.99));
        produtos.add(fabricaEletronico.criarProduto("Smartphone DEF", 499.99));
        produtos.add(fabricaEletronico.criarProduto("Smartphone GHI", 499.99));
        produtos.add(fabricaEletronico.criarProduto("Smartphone JKL", 499.99));

        FabricaProduto fabricaRoupa = new FabricaRoupa();
        produtos.add(fabricaRoupa.criarProduto("Camiseta Casual", 19.99));
        produtos.add(fabricaRoupa.criarProduto("Camiseta Não Casual", 19.99));
        produtos.add(fabricaRoupa.criarProduto("Bermuda", 19.99));
        produtos.add(fabricaRoupa.criarProduto("Calça", 19.99));
        produtos.add(fabricaRoupa.criarProduto("Jaqueta", 19.99));

        return produtos;
    }
}

