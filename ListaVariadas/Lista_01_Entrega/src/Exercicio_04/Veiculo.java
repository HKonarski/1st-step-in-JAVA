package Exercicio_04;
/*
Exercício 4 - Herança Simples
Crie uma classe pai  Veiculo  com atributos protegidos  marca ,  modelo  e  ano , e
métodos:
Construtor que inicializa os atributos
Método  acelerar()  (apenas exibe uma mensagem genérica)
Método  frear()  (apenas exibe uma mensagem genérica)
Crie duas classes filhas:
Carro : adiciona atributo  numeroPortas  e sobrescreve  acelerar()
Moto : adiciona atributo  cilindrada  e sobrescreve  acelerar()
 */

public class Veiculo
{
    private String marca;
    private String modelo;
    private int ano;

    public Veiculo (String marca, String modelo, int ano)
    {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }
    public String getModelo()
    {
        return modelo;
    }

    public int getAno()
    {
        return ano;
    }
    public String getMarca()
    {
        return marca;
    }
    public void acelerar()
    {
        System.out.println("Veículo está acelerando!!");
    }
    public void frear()
    {
        System.out.println("Veículo está freando!!");
    }
    public void exibirInformacoes()
    {
        System.out.println("Marcado do Veículo: " + getMarca());
        System.out.println("Modelo do Veículo: " + getModelo());
        System.out.println("Ano do veículo: " + getAno());
    }
}
