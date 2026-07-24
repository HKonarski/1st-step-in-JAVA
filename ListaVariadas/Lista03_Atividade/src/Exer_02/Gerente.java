package Exer_02;

public class Gerente extends Funcionario
{
    public Gerente(String nome, String cpf, double salario)
    {
        super(nome, cpf, salario);
    }
    public void aprovarProjeto ()
    {
        System.out.println(getNome() + " aprovou o projeto.");
    }
    public void gerenciarEquipe ()
    {
        System.out.println(getNome() + " está gerenciando a equipe.");
    }
    @Override
    public void trabalhar()
    {
        System.out.println(getNome() + " está coordenando as atividades da equipe.");
    }
}
