package Exer_03;

public class Animais
{
    private String nome;
    private String especie;
    private int idade;

    public Animais (String nome, String especie, int idade)
    {
        this.nome = nome;
        this.especie = especie;
        this.idade = idade;
    }

    public String getNome()
    {
        return nome;
    }

    public void comer()
    {
        System.out.println(getNome() + " está comendo!!");
    }
    public void dormir()
    {
        System.out.println(getNome() + " está dormindo!!");
    }
    public void atividades() {
        System.out.println(getNome() + " atividade 1!!");
        System.out.println(getNome() + " atividade 2!!");
    }
    public void exibirinformacoes()
    {
        System.out.println("O nome do animal: " + nome);
        System.out.println("A espécie do animal: " + especie);
        System.out.println("A idade do animal: " + idade + " anos");
    }
}
