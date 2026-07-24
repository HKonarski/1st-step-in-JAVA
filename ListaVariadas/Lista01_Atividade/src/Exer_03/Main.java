package Exer_03;

public class Main
{
    public static void main (String [] args)
    {
        Livro livro1 = new Livro();
        livro1.titulo = "Dom Casmurro";
        livro1.autor = "Machado de Assis";
        livro1.numeroDePag = 256;
        livro1.estaEmprestado = false;

        Livro livro2 = new Livro();
        livro2.titulo = "Pequeno Príncipe";
        livro2.autor = "Antoine de Saint-Exupéry";
        livro2.numeroDePag = 96;
        livro2.estaEmprestado = true;

        System.out.println("-----------------+++++++++-----------------");
        //Outro formato para exibir as informações!!
        livro1.exibirInformacoes();
        livro2.exibirInformacoes();
        System.out.println("-----------------+++++++++-----------------");
        //Outro formato de manioulação das informações!!
        livro1.emprestar();
        livro1.devolver();
        livro2.emprestar();
        livro2.devolver();
        System.out.println("-----------------+++++++++-----------------");
        //Verificação da alteração de status!!
        livro1.exibirInformacoes();
        livro2.exibirInformacoes();
    }
}
