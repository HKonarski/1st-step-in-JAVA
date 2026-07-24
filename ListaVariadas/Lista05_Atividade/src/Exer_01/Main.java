package Exer_01;

public class Main
{
    public static void main (String [] args)
    {
        ContaCorrente cc = new ContaCorrente("001", "Carlos", 500.00);
        ContaPoupanca cp = new ContaPoupanca("002", "Maria", 500.00);

        System.out.println("===== Conta Corrente =====");
        cc.depositar(200);
        cc.sacar(800);
        cc.sacar(1500);

        System.out.println("===== Conta Poupança =====");
        cp.depositar(400);
        cp.sacar(600);
        cp.sacar(500);
    }
}
