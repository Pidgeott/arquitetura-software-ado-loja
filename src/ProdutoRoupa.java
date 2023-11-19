

public class ProdutoRoupa implements Produto{
    private String nome;
    private Double preco;

    public ProdutoRoupa(String nome, Double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public ProdutoRoupa() {

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Produto Roupa - Nome: " + nome + ", Valor: $" + preco);
    }
}
