package Exer_05;
public class Main
{
    public static void main(String[] args)
    {
        Usuario comum = new Usuario();
        Usuario premium = new UsuarioPremium();
        Usuario bloqueado = new UsuarioBloqueado();

        comum.enviarNotificacao("Bem-vindo ao sistema!");
        premium.enviarNotificacao("Sua assinatura premium foi renovada.");
        bloqueado.enviarNotificacao("Tentativa de login detectada.");
    }
}
