import java.util.Scanner;

public class JogoDaVelha {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[][] tabuleiro = new char[3][3];

        // Inicializa o tabuleiro com espaços vazios
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                tabuleiro[i][j] = ' ';
            }
        }

        // Recebe nomes dos jogadores
        System.out.print("Digite o nome do Jogador 1 (X): ");
        String jogador1 = scanner.nextLine();
        System.out.print("Digite o nome do Jogador 2 (O): ");
        String jogador2 = scanner.nextLine();

        int jogadas = 0;
        int turno = 0; // Alterna entre 0 (Jogador 1) e 1 (Jogador 2)

        while (jogadas < 9) {
            // Exibir o tabuleiro
            System.out.println("\n  0   1   2 ");
            for (int i = 0; i < 3; i++) {
                System.out.println(" ------------");
                System.out.print(i + " ");
                for (int j = 0; j < 3; j++) {
                    System.out.print("| " + tabuleiro[i][j] + " ");
                }
                System.out.println("|");
            }
            System.out.println(" ------------\n");

            // Determinar jogador atual
            String jogadorAtual = (turno % 2 == 0) ? jogador1 : jogador2;
            char simboloAtual = (turno % 2 == 0) ? 'X' : 'O';
            System.out.println(jogadorAtual + " (" + simboloAtual + ") - Sua vez!");

            // Ler e validar jogada
            System.out.print("Digite a linha (0-2): ");
            int linha = scanner.nextInt();
            System.out.print("Digite a coluna (0-2): ");
            int coluna = scanner.nextInt();

            if (linha >= 0 && linha < 3 && coluna >= 0 && coluna < 3 && tabuleiro[linha][coluna] == ' ') {
                tabuleiro[linha][coluna] = simboloAtual;
                jogadas++;
                turno++;

                // Verificar vitória
                for (int i = 0; i < 3; i++) {
                    if ((tabuleiro[i][0] == simboloAtual && tabuleiro[i][1] == simboloAtual && tabuleiro[i][2] == simboloAtual) ||
                            (tabuleiro[0][i] == simboloAtual && tabuleiro[1][i] == simboloAtual && tabuleiro[2][i] == simboloAtual)) {
                        System.out.println("Parabéns, " + jogadorAtual + "! Você venceu!");
                        return;
                    }
                }
                if ((tabuleiro[0][0] == simboloAtual && tabuleiro[1][1] == simboloAtual && tabuleiro[2][2] == simboloAtual) ||
                        (tabuleiro[0][2] == simboloAtual && tabuleiro[1][1] == simboloAtual && tabuleiro[2][0] == simboloAtual)) {
                    System.out.println("Parabéns, " + jogadorAtual + "! Você venceu!");
                    return;
                }
            } else {
                System.out.println("Jogada inválida! Perdeu a vez!");
            }
        }

        // Se todas as jogadas forem feitas e ninguém vencer, o jogo empata
        System.out.println("Deu velha! O jogo empatou.");
        scanner.close();
    }
}
