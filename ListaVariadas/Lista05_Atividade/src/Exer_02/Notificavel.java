package Exer_02;

public interface Notificavel
{
    void enviarNotificacao (String mensagem);
    boolean validarDestinatario();
    String getStatus();
}
