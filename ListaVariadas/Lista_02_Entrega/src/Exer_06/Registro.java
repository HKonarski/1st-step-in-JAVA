package Exer_06;
import java.util.Date;

public abstract class Registro
{
    protected Date dataCriacao;
    protected String conteudo;

    public Registro(String conteudo)
    {
        this.dataCriacao = new Date();
        this.conteudo = conteudo;
    }
    public void exibirDetalhes()
    {
        System.out.println("Data de criação: " + dataCriacao);
        System.out.println("Conteúdo: " + conteudo);
    }
    public abstract boolean validarIntegridade();
}