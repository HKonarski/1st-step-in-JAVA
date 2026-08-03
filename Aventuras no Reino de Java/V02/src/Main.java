import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner dados = new Scanner(System.in);
        String nomePersonagem;
        String racaPersonagem;
        String classePersonagem;
        Personagem heroi = null;
        boolean valido = false;

        while (!valido) try
        {
            System.out.println("Digite o nome do seu personagem");
            nomePersonagem = dados.nextLine().toUpperCase();
            System.out.println("Digite a raça do seu personagem (Humano | Elfo |Tiefling)");
            racaPersonagem = dados.nextLine().toLowerCase();
            System.out.println("Digite a classe do seu personagem (Guerreiro | Mago | Ranger)");
            classePersonagem = dados.nextLine().toLowerCase();

            heroi = new Personagem(nomePersonagem, racaPersonagem, classePersonagem);
            valido = true;
        } catch (IllegalArgumentException e)
        {
            System.out.println(e.getMessage());
            System.out.println("Tente novamente. \n");
        }

        System.out.println("Personagem criado com sucesso!!!");
        System.out.println("Nome: " + heroi.getNome());
        System.out.println("Raça: " + heroi.getRaca());
        System.out.println("Classe: " + heroi.getClasse());
        System.out.println("Vida: " + heroi.getVida());
        System.out.println("Força: " + heroi.getForca());
        System.out.println("Destreza: " + heroi.getDestreza());
        System.out.println("Magia: " + heroi.getMagia());
        System.out.println("Ouro: " + heroi.getOuro());
    }

}