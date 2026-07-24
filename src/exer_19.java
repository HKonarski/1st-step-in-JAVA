import java.util.Scanner;

/*
19. Escreva um programa que simule um caixa eletrônico. O usuário deve informar o
valor que deseja sacar, e o programa deve calcular quantas notas de 100, 50, 20,
10, 5 e 2 reais serão necessárias. Considere que o caixa só tem notas desses
valores
 */
public class exer_19
{
    public static void main(String[] args)
    {
        Scanner dados = new Scanner(System.in);
        int valorSaque;
        int Vcem;
        int Vcinquenta;
        int Vvinte;
        int Vdez;
        int Vcinco;
        int Vdois;

        System.out.println("informe o valor que deseja sacar");
        valorSaque = dados.nextInt();

        Vcem = valorSaque / 100;
        valorSaque = valorSaque % 100;

        Vcinquenta = valorSaque / 50;
        valorSaque = valorSaque % 50;

        Vvinte = valorSaque / 20;
        valorSaque = valorSaque % 20;

        Vdez = valorSaque / 10;
        valorSaque = valorSaque % 10;

        Vcinco = valorSaque / 5;
        valorSaque = valorSaque % 5;

        Vdois = valorSaque / 2;
        valorSaque = valorSaque % 2;

        System.out.println("O valor em cedulas  de cem: "+Vcem+
                "\nValor das cedulas de cinquenta: "+Vcinquenta+
                "\nValor das cedulas de vinte: " +Vvinte+
                "\nValor das cedulas de dez: "+Vdez+
                "\nValor das cedulas de cinco: " +Vcinco+
                "\nValor das cedulas de dois: "+Vdois);

    }
}
