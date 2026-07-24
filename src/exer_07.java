import java.util.Scanner;

//7. Conversão de Horas para Minutos:
//Peça ao usuário para inserir um valor em horas e converta para minutos:
public class exer_07
{
    public static void main(String[] args)
    {
        Scanner dados = new Scanner(System.in);
        int valorHora;
        int valorMinu;
        System.out.println("Informe um valor de horas");
        valorHora = dados.nextInt();
        valorMinu = valorHora *60;
        System.out.println("valor convertido de horas é " +valorMinu+ " minutos");
    }
}
