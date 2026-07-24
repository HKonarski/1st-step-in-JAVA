package Exer_03;

public class Leao extends Animais
{
    public Leao (String nome, String especie, int idade)
    {
        super(nome, especie, idade);
    }
    @Override
    public void atividades()
    {
        System.out.println(getNome() + " está rugindo!!");
        System.out.println(getNome() + " está caçando!!");
    }
}
