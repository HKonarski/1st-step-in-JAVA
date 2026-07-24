package Exer_10;

public class ServicoExportacao
{
    public void processarExportacao(Exportavel relatorio)
    {
        relatorio.exportarPara("JSON");
    }
    public void processarExportacao(Exportavel relatorio, String formato)
    {
        relatorio.exportarPara(formato);
    }
}
