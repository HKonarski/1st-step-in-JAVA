package Exer_02;

public class Main
{
    public static void main (String [] args)
    {
        Gerente g1 = new Gerente("Higor konarski", "000.000.000-99", 10000.00);
        Desenvolvedor d1 = new Desenvolvedor("Felipe Maccari", "000.000.000-98", 8900.00);
        Estagiario e1 = new Estagiario("Joaum da Silva", "000.000.000-89", 1200.00);

        System.out.println("=== Gerente ===");
        g1.exibirInformcoesBasicas();
        g1.aprovarProjeto();
        g1.gerenciarEquipe();
        g1.trabalhar();
        System.out.println("=== Desenvolvedor ===");
        d1.exibirInformcoesBasicas();
        d1.programar();
        d1.testar();
        d1.trabalhar();
        System.out.println("=== Estagiário ===");
        e1.exibirInformcoesBasicas();
        e1.aprender();
        e1.auxiliar();
        e1.trabalhar();
    }
}
