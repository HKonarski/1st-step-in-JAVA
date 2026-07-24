package exer01;

public class ClienteComum {
    private String cpf;
    private String nome;
    private String telefone;

    public ClienteComum(String cpf, String nome, String telefone) {
        this.cpf = cpf;
        this.nome = nome;
        this.telefone = telefone;
    }

    public double clienteDesconto(double valor)
    {
        return valor - (valor * 0.05);
    }
}
