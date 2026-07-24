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

public class Pessoa
{
    private String nome;
    private int idade;
    private String email;

    public Pessoa(String nome, int idade, String email)
    {
        this.nome = nome;
        this.idade = idade;
        setEmail(email);
    }

    public String getNome()
    {
        return nome;
    }

    public int getIdade()
    {
        return idade;
    }

    public String getEmail()
    {
        return email;
    }

    public void setNome (String nome)
    {
        this.nome = nome;
    }

    public void setIdade (int idade)
    {
        this.idade = idade;
    }

    public void setEmail(String email)
    {
        if (email != null && email.contains("@"))
        {
            this.email = email;
        } else
        {
            System.out.println("E-mail invalido. o e-mail deve conter \"@\".");
        }
    }
    public void mostrar ()
    {
       System.out.println("Nome da pessoa: " + getNome());
       System.out.println("Idade da pessoa: " + getIdade());
       System.out.println("e-mail da pessoa: " + getEmail());
    }
}