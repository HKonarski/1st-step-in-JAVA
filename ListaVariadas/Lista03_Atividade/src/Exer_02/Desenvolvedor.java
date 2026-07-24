package Exer_02;

public class Desenvolvedor extends Funcionario
{
    public Desenvolvedor (String nome, String cpf, double salario)
    {
        super(nome, cpf, salario);
    }
    public void programar ()
    {
        System.out.println(getNome() + " está programando.");
    }
    public void testar ()
    {
        System.out.println(getNome() + "está testando.");
    }
    @Override
    public void trabalhar ()
    {
        System.out.println(getNome() + " está desenvolvendo e testando.");
    }
}
