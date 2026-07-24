package Exer_09;

public class Main
{
    public static void main(String[] args)
    {
        Auditoria estoque = new SistemaDeEstoque();
        Auditoria seguranca = new AreaDeSeguranca();

        estoque.registrarAcao("Entrada de 100 unidades de produto X");
        seguranca.registrarAcao("Tentativa de acesso não autorizado");

        System.out.println("Última alteração no estoque: " + estoque.dataUltimaAlteracao());
        estoque.exibirHistorico();

        System.out.println();

        System.out.println("Última alteração na segurança: " + seguranca.dataUltimaAlteracao());
        seguranca.exibirHistorico();
    }
}