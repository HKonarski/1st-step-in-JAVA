package Exercicio_02;

import java.util.Scanner;

/*
Exercício 2 - Encapsulamento com Validação
*--Crie uma classe ContaBancaria com os atributos privados numero , titular e saldo .
Implemente:
*--Métodos getters para todos os atributos
*--Método setter para titular (apenas)
*--Método depositar(valor) que adiciona valor ao saldo (validar se valor > 0)
*--Método sacar(valor) que remove valor do saldo (validar se há saldo suficiente)
*--Método consultarSaldo() que retorna o saldo atual
 */
public class Main
{
    public static void main(String[] args)
    {
        Scanner dados = new Scanner(System.in);
        int entradaDados;
        double mudaSaque;
        double mudaDepositar;
        String mudaNome;

        ContaBancaria conta1 = new ContaBancaria(001, "Higor Konarski", 533.8);
        ContaBancaria conta2 = new ContaBancaria(002, "Luna Angel", 245.80);

        //Desconsiderar!! fiz por bonito
        System.out.println(conta1.mostrar());
        System.out.println("-------------------------------------------");
        System.out.println(conta2.mostrar());
        System.out.println("-------------------------------------------");
        System.out.println("-------------------------------------------");

        //Fazer um do-while para acessar a conta.


        System.out.println("-------------------------------------------");
        do
        {
            System.out.println( "1- Para Mudar o Nome do Titular: \n" +
                            "2- Para consultar dados da conta: \n" +
                            "3- Para consultar saldo: \n" +
                            "4- Para Sacar: \n" +
                            "5- Para Depositar: \n" +
                            "6- Para Encerrar:");

            entradaDados = dados.nextInt();
            mudaNome = dados.nextLine();
            switch (entradaDados)
            {
                case 1:
                    System.out.println("Informe o novo nome: ");
                    mudaNome = dados.nextLine();
                    conta1.setNomeTitular(mudaNome);
                    break;
                case 2:
                    //Getter!!
                    System.out.println(conta1.getNomeTitular() + " "+conta1.getNumeroConta());
                    System.out.println(conta2.getNomeTitular() + " "+conta2.getNumeroConta());
                    break;
                case 3:
                    System.out.println(conta1.consultarSaldo());
                    break;
                case 4:
                    System.out.println("Informe valor que deseja sacar:");
                    mudaSaque = dados.nextDouble();
                    conta1.sacar(mudaSaque);
                    break;
                case 5:
                    System.out.println("informe valor que deseja depositar:");
                    mudaDepositar = dados.nextDouble();
                    conta1.depositar(mudaDepositar);
                    break;
                case 6:
                    System.out.println("Encerrando...");
                    break;
                default:
                    System.out.println("Opção invalida:");
            }
        } while (entradaDados != 6);
        System.out.println(conta1.mostrar());
    }
}
