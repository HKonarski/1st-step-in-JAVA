package Exer_02;

public class Main
{
    public static void main (String [] args)
    {
        Notificavel email = new Email("higor@email.com");
        Notificavel sms = new SMS("4699999999");
        Notificavel push = new PushNotification("device123");

        email.enviarNotificacao("Bem-vinda ao Sistema");
        sms.enviarNotificacao("Seu codigo é 1234");
        push.enviarNotificacao("Você recebeu uma nova mensagem!!");

        System.out.println("Status Email: " + email.getStatus());
        System.out.println("Status SMS: " + sms.getStatus());
        System.out.println("Status Push: " + push.getStatus());
    }
}
