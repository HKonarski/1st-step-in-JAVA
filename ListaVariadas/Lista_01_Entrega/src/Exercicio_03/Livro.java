package Exercicio_03;
/*
Exercício 3 - Múltiplas Classes Relacionadas
*--Crie uma classe Livro com atributos privados titulo , autor , paginas e preco . Crie
uma classe Biblioteca que:
Tenha uma lista privada de livros
*--Método adicionarLivro(livro) para adicionar livros à biblioteca
*--Método listarLivros() que exibe todos os livros
*--Método buscarPorAutor(autor) que retorna todos os livros de um autor
*--Método calcularValorTotal() que soma o preço de todos os livros
 */

public class Livro
{
    private String titulo;
    private String autor;
    private int numeroPaginas;
    private double preco;

    public Livro (String titulo, String autor, int numeroPaginas, double preco)
    {
        this.titulo  = titulo;
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
        this.preco = preco;
    }

    public String getAutor()
    {
        return autor;
    }

    public int getNumeroPaginas()
    {
        return numeroPaginas;
    }

    public double getPreco()
    {
        return preco;
    }
    public String mostrar()
    {
        return "Título: "+ titulo + "\nAutor: "+autor+ "\n Numero de Paginas: "+numeroPaginas+ "\n Preço: "+preco;
    }
}
