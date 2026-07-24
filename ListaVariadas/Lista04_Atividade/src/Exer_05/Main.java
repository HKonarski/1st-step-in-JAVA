package Exer_05;

import java.util.Scanner;

public class Main
{
    public static void main (String [] args)
    {
        Scanner dados = new Scanner(System.in);
        Calculadora calc = new Calculadora();
        int numSoma1;
        int numSoma2;
        int numSoma3;
        double numMult1;
        double numMult2;

        System.out.println("Informe o valores para soma de dois inteiros:");
        numSoma1 = dados.nextInt();
        numSoma2 = dados.nextInt();
        System.out.println(" valor da soma é: " + calc.calcular(numSoma1, numSoma2));
        System.out.println("------------------**********------------------");
        System.out.println("Informe o valores para soma de tres inteiros:");
        numSoma1 = dados.nextInt();
        numSoma2 = dados.nextInt();
        numSoma3 = dados.nextInt();
        System.out.println("O valor da soma é: " + calc.calcular(numSoma1, numSoma2, numSoma3));
        System.out.println("------------------**********------------------");
        System.out.println("Informe o valores para multipliacação de dois números:");
        numMult1 = dados.nextDouble();
        numMult2 = dados.nextDouble();
        System.out.println("O valor da multiplicação é: " + calc.calcular(numMult1, numMult2));
        System.out.println("------------------**********------------------");
        System.out.println("Informe um valor para mostrar seu valor quadrado:");
        numSoma3 = dados.nextInt();
        System.out.println("O valor quadrado é: " + calc.calcular(numSoma3));
    }

}
