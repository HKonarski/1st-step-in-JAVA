package Exercicio_06;

public class Cachorro extends Mamifero
{
    private String raca;
    public Cachorro (String nome, int idade, String tipoPelo, String raca)
    {
        super(nome, idade, tipoPelo);
        this.raca = raca;
    }

    public String getRaca()
    {
        return raca;
    }
    public void latir ()
    {
        System.out.println(getNome() + " está latindo.");
    }
    @Override
    public void dormir()
    {
        System.out.println(getRaca() + " está dormindo.");
    }
}
