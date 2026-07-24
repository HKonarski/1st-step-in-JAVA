package Exercicio_06;

public class Gato extends Mamifero
{
    private String corOlhos;
    public Gato (String nome, int idade, String tiPelo, String corOlhos)
    {
        super(nome, idade, tiPelo);
        this.corOlhos = corOlhos;
    }

    public String getCorOlhos()
    {
        return corOlhos;
    }

    public void miar ()
    {
        System.out.println(getNome() + " está miando.");
    }
    @Override
    public void exibirInformacoes()
    {
        super.exibirInformacoes();
        System.out.println(getNome() + " a cor dos olhos são " + getCorOlhos());

    }
    @Override
    public void dormir()
    {
        System.out.println(getNome() + " está dormindo");
    }
}
