package Exer_01;

public class Main
{
    public static void main (String [] args)
    {
        Produto p1 = new Produto("Notebook", 3500.00, 10);
        Produto p2 = new Produto("Monitor", 2500.00, 7);

        System.out.println("-----------------+++++++++-----------------");
        p1.exibirInformacoes();
        p2.exibirInformacoes();
        System.out.println("-----------------+++++++++-----------------");
        p1.adicinaEstoque(5);
        p2.adicinaEstoque(6);
        System.out.println("-----------------+++++++++-----------------");
        p1.exibirInformacoes();
        p2.exibirInformacoes();
        System.out.println("-----------------+++++++++-----------------");
        p1.removeEstoque(3);
        p2.removeEstoque(2);
        System.out.println("-----------------+++++++++-----------------");
        p1.exibirInformacoes();
        p2.exibirInformacoes();
        p1.setQuantidadeEmEstoque(5);
    }
}
