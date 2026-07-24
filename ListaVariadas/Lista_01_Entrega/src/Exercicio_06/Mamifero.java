package Exercicio_06;

public class Mamifero extends Animal
{
    private String tipoPelo;

    public Mamifero (String nome, int idade, String tipoPelo)
    {
        super(nome, idade);
        this.tipoPelo = tipoPelo;
    }

    public String getTipoPelo()
    {
        return tipoPelo;
    }

    public void setTipoPelo(String tipoPelo)
    {
        tipoPelo.toUpperCase();
        if (tipoPelo != null && tipoPelo.equals("LONGO"))
        {
            this.tipoPelo = "Longo";
        }
        else
        {
            this.tipoPelo = "Curto";
        }
    }
    public void amamentar()

    {
        System.out.println(getNome() + " pode amamentar.");
    }

    @Override
    public void exibirInformacoes()
    {
        super.exibirInformacoes();
        System.out.println(getNome() + " pelo " + getTipoPelo());
    }
}
