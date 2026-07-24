import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner dados = new Scanner(System.in);
        char[][] jogoDaVelha = new char[3][3];
        String player01;
        String player02;
        String playerAtual;
        char playerSimbolo;
        int jogdas = 0;
        int turno = 0;
        int linha;
        int coluna;

        for (int i =0; i<jogoDaVelha.length; i++)
        {
            for (int j=0;j< jogoDaVelha[i].length;j++)
            {
                jogoDaVelha[i][j] = ' ';
            }
        }
        System.out.println("Digite o nome do jogador para o (X): ");
        player01 = dados.nextLine().toUpperCase();
        System.out.println("Digite o nome do jogador para o (O): ");
        player02 = dados.nextLine().toUpperCase();
        while (jogdas < 9)
        {
            System.out.println("\n  0   1   2 ");
            for(int i = 0; i<jogoDaVelha.length; i++)
            {
                System.out.println(" ------------");
                System.out.println(i+" ");
                for (int j=0; j<jogoDaVelha[i].length;j++)
                {
                    System.out.print("|"+ jogoDaVelha[i][j]+ " ");
                }
                System.out.println("|");
            }
            System.out.println(" ------------\n");
            if (turno % 2==0)
            {
                playerAtual = player01;
                playerSimbolo = 'X';
            }else
            {
                playerAtual = player02;
                playerSimbolo = 'O';
            }
            System.out.println(playerAtual+" ("+playerSimbolo+") - Sua vez!");
            System.out.printf("Dgitie a linha (0-2): ");
            linha = dados.nextInt();
            System.out.printf("Digite a coluna (0-2): ");
            coluna = dados.nextInt();
            if (linha >= 0 && linha <3 && coluna >=0 && coluna <3 && jogoDaVelha [linha][coluna]==' ')
            {
                jogoDaVelha[linha][coluna] = playerSimbolo;
                jogdas++;
                turno++;
                    for (int i = 0; i< 3; i++)
                {
                    if ((jogoDaVelha[i][0] == playerSimbolo && jogoDaVelha[i][1] == playerSimbolo && jogoDaVelha[i][2] == playerSimbolo) ||
                        (jogoDaVelha[0][i] == playerSimbolo && jogoDaVelha[1][i] == playerSimbolo && jogoDaVelha[2][i] == playerSimbolo))
                    {
                        System.out.println("Parabéns, " + playerAtual + "! Você venceu!");
                        break;
                    }
                    if ((jogoDaVelha[0][0] == playerSimbolo && jogoDaVelha[1][1] == playerSimbolo && jogoDaVelha[2][2] == playerSimbolo) ||
                        (jogoDaVelha[0][2] == playerSimbolo && jogoDaVelha[1][1] == playerSimbolo && jogoDaVelha[2][0] == playerSimbolo))
                    {
                        System.out.println("Parabéns, " + playerAtual + "! Você venceu!");
                        break;
                    }

                }
            }else
            {
                System.out.println("jogada inválida!");
            }
        }
        System.out.println("Deu velha!");
    }
}