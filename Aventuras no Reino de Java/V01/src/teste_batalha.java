import java.util.Scanner;
import java.util.Random;
public class teste_batalha
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
        int dano;
        int danoGoblin;
        int contDanogoblin =0; /*variavel armazena dano causado do goblin*/
        do
        {
            System.out.println("Digite a Classe do seu personagem");
            System.out.println("Guerreiro");
            System.out.println("Mago");
            classePersonagem = dados.nextLine().toLowerCase();

            switch (classePersonagem)
            {
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
                "Derrote o goblin e receba 200 moedas de ouro do governante da vila. Você aceita? " +
                "(digite S para aceitar ou pressione qualquer outra tecla para recusar)");
        aceitar = dados.nextLine().toLowerCase();
        if (aceitar.equals("s")) // inicio da batalha
        {
            System.out.println("Você começa a caminhar até as terras do interior da vila.\n" +
                    "Em uma das fazendas você encontra o goblin atacando.");
            do //inicio laço batalha
            {
                System.out.println("Deseja atacar ou defender ");
                combate = dados.nextLine().toLowerCase();
                switch (combate)
                {
                    case "atacar":
                        if (classePersonagem.equals("guerreiro"))
                        {
                            int rolagem = rollRandom.nextInt(1, 10); // random da força
                            dano = (rolagem + força) / 2;
                            vidaGoblin = vidaGoblin - dano;
                            System.out.println("dano foi: " + dano);
                            System.out.println("O globin está com " + vidaGoblin + " de vida");
                        } else if (classePersonagem.equals("mago"))
                        {
                            int rolagem = rollRandom.nextInt(1, 10); // random da magia
                            dano = (rolagem + magia) / 2;
                            vidaGoblin = vidaGoblin - dano;
                            System.out.println("O globin está com " + vidaGoblin + " de vida");

                        }
                        break;
                    case "defender": // Reduz o ataque do goblin (pensar em algo melhor)!!
                        int rolagemGo = rollRandom.nextInt(1, 8); //faz o random de ataque do goblin
                        danoGoblin = ((rolagemGo +forçaGoblin) / 2)/2;
                        vida = vida - danoGoblin;
                        System.out.println("Você se defendeu!! voce recebeu "+danoGoblin+" de dano\nvocê está com "+vida+ " de vida\n");
                        contDanogoblin += danoGoblin;
                        break;
                    default:
                        System.out.println("Favor digitar da forma correta");
                        break;
                }
                if (combate.equals("atacar") && (vidaGoblin>=1)) // gera o ataque do goblin após atque do plauyer
                {
                    int rolagemGo = rollRandom.nextInt(1, 8); // faz o random de ataque do goblin
                    danoGoblin = (rolagemGo + forçaGoblin) / 2;
                    vida = vida - danoGoblin;
                    System.out.println("Você sofreu " + danoGoblin + " do Goblin");
                    System.out.println("você está com " + vida + " de vida\n");
                    contDanogoblin += danoGoblin;
                }

            }while ((vidaGoblin >= 1) && (vida >=1)); //fim laço batalha
        }
        if (vidaGoblin<=0) //mantem o jogo  dentro desse if
        {
           System.out.println(vida);
           System.out.println(contDanogoblin);
           vida += contDanogoblin;
           System.out.println(vida);
            System.out.println("PARABÉNS VOCÊ DERROTOU O GOBLIN!!\n");
            System.out.println("Após sua brilhante vitória o governante da cida veio agradecer e lhe entregar" +
                    "o primeiro de agradecimento de 200 moedas de ouro");
            ouro +=200;
            força += 10;
            magia += 10;
            vida += 100;
            System.out.println("Você está com "+ouro+" peças de ouro"); //status atual de ouro
            System.out.println("Você está com "+força+" força"); // status atual de força
            System.out.println("Você está com "+magia+" magia"); // status atual de magia
            System.out.println("Você está com "+vida+" vida"); // status atual de vida
        }
        else if (vida<=0) // caso perca a batalha
        {
            System.out.println("RIP - você lutou bravamente sempre será lembrado");
        }
        else //frase quando recusar entrar na batalha
        {
            System.out.println("então tenha uma boa noite!!");
        }

    }
}
