package Exer_03;

public class Livro
{
    private String titulo;
    private  String autor;
    private int numeroDePag;
    private boolean estaEmprestado;

    public Livro (String titulo, String autor, int numeroDePag, boolean estaEmprestado)
    {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroDePag = numeroDePag;
        this.estaEmprestado = estaEmprestado;
    }

    public String getTitulo()
    {
        return titulo;
    }

    public String getAutor()
    {
        return autor;
    }

    public int getNumeroDePag()
    {
        return numeroDePag;
    }

    public boolean isEstaEmprestado()
    {
        return estaEmprestado;
    }
     public void exibirInformacoes()
     {
         System.out.println("Titulo do livro: " + titulo);
         System.out.println("Autor do livro: " + autor);
         System.out.println("Quantidade de paginas do livro: " + numeroDePag);
         System.out.println("Status do livro: " + (estaEmprestado ? "Emprestado" : " Não emprestado"));
     }
     public void emprestar()
         {
             if(!estaEmprestado)
             {
                 estaEmprestado = true;
                 System.out.println("Livro emprestado com sucesso!!");
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
                 System.out.println(" O livro está disponível!!");
             }
         }
}
