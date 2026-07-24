package Exer_10;

public class RelatorioTecnico extends RelatorioBase
{

    public RelatorioTecnico(String titulo)
    {
        super(titulo);
    }

    @Override
    public void exportarPara(String formato)
    {
        System.out.println("Exportando relatório técnico '" + titulo + "' em formato " + formato);
    }
}
