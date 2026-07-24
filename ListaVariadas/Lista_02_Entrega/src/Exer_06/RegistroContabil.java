package Exer_06;

public class RegistroContabil extends Registro
{
    public RegistroContabil(String conteudo)
    {
        super(conteudo);
    }
    @Override
    public boolean validarIntegridade()
    {
        return conteudo != null && conteudo.contains("R$") && conteudo.length() >= 10;
    }
}
