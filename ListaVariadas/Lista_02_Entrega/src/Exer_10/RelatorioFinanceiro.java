package Exer_10;

public class RelatorioFinanceiro extends RelatorioBase
{

    public RelatorioFinanceiro(String titulo)
    {
        super(titulo);
    }

    @Override
    public void exportarPara(String formato)
    {
        System.out.println("Exportando relatório financeiro '" + titulo + "' em formato " + formato);
    }
}
