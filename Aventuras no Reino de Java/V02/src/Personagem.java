public class Personagem
{
    private String nome;
    private String raca;
    private String classe;
    private int vida;
    private int forca;
    private int destreza;
    private int magia;
    private int ouro;
    private int xp;
    private int nivel;

    public Personagem(String nome, String raca, String classe)
    {
        this.nome = nome;
        this.raca = validarRaca(raca.toLowerCase());
        this.classe = validarClasse(classe.toLowerCase());
        this.ouro = 20;
        this.xp = 0;
        this.nivel = 1;

        // Definição dos atributos iniciais por raça
        switch (this.raca)
        {
            case "humano":
                vida = 100; forca = 10; destreza = 10; magia = 10;
                break;
            case "elfo":
                vida = 100; forca = 5; destreza = 10; magia = 15;
                break;
            case "tiefling":
                vida = 100; forca = 10; destreza = 15; magia = 5;
                break;
        }
        // Definição dos atributos iniciais por Classe
        switch (this.classe)
        {
            case "guerreiro":
                forca += 5;
                break;
            case "mago":
                magia += 5;
                break;
            case "ranger":
                destreza += 5;
                break;
        }
    }
    private String validarRaca (String raca)
    {
        if (!raca.equals("humano") && !raca.equals("elfo") && !raca.equals("tiefling"))
        {
            throw new IllegalArgumentException ("❌ Raça inválida! Escolha Humano, Elfo ou Tiefling.");
        }
        return raca;
    }
    private String validarClasse (String classe)
    {
        if (!classe.equals("guerreiro") && !classe.equals("mago") && !classe.equals("ranger"))
        {
            throw new IllegalArgumentException ("❌ Classe inválida! Escolha Guerreiro, Mago ou Ranger.");
        }
        return classe;
    }

    public void ganharXP(int quantidade)
    {
        xp += quantidade;
        System.out.println(nome + " ganhou " + quantidade + " XP!");
        if (xp >= nivel * 100)
        {
            subirNivel();
        }
    }

    private void subirNivel()
    {
        nivel++;
        xp = 0;

        // Bônus de atributos por classe
        switch (classe) {
            case "guerreiro":
                forca += 10;
                destreza += 5;
                magia += 5;
                vida += 20;
                break;
            case "mago":
                magia += 10;
                forca += 5;
                destreza += 5;
                vida += 20;
                break;
            case "ranger":
                destreza += 10;
                forca += 5;
                magia += 5;
                vida += 20;
                break;
        }

        System.out.println("🎉 " + nome + " subiu para o nível " + nivel + "!");
        System.out.println("Novos atributos: Vida " + vida + ", Força " + forca + ", Destreza " + destreza + ", Magia " + magia);
    }
    private Inventario inventario = new Inventario();

    public void equiparItem(Item item) {
        forca += item.getBonusForca();
        destreza += item.getBonusDestreza();
        magia += item.getBonusMagia();
        vida += item.getBonusVida();
        System.out.println(nome + " equipou " + item.getNome() + "!");
    }

    public Inventario getInventario() {
        return inventario;
    }
    // Getters e setters...
    public String getNome()
    {
        return nome;
    }

    public String getRaca()
    {
        return raca;
    }

    public String getClasse()
    {
        return classe;
    }

    public int getVida()
    {
        return vida;
    }

    public int getForca()
    {
        return forca;
    }

    public int getDestreza()
    {
        return destreza;
    }

    public int getMagia()
    {
        return magia;
    }

    public int getOuro()
    {
        return ouro;
    }

    public int getXp()
    {
        return xp;
    }

    public int getNivel()
    {
        return nivel;
    }
}
