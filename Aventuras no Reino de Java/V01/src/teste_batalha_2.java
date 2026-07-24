import java.util.Scanner;
import java.util.Random;
public class teste_batalha_2
{
    public static void main(String[] args)
    {
        Scanner dados = new Scanner(System.in);
        Random rollRandom = new Random();
        int vida = 30;
        int força = 10;
        int magia = 10;
        int ouro = 15;
        int vidaGoblin = 30;
        int forçaGoblin = 10;
        String nomePersonagem;
        String raçaPersonagem;
        String classePersonagem;
        String consumo;
        String escolher;
        String aceitar;
        String combate;
        int rolagem = rollRandom.nextInt(10);
        int rolagemGo = rollRandom.nextInt(10);
        int dano;
        int danoGoblin;
        do
        {
            System.out.println("Digite a Classe do seu personagem");
            System.out.println("Guerreiro");
            System.out.println("Mago");
            classePersonagem = dados.nextLine().toLowerCase();

            switch (classePersonagem) {
                case "guerreiro":
                    força = força + 5;
                    break;
                case "mago":
                    magia = magia + 5;
                    break;
                default:
                    System.out.println("Classe incorreta!!");
            }
        } while (!classePersonagem.equals("guerreiro") && (!classePersonagem.equals("mago")));
        System.out.println("Taverneiro: - você já consumiu bastante, vou lhe contar sobre aventura." +
                "\nExiste um goblin terrível acabando com as plantações dos fazendeiros da vila.\n" +
                "Derrote o goblin e receba 200 moedas de ouro do governante da vila. Você aceita?");
        aceitar = dados.nextLine().toLowerCase();
        if (aceitar.equals("sim"))
        {
            System.out.println("Você começa a caminhar até as terras do interior da vila.\n" +
                    "Em uma das fazendas você encontra o goblin atacando.");
            do
            {
                System.out.println("Deseja atacar ou defender ");
                combate = dados.nextLine().toLowerCase();
                switch (combate)
                {
                    case "atacar":
                        if (classePersonagem.equals("guerreiro"))
                        {
                            dano = (rolagem + força) / 2;
                            vidaGoblin = vidaGoblin - dano;
                            System.out.println("dano foi: " + dano);
                            System.out.println("O globin está com " + vidaGoblin + " de vida");
                        } else if (classePersonagem.equals("mago"))
                        {
                            dano = (rolagem + magia) / 2;
                            vidaGoblin = vidaGoblin - dano;
                            System.out.println("O globin está com " + vidaGoblin + " de vida");

                        }
                        break;
                    case "defender": // Reduz o ataque do goblin pensar em algo melhor!!
                        danoGoblin = ((rolagemGo +forçaGoblin) / 2)/2;
                        vida = vida - danoGoblin;
                        System.out.println("Você se defendeu!! voce recebeu "+danoGoblin+" de dano\nvocê está com "+vida+ " de vida\n");

                        break;
                    default:
                        break;
                }
                if (combate.equals("atacar") && (vidaGoblin>=1)) // gera o ataque do goblin após atque do plauyer
                {
                    danoGoblin = (rolagemGo + forçaGoblin) / 2;
                    vida = vida - danoGoblin;
                    System.out.println("Você sofreu " + danoGoblin + " do Goblin");
                    System.out.println("você está com " + vida + " de vida\n");
                }

            }while ((vidaGoblin >= 1) && (vida >=1));
        }
        if (vidaGoblin<=0) //mantem o jogo  dentro desse if
        {
            System.out.println("PARABÉNS VOCÊ DERROTOU O GOBLIN!!");

        }
        else if (vida<=0)
        {
            System.out.println("RIP - você lutou bravamente sempre será lembrado");
        }
        else
        {
            System.out.println("então tenha uma boa noite!!");
        }

    }
}
