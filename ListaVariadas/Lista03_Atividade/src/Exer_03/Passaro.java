package Exer_03;

public class Passaro extends Animais
{
    public Passaro (String nome, String especie, int idade)
    {
        super(nome,especie, idade);
    }
    @Override
    public void atividades()
    {
        System.out.println(getNome() + " está voando!!");
        System.out.println(getNome() + " está cantando!!");
    }
}
