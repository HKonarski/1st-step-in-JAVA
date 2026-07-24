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
public class main
{
    public static void main(String[] args)
    {
        Carro c1 = new Carro("Toyota", "Hilux", 1998, 5);
        Moto m1 = new Moto("Yamaha", "YBR", 2020, 125);

        c1.exibirInformacoesC();
        c1.acelerar();
        c1.frear();
        System.out.println("\n --------------*********--------------\n");
        m1.exibirInformacoesM();
        m1.acelerar();
        m1.frear();
    }
}
