import java.util.Random;
import java.util.Scanner;

public class APS_01
{
    public static void main(String[] args)
    {
        Scanner dados = new Scanner(System.in);
        Random rollRandom = new Random();
        // Status iniciais do personangem
        int vida = 100;
        int força = 10;
        int destresa = 10;
        int magia = 10;
        int ouro = 20;
        // Status do Goblin
        int vidaGoblin = 100;
        int forçaGoblin = 10;
        // ações de desenvolvimento do personagem
        String nomePersonagem;
        String raçaPersonagem;
        String classePersonagem;
        String consumo;
        String escolher;
        String aceitar;
        String combate;
        // movimentação de combate
        int dano; //resolução do dano causado (rolagem + força) / 2
        int danoGoblin; //Dano que o goblin vai causar esse dano usa quando defende também
        int contDanogoblin =0; /*variavel armazena dano causado do goblin*/

        System.out.println("***********Bem vindo ao Adventure game HK!!***********\n Digite o nome do seu personagem:\n");
        nomePersonagem = dados.nextLine();
        do // inicio laço raça - mantem a escolha da raça
        {
            System.out.println("Digite a raça do seu personagem:");
            System.out.println("Humano");
            System.out.println("Elfo");
            System.out.println("Tiefling");
            raçaPersonagem = dados.nextLine().toLowerCase();
            switch (raçaPersonagem)
            {
                case "humano":
                    força = força + 5;
                    break;
                case "elfo":
                    magia = magia + 5;
                    break;
                case "tiefling":
                    destresa += 5;
                    break;
                default:
                    System.out.println("Raça incorreta!!\n");

            }

        } while (!raçaPersonagem.equals("humano") && (!raçaPersonagem.equals("elfo"))&& (!raçaPersonagem.equals("tiefling"))); // fim laço raça
        do //inicio laço classe
        {
            System.out.println("Digite a Classe do seu personagem");
            System.out.println("Guerreiro");
            System.out.println("Mago");
            System.out.println("Ranger");
            classePersonagem = dados.nextLine().toLowerCase();

                switch (classePersonagem)
                {
                    case "guerreiro":
                        if(raçaPersonagem.equals("humano"))
                        {
                            força = força + 5;
                        }
                        break;
                    case "mago":
                        if(raçaPersonagem.equals("elfo"))
                        {
                            magia = magia + 5;
                        }
                        break;
                    case "ranger":
                        if (raçaPersonagem.equals("tiefling"))
                        {
                            destresa += 5;
                        }
                        break;
                    default:
                        System.out.println("Classe incorreta!!");
                }
        } while (!classePersonagem.equals("guerreiro") && (!classePersonagem.equals("mago"))&& (!classePersonagem.equals("ranger")));
        // fim laço classe

        System.out.println(nomePersonagem+" você é um "+raçaPersonagem.toUpperCase()+ " "+classePersonagem.toUpperCase()+". Você um bravo aventureiro que ao chegar na cidade\nouviu dizer que o taverneiro sabia de uma aventura.\n" +
                "Sem pensar duas vezes, você vai até a taverna e encosta no balcão.");
        System.out.println(nomePersonagem+": - Boa noite, ouvi dizer que você sabe de uma aventura." +
                "\nTaverneiro: - Posso lhe contar, mas primeiro beba ou coma algo:");

            //while (ouro >= 12) // manter a compra enquanto estiver 12 ou mais ouros
            //{
        do // vai fazer enquanto o String escolher for "sim"
        {
            do // mantem a conversar para o player escrever "carne" ou "cerveja"
            {
                System.out.println("Taverneiro: - você quer uma carne ou uma cerveja?");
                System.out.println("Taverneiro: - a Carne é: 12 ouros\na cerveja é: 5 ouros\ndigite qual você deseja:");
                consumo = dados.nextLine().toLowerCase();
                if (ouro >= 12) //mantem comprando se tive 12 ou mais ouros
                {
                switch (consumo)
                     {
                            case "carne": // vai ajudar a obter mais força para desafio
                            ouro = ouro - 12;
                            força = força + 1;
                        break;
                            case "cerveja": // vai ajudar a deixar sua magia mais forte
                            ouro = ouro - 5;
                            magia = magia + 1;
                                break;
                         default:
                            System.out.println("Por favor aventureiro digite sua opção correta!!");
                     }
                }else // frase para quando tiver menos que 12 ouros
                {
                    System.out.println("parece que você não tem mais ouro aventureiro");
                }
                }while (!consumo.equals("carne") && (!consumo.equals("cerveja"))); // fim do laço carne ou cerveja

                System.out.println("Taverneiro: - você deseja consumir mais alguma coisa?");
                System.out.println("digite SIM para consumir novamente " +
                        "ou pressione outra tecla para receber aventura");
                escolher = dados.nextLine().toLowerCase();
            }while (escolher.equals("sim")); // fim do laço do consumo
        //}
        System.out.println("Taverneiro: - você já consumiu bastante, vou lhe contar sobre aventura." +
                "\nExiste um goblin terrível acabando com as plantações dos fazendeiros da vila.\n" +
                "Derrote o goblin e receba 200 moedas de ouro do governante da vila. Você aceita? " +
                "(digite SIM para aceitar ou pressione qualquer outra tecla para recusar)");
        aceitar = dados.nextLine().toLowerCase();
        if (aceitar.equals("sim")) // inicio da batalha
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
                        // resolução de dano para guerreiro
                        if (classePersonagem.equals("guerreiro"))
                        {
                            int rolagem = rollRandom.nextInt(1, 10); // random da força
                            dano = (rolagem + força) / 2;
                            vidaGoblin = vidaGoblin - dano;
                            if(vidaGoblin>=1) // mostra os valores enquanto goblin vivo
                            {
                                System.out.println("Você atacou " + dano+ " dano fisico");
                                System.out.println("O globin está com " + vidaGoblin + " de vida");
                            }
                            // resolução de dano mago
                        } else if (classePersonagem.equals("mago"))
                        {
                            int rolagem = rollRandom.nextInt(1, 10); // random da magia
                            dano = (rolagem + magia) / 2;
                            vidaGoblin = vidaGoblin - dano;
                            if (vidaGoblin>=1) // mostra os valores enquanto goblin vivo
                            {
                                System.out.println("você atacou " + dano+ " dano magico");
                                System.out.println("O globin está com " + vidaGoblin + " de vida");
                            }

                        }
                        // resolução de dano ranger
                        else if (classePersonagem.equals("ranger"))
                    {
                        int rolagem = rollRandom.nextInt(1, 10); // random da magia
                        dano = (rolagem + magia) / 2;
                        vidaGoblin = vidaGoblin - dano;
                        if (vidaGoblin>=1) // mostra os valores enquanto goblin vivo
                        {
                            System.out.println("você acertou uma flecha causando " + dano+" de dano");
                            System.out.println("O globin está com " + vidaGoblin + " de vida");
                        }

                    }
                        break;
                    case "defender": // Reduz o ataque do goblin (pensar em algo melhor)!!
                        int rolagemGo = rollRandom.nextInt(1, 8); //faz o random de ataque do goblin
                        danoGoblin = ((rolagemGo +forçaGoblin) / 2)/2;
                        vida = vida - danoGoblin;
                        if(vida>=1)
                        {
                            System.out.println("Você se defendeu!! voce recebeu " + danoGoblin + " de dano\nvocê está com " + vida + " de vida\n");
                        }
                        contDanogoblin += danoGoblin;
                        break;
                    default:
                        System.out.println("Favor digitar de forma correta");
                        break;
                }
                if (combate.equals("atacar") && (vidaGoblin>=1)) // gera o ataque do goblin após atque do plauyer
                {
                    int rolagemGo = rollRandom.nextInt(1, 10); // faz o random de ataque do goblin
                    danoGoblin = (rolagemGo + forçaGoblin) / 2;
                    vida = vida - danoGoblin;
                    System.out.println("Você sofreu " + danoGoblin + " do Goblin");
                    if(vida>=1)
                    {
                        System.out.println("você está com " + vida + " de vida\n");
                    }
                    contDanogoblin += danoGoblin;
                }

            }while ((vidaGoblin >= 1) && (vida >=1)); //fim laço batalha
        }
        if (vidaGoblin<=0) //mantem o jogo  dentro desse if
        {
            vida += contDanogoblin;
            System.out.println("PARABÉNS VOCÊ DERROTOU O GOBLIN!!\n");
            System.out.println("Após sua brilhante vitória o governante da cidade veio agradecer e lhe entregar" +
                    " sua recompensa");
            System.out.println("Governante: - Você fez um excelente trabalho "+nomePersonagem+
                    " muito obrigado por salvar minha fazendo desse goblin como prometido suas 200 peças de ouro");
            ouro +=200;
            força += 10;
            magia += 10;
            vida += 100;
            System.out.println("Você recebeu 200 peças de ouro. Status: "+ouro+" peças de ouro"); //status atual de ouro
            System.out.println("Você recebeu +10 de força. Status: "+força+" força"); // status atual de força
            System.out.println("Você recebeu +10 de magia. Status: "+magia+" magia"); // status atual de magia
            System.out.println("Você receber +100 de vida. Status: "+vida+" vida"); // status atual de vida
        }
        else if (vida<=0) // caso perca a batalha
        {
            System.out.println("                                        RIP - você lutou bravamente sempre será lembrado");
            System.out.println("                                                   ......................                                                          \n" +
                    "                                                          ............................                                                      \n" +
                    "                                                      ............  ----..  ..............                                                  \n" +
                    "                                                ..........  ::--------------------......    ..                                              \n" +
                    "                                              ........  ------------------------------..  ......                                            \n" +
                    "                                            ........--------------------------------  ::::........                                          \n" +
                    "                                          ......  ::--------------------------------::------........                                        \n" +
                    "                                        ........----------------------------------------------........                                      \n" +
                    "                                        ......--------------------------------------::----------......                                      \n" +
                    "                                        ....----------------------------------------------------........                                    \n" +
                    "                                      ......------------------------------------  ::--------------  ....                                    \n" +
                    "                                      ....----------------------------------------------------------......                                  \n" +
                    "                                    ......----------------------------------------------------------......                                  \n" +
                    "                                    ....  ----------------------------------------------------------  ....                                  \n" +
                    "                                    ....--------------------------------------------------------------......                                \n" +
                    "                                  ......--------------------------------------------------------------....                                  \n" +
                    "                                    ....--------------------------------------------------------------....                                  \n" +
                    "                                    ....--------------------------------------------------------------....                                  \n" +
                    "                                    ....--------####::------------------------------------------------....                                  \n" +
                    "                                    ....------::####++MMMMMMM---------MM--------MMMMMMM---------------....                                  \n" +
                    "                                    ....--------++##::MM----MM--------MM------::MM--::MM--------------....                                  \n" +
                    "                                    ....----------::--MM----mm--------MM------::MM----MM--------------....                                  \n" +
                    "                                    ....--------------MM----@@--------MM------::MM----MM--------------....                                  \n" +
                    "                                    ....--------------MMMM@@----------MM------::MMMM@@----------------....                                  \n" +
                    "                                    ....--------------MM----MM--------MM------::MM--------------------....                                  \n" +
                    "                                    ....--------------MM----MM--------MM------::MM--------------------....                                  \n" +
                    "                                    ....--------------MM------@@++MM--MM--MMMM::MM--------------------....                                  \n" +
                    "                                    ....--------------------------------------------------------------....                                  \n" +
                    "                                    ....--------------------------------------------------------------....                                  \n" +
                    "                                    ....--------------------------------------------------------------....                                  \n" +
                    "                                    ....--------------------------------------------------------------....                                  \n" +
                    "                                    ....--------------------------------------------------------------....                                  \n" +
                    "                                    ....--------------------------------------------------------------....                                  \n" +
                    "                                    ....--------------------------------------------------------------....                                  \n" +
                    "                                    ....--------------------------------------------------------------....                                  \n" +
                    "                                    ....----------------------------------------------------::--------....                                  \n" +
                    "                                    ....--------------------------------------++::------::::----::----....                                  \n" +
                    "                                    ....----------------------------------------mm::------------------..  ..                                \n" +
                    "                                    ....------------------------------------------++--------::--------  ++                                  \n" +
                    "                                    ....--------------------------------------------mmmm::--++------::..                                    \n" +
                    "                                    ....--------------------------------------------::----mmmm::--::mm..--                                  \n" +
                    "                                    ....--------------------------------------------::mm----::--++--mm....                                  \n" +
                    "                                    ....----------------------------------------------mmmm----MM------..                                    \n" +
                    "                        --..........................................................................................                        \n" +
                    "                        --..........................................................................................                        \n" +
                    "                        --..........................................................................................                        \n" +
                    "                        --..........................................................................................                        \n" +
                    "                        --..........................................................................................                        \n" +
                    "                        --..........................................................................................                        \n" +
                    "                    mmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmm                  \n" +
                    "                    mmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmm                  \n" +
                    "                    mmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmm                  \n" +
                    "                    mmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmm                  \n" +
                    "                    mmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmm ");
        }
        else //frase quando recusar entrar na batalha
        {
            System.out.println("então tenha uma boa noite!!");
        }


    }
}
