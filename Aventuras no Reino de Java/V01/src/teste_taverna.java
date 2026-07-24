import java.util.Scanner;

public class teste_taverna
{
    public static void main(String[] args)
    {
        Scanner dados = new Scanner(System.in);
        int vida = 100;
        int força = 10;
        int magia = 10;
        int ouro = 15;
        String nomePersonagem;
        String raçaPersonagem;
        String classePersonagem;
        String consumo;
        String escolher;
        do // vai fazer enquanto o String escolher for "sim"
        {
            if (ouro >= 12)
            {
               do // mantem a conversar para o player escrever "cane" ou "cerveja"
               {
                  System.out.println("Taverneiro: - você quer uma carne ou uma cerveja?");
                  System.out.println("Taverneiro: - a Carne é: 12 ouros\na cerveja é: 5 ouros\ndigite qual você deseja:");
                  consumo = dados.nextLine().toLowerCase();
                    switch (consumo)
                    {
                        case "carne": // vai ajudar a obter mais força para desafio
                            ouro = ouro - 12;
                            força = força + 5;
                            break;
                        case "cerveja": // vai ajudar a deixar sua magia mais forte
                            ouro = ouro - 5;
                            magia = magia + 5;
                            break;
                        default:
                            System.out.println("Por favor aventureiro digite sua opção correta!!");
                    }
               }while (!consumo.equals("carne") && (!consumo.equals("cerveja")));
            } else if (ouro<=5)
        {
            System.out.println("acabou a verba");
        }
            System.out.println("Taverneiro: - você deseja consumir mais alguma coisa?");
            System.out.println("digite SIM para consumir novamente\ndigite NÃO para receber aventura");
            System.out.println(ouro);
            escolher = dados.nextLine().toLowerCase();
            }while (escolher.equals("sim"));

    }
}
