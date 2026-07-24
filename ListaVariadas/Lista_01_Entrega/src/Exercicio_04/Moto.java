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
public class Moto extends Veiculo
{
    private int cilindrada;

    public Moto (String marca, String modelo, int ano, int cilindrada)
    {
        super(marca, modelo, ano);
        this.cilindrada = cilindrada;
    }

    public int getCilindrada()
    {
        return cilindrada;
    }

    public void exibirInformacoesM ()
    {
        super.exibirInformacoes();
        System.out.println("possui: " + getCilindrada() + " cilindradas.");
    }
    @Override
    public void acelerar()
    {
        System.out.println("acelerando a moto!!");
    }
    public void frear ()
    {
        System.out.println("Freando a moto!!");
    }

}
