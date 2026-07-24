package Exer_03;

public class Main
{
    public static void main (String [] args)
    {
        Livro livro1 = new Livro("Dom Casmurro", "Machado de Assis", 256, false);
        Livro livro2 = new Livro("Pequeno Principe", "Antoine de Saint-Exupery", 96, true);

        livro1.exibirInformacoes();
        livro2.exibirInformacoes();
        System.out.println("-------------------***********-------------------");
        livro1.emprestar();
        livro1.devolver();
        System.out.println("-------------------***********-------------------");
        livro2.emprestar();
        livro2.devolver();

    }
}
