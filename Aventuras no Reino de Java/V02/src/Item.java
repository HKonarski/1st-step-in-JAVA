public class Item
{
    private String nome;
    private String tipo; // Ex: arma, armadura, poção
    private int bonusForca;
    private int bonusDestreza;
    private int bonusMagia;
    private int bonusVida;

    public Item(String nome, String tipo, int bonusForca, int bonusDestreza, int bonusMagia, int bonusVida)
    {
        this.nome = nome;
        this.tipo = tipo;
        this.bonusForca = bonusForca;
        this.bonusDestreza = bonusDestreza;
        this.bonusMagia = bonusMagia;
        this.bonusVida = bonusVida;
    }
    // ✅ Métodos getters necessários
    public String getNome()
    {
        return nome;
    }

    public String getTipo()
    {
        return tipo;
    }

    public int getBonusForca()
    {
        return bonusForca;
    }

    public int getBonusDestreza()
    {
        return bonusDestreza;
    }

    public int getBonusMagia()
    {
        return bonusMagia;
    }

    public int getBonusVida()
    {
        return bonusVida;
    }
}

