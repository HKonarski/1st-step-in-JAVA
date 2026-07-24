package Exercicio_01;
/*
Exercício 1 - Classe Básica
*--Crie uma classe Pessoa com os atributos privados nome , idade e email .
*--Implemente métodos públicos para:
*--Definir e obter cada atributo (getters e setters)
*--Um método apresentar() que retorna uma string com as informações da
pessoa
*--Crie 2 objetos da classe e teste todos os método
 */
public class Main
{
    public static void main(String[] args)
    {
        Pessoa pessoa1 = new Pessoa("Roger", 28, "roger@gmail.com");
        Pessoa pessoa2 = new Pessoa("Ana", 26, "anas2@gmail.com");

        pessoa1.mostrar();
        System.out.println("-------------------------------------------");
        pessoa1.setNome("Roger Rodriguez");
        pessoa1.setIdade(30);
        pessoa1.setEmail("rogerz@gmail.com");
        System.out.println("Dados das pessoas Atualizados:");
        pessoa1.mostrar();
        System.out.println("-------------------------------------------");
        pessoa2.mostrar();
        pessoa2.setNome("Ana Claudia");
        pessoa2.setEmail("anas2gmail.com");
        pessoa2.setIdade(27);
        System.out.println("------Dados das pessoas Atualizados:------");
        pessoa2.mostrar();

    }
}