package Exercicio_09;

public class Pessoa
{
    private String nome;
    private String cpf;

    public Pessoa(String nome, String cpf)
    {
        this.nome = nome;
        this.cpf = cpf;
    }

    public String getNome()
    {
        return nome;
    }

    public String getCpf()
    {
        return cpf;
    }

    public void exibirInformacoes() {
        System.out.println("Nome do cliente: " + getNome());
        System.out.println("CPF do cliente: " + getCpf());
    }
}
