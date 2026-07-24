package Exer_06;

public class Main
{
    public static void main (String [] args)
    {
        Mensageiro msg = new Mensageiro();

        msg.enviarMensagem("Olá time!!!");
        msg.enviarMensagem("Não esquecer reunião", "Higor");
        msg.enviarMensagem("Email URGENTE ", "Johna", true );
        msg.enviarMensagem("Planilha mensal ", "Felipe", "relatorio.pdf");
    }
}
