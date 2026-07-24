package Exer_05;
public class UsuarioBloqueado extends Usuario
{
    @Override
    public void enviarNotificacao(String mensagem)
    {
        System.out.println("Usuário bloqueado. Notificação não enviada. Log registrado: " + mensagem);
    }
}
