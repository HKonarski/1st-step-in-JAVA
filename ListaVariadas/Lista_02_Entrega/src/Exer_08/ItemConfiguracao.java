package Exer_08;

public class ItemConfiguracao
{
    private int id;
    private String nome;

    public ItemConfiguracao(int id, String nome)
    {
        this.id = id;
        this.nome = nome;
    }

    public int getId() { return id; }
    public String getNome() { return nome; }

    @Override
    public String toString()
    {
        return "ItemConfiguracao{id=" + id + ", nome='" + nome + "'}";
    }
}
