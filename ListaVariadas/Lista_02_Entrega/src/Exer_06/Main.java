package Exer_06;
public class Main
{
    public static void main(String[] args)
    {
        Registro r1 = new RegistroContabil("R$ 1500,00 - Receita");
        Registro r2 = new RegistroTransacao("ID:12345 VALOR:250");

        r1.exibirDetalhes();
        System.out.println("Integridade válida? " + r1.validarIntegridade());

        System.out.println();

        r2.exibirDetalhes();
        System.out.println("Integridade válida? " + r2.validarIntegridade());
    }
}