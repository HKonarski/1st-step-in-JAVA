package Exer_06;

public class RegistroTransacao extends Registro
{

    public RegistroTransacao(String conteudo)
    {
        super(conteudo);
    }

    @Override
    public boolean validarIntegridade() {
        return conteudo != null && conteudo.contains("ID:") && conteudo.contains("VALOR:");
    }
}
