package Exer_05;
public class UsuarioPremium extends Usuario
{
    @Override
    public void enviarNotificacao(String mensagem)
    {
        System.out.println("Enviando notificação por SMS: " + mensagem);
        super.enviarNotificacao(mensagem);
    }
}

