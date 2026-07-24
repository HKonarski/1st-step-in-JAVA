package Exercicio_06;

public class Animal
{
    private String nome;
    private int idade;

    public Animal (String nome, int idade)
    {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome()
    {
        return nome;
    }

    public int getIdade()
    {
        return idade;
    }

    public  void  dormir ()
    {
        System.out.println("O animal está dormindo.");
    }
    public void exibirInformacoes()
    {
        System.out.println("O nome do Animel :" + getNome());
        System.out.println("A idade do animal: " + getIdade());
    }
}
