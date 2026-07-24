package Exercicio_03;

import java.util.ArrayList;

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
public class Biblioteca
{
    private ArrayList<Livro> livros;
    public Biblioteca()
    {
        livros = new ArrayList<>();
    }
    public void adicionarLivro (Livro livro)
    {
        livros.add(livro);
    }
    public void listarLivros()
    {
        if(livros.isEmpty())
        {
            System.out.println("Biblioteca está fazia:");
        }
        else
        {
            for (int i = 0; i< livros.size(); i++)
            {
                Livro livro = livros.get(i);
                System.out.println(livro.mostrar());
                System.out.println("-------------------------------------------");
            }
        }
    }
    public void buscarAutor (String autor)
    {
        boolean encontrar = false;
        for(int i = 0; i < livros.size(); i++)
        {
            Livro livro =livros.get(i);
            if(livro.getAutor().equalsIgnoreCase(autor))
            {
                System.out.println(livro.mostrar());
                System.out.println("-------------------------------------------");
                encontrar = true;
            }
        }
        if (!encontrar)
        {
            System.out.println("Nehum livro encontrado para o autor: "+autor);
        }

    }
    public double calcularValorLivro ()
    {
        double total = 0;
        for (int i = 0; i < livros.size(); i++)
        {
            total += livros.get(i).getPreco();

        }
        return total;
    }

}
