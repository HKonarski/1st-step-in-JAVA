package Exercicio_07;


public class Pessoa
{
    private String nome;
    private int idade;
    private String cpf;

    public Pessoa (String nome, int idade, String cpf)
    {
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
    }

    public String getNome()
    {
        return nome;
    }

    public int getIdade()
    {
        return idade;
    }

    public String getCpf()
    {
        return cpf;
    }

    public void exibirInformacoes()
    {
        System.out.println("Nome da pessoa: " + getNome());
        System.out.println("Idade da pessoa: "+ getIdade());
        System.out.println("CPF da pessoa: " +getCpf());
    }
}
