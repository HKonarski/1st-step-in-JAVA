package Exer_02;

public class SMS implements Notificavel
{
    private String numTelefone;
    private String status;

    public SMS (String numTelefone)
    {
        this.numTelefone = numTelefone;
        this.status = "Pendente";
    }

    @Override
    public void enviarNotificacao(String mensagem)
    {
        if (validarDestinatario())
        {
            System.out.println("Enviado SMS para " + numTelefone + ": " +mensagem);
            status = "Enviado!!";
        }
        else
        {
            System.out.println("Número de telefone inválido!!");
            status = "falha";
        }
    }
    @Override
    public boolean validarDestinatario()
    {
        return numTelefone != null && numTelefone.matches("\\d{9,13}");
    }
    @Override
    public String getStatus()
    {
        return status;
    }
}
