package Exer_02;

public class Email implements Notificavel
{
    private String enderecoEmail;
    private String status;

    public Email (String enderecoEmail)
    {
        this.enderecoEmail = enderecoEmail;
        this.status = "Pendente";
    }

    @Override
    public void enviarNotificacao (String mensagem)
    {
        if (validarDestinatario())
        {
            System.out.println("Enviado e-mail para "+ enderecoEmail + ": " + mensagem);
            status = "Enviado!!";
        }
        else
        {
            System.out.println("Endereço de e-mail inválido!!");
            status = "falha";
        }
        
    }
    @Override
    public boolean validarDestinatario ()
    {
        return enderecoEmail != null && enderecoEmail.contains("@");
    }
    @Override
    public String getStatus()
    {
        return status;
    }
}
