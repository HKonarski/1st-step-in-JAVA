import java.util.Scanner;

//10. Conversão de Quilômetros para Metros:
// Solicite ao usuário uma distância em quilômetros e converta para metros
public class exer_10
{
    public static void main(String[] args)
    {
        Scanner dados = new Scanner(System.in);
        double numQui;
        double numMet;
        System.out.println("Informe a distância em quilômetros:");
        numQui = dados.nextDouble();
        numMet = numQui * 1000;
        System.out.println("O valor em metros é: "+numMet+"m");
    }
}
