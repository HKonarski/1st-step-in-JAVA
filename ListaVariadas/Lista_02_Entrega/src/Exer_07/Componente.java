package Exer_07;

public abstract class Componente
{
    protected String versao;

    public Componente(String versao)
    {
        this.versao = versao;
    }

    public void statusAtual()
    {
        System.out.println("Componente na versão: " + versao);
    }
    public abstract void iniciarComponente();
    public abstract void desligarComponente();
}
