package Exer_04;

public class Main
{
    public static void main (String [] args)
    {
        ContaCorrente user1 = new ContaCorrente("123456","Higor Konarski", 500.00);
        ContaPoupanca user2 = new ContaPoupanca("654321", "Suély Ferreira", 4500.00);
        ContaSalario user3 = new ContaSalario("415263", "Maria da Silva", 300.00);

        System.out.println("-------------*Conta Corrente*-------------");
        user1.exibirInformacoes();
        user1.depositarCc(300);
        user1.sacarCc(100);
        System.out.println("saldo atual: R$" + user1.getSaldo());

        System.out.println("-------------*Conta Poupança*-------------");
        user2.exibirInformacoes();
        user2.depositarCp(600);
        user2.sacarCp(100);
        user2.renderJuros(0.05);

        System.out.println("-------------*Conta Salário*-------------");
        user3.exibirInformacoes();
        user3.depositarCs(100);
        user3.sacarCs(1000);
        System.out.println("saldo atual: R$" + user3.getSaldo());
    }
}
