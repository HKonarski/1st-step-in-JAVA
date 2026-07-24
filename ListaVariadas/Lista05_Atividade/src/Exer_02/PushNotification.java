package Exer_02;

public class PushNotification implements Notificavel
{
    private String dispositiviId;
    private String status;

    public PushNotification (String dispositiviId)
    {
        this.dispositiviId = dispositiviId;
        this.status = "Pendente";
    }
    @Override
    public void enviarNotificacao (String mensagem)
    {
        if (validarDestinatario())
        {
            System.out.println("Enviando push notification para dispositivo " + dispositiviId + ": " + mensagem);
            status = "Enviado!!";
        }
        else
        {
            System.out.println("Dispositivo inválido!!");
            status = "falha!";
        }
    }
    @Override
    public boolean validarDestinatario()
    {
        return dispositiviId != null && !dispositiviId.isEmpty();
    }
    @Override
    public String getStatus()
    {
        return status;
    }
}
