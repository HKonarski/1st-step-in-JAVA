package Exer_10;

public class Main
{
    public static void main(String[] args)
    {
        Exportavel[] relatorios = { //desgosto de chave que não fica alinhada
                new RelatorioFinanceiro("Balanço Trimestral"),
                new RelatorioTecnico("Análise de Infraestrutura")
        };

        ServicoExportacao servico = new ServicoExportacao();

        for (Exportavel r : relatorios)
        {
            servico.processarExportacao(r);
            servico.processarExportacao(r, "PDF");
        }
    }
}