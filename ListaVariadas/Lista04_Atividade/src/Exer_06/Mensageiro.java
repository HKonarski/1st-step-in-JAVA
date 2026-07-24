package Exer_06;

public class Mensageiro
{
    public void enviarMensagem(String texto)
    {
        System.out.println("Mensagem: " + texto);
    }
    public void enviarMensagem (String texto, String destinatario)
    {
        System.out.println("Mensagem para: " + destinatario + ": " + texto);
    }
    public void enviarMensagem (String texto, String destinatario, boolean prioridade)
    {
        if (prioridade)
        {
            System.out.println("Mensagem PRIORITARIA para " + destinatario + ": " + texto);
        }
        else
        {
            System.out.println("Mensagem normal para " + destinatario + ": " + texto);
        }
    }
    public void enviarMensagem (String texto, String destinatario, String anexo)
    {
        System.out.println("Mensagem para: " + destinatario + ": " + texto);
        System.out.println("Anexo incluido: " + anexo);
    }
}
