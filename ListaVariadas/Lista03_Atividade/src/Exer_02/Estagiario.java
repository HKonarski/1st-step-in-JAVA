package Exer_02;

public class Estagiario extends Funcionario
{
    public Estagiario (String nome, String cpf, double salario)
    {
        super(nome, cpf, salario);
    }

    public void aprender ()
    {
        System.out.println(getNome() + " está aprendendo novas habilidades.");
    }
    public void auxiliar ()
    {
        System.out.println(getNome() + " está auxiliando e atividades simples.");
    }
    @Override
    public void trabalhar ()
    {
        System.out.println( getNome() + " está ajudando a equipe.");
    }
}
