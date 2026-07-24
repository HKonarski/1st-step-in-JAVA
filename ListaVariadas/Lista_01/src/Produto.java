public class Produto
{
    String nome;
    double preco;
    int quantidadeEmEstoque;

    void diminuirEstoque (int quantidade)
    {
        this.quantidadeEmEstoque -=1;
    }

}
