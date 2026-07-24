package exer01;

public class ClienteVip extends ClienteComum
{
    public ClienteVip (String cpf, String nome, String telefone)
    {
        super(cpf, nome, telefone);
    }
    @Override
    public double clienteDesconto (double valor)
    {
        return valor - (valor *0.15);
    }
}
