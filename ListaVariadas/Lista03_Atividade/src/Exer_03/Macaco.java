package Exer_03;

public class Macaco extends Animais
{
    public Macaco (String nome, String especie, int idade)
    {
        super(nome, especie, idade);
    }
    @Override
    public void atividades()
    {
        System.out.println(getNome() + " está subindo na árvore");
        System.out.println(getNome() + " está brincando na árvore");
    }
}
