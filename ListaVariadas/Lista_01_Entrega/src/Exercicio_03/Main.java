package Exercicio_03;
/*
*--Exercício 3 - Múltiplas Classes Relacionadas
Crie uma classe Livro com atributos privados titulo , autor , paginas e preco . Crie
uma classe Biblioteca que:
Tenha uma lista privada de livros
*--Método adicionarLivro(livro) para adicionar livros à biblioteca
*--Método listarLivros() que exibe todos os livros
*--Método buscarPorAutor(autor) que retorna todos os livros de um autor
*--Método calcularValorTotal() que soma o preço de todos os livros
 */

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Biblioteca biblioteca = new Biblioteca();
        Scanner dados = new Scanner(System.in);
        String autorBuscar;
        int opcao;
        biblioteca.adicionarLivro(new Livro("Harry Potter", "J.K. Row", 250, 123.5));
        biblioteca.adicionarLivro(new Livro("O Principe", "Maquiavel", 150, 35.5));
        //Mostrar por bonito só!!
        System.out.println("-------------------------------------------");
        System.out.println("Livros cadastrados:");
        biblioteca.listarLivros();
        System.out.println("-------------------------------------------");
        // Aqui a magia acontece!!
        do
        {
            System.out.println("Informe: \n" +
                    "1- para buscar Autor:\n" +
                    "2- Mostrar valor Total em livros:\n" +
                    "3- Encerrar:");
            opcao = dados.nextInt();
            autorBuscar = dados.nextLine().toUpperCase();
            switch (opcao)
            {
                case 1:
                    System.out.println("Informe o nome do autor que deseja buscar:");
                    autorBuscar = dados.nextLine().toUpperCase();
                    biblioteca.buscarAutor(autorBuscar);
                    break;
                case 2:
                    System.out.println("-------------------------------------------");
                    System.out.println("Valor total de livros em R$ " + biblioteca.calcularValorLivro());
                    break;
                case 3:
                    System.out.println("Encerrando...");
                    break;
                default:
                    System.out.println("Valor invalido");
            }

        }while( opcao !=3);
    }
}
