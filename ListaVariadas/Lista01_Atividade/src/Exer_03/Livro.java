package Exer_03;

public class Livro
{
    String titulo;
    String autor;
    int numeroDePag;
    boolean estaEmprestado;

    public void exibirInformacoes ()
    {
        System.out.println("Titulo: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Numero do paginsas do livro: " + numeroDePag);
        System.out.println("Status do livro:" + (estaEmprestado ? "Emprestado" : "Não emprestado"));

    }
    public void emprestar()
    {
        if(!estaEmprestado)
        {
            estaEmprestado = true;
            System.out.println("Livros emprestado com sucesso!!");
        }
        else
        {
            System.out.println("Livro já está emprestado!!");
        }
    }
    public void devolver()
    {
        if (estaEmprestado)
        {
            estaEmprestado = false;
            System.out.println("Livro devolvido com sucesso");
        }
        else
        {
            System.out.println("O livro já está disponível!!");
        }
    }
}
