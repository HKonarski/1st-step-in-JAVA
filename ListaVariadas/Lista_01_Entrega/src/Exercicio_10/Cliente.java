package Exercicio_10;

public class Cliente
{
    private String nome;
    private String documento;

    public Cliente(String nome, String documento)
    {
        this.nome = nome;
        this.documento = documento;
    }

    public String getNome()
    {
        return nome; }
    public String getDocumento()
    {
        return documento;
    }

    public void exibirInfo()
    {
        System.out.println("Cliente: " + getNome() + " | Documento: " + getDocumento());
    }
}