package Exer_10;

public abstract class RelatorioBase implements Exportavel
{
    protected String titulo;

    public RelatorioBase(String titulo)
    {
        this.titulo = titulo;
    }

    public void buscarDados()
    {
        System.out.println("Buscando dados para o relatório: " + titulo);
    }
}
