package Exercicio_04;
/*
Exercício 4 - Herança Simples
*--Crie uma classe pai  Veiculo  com atributos protegidos  marca ,  modelo  e  ano , e
métodos:
*--Construtor que inicializa os atributos
*--Método  acelerar()  (apenas exibe uma mensagem genérica)
*--Método  frear()  (apenas exibe uma mensagem genérica)
Crie duas classes filhas:
*--Carro : adiciona atributo  numeroPortas  e sobrescreve  acelerar()
*--Moto : adiciona atributo  cilindrada  e sobrescreve  acelerar()
 */
public class Carro extends Veiculo
{
    private int numPortas;

    public Carro (String marca, String modelo, int ano, int numPortas)
    {
        super(marca, modelo,ano);
        this.numPortas = numPortas;
    }

    public int getNumPortas()
    {
        return numPortas;
    }

    public void exibirInformacoesC ()
    {
        super.exibirInformacoes();
        System.out.println("O veiculo possui :" + getNumPortas() + " de portas.");
    }
    @Override
    public void acelerar ()
    {
        System.out.println("O carro está acelerando!");
    }
    public void frear ()
    {
        System.out.println("O carro está freando!!");
    }

}
