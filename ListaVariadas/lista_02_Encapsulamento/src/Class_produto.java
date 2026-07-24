public class Class_produto
{
    private String nome;
    private double preco;
    private int quantidadeDeprodutos;

    void diminutirEstoque (int quantidade)
    {
        this.quantidadeDeprodutos -=1;
    }
    public Class_produto (String nomeI, double precoI, int quantidadeDeprodutosI)
    {
        this.nome = nomeI;
        this.preco = precoI;
        this.quantidadeDeprodutos = quantidadeDeprodutosI;
    }
    public String getNome()
    {
        return this.nome;
    }
    public double getPreco()
    {
       return this.preco;
    }
    public int getQuantidadeDeprodutos()
    {
        return this.quantidadeDeprodutos;
    }
     public  void setQuantidadeDeprodutos(int quantidadeDeprodutos)
    {
        if(quantidadeDeprodutos>= 1)
        {
            this.quantidadeDeprodutos = quantidadeDeprodutos;
        }
        else
        {
            System.out.println("produtos indisponivel");
        }
    }
}
