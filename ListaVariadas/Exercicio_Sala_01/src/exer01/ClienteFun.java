package exer01;

public class ClienteFun extends ClienteComum
{
    public ClienteFun (String cpf, String nome, String telefone)
    {
        super(cpf, nome, telefone);
    }
    @Override
    public double clienteDesconto(double valor)
    {
        return valor - (valor*0.3);
    }
}
