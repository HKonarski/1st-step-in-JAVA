package Exer_02;

public class Carro
{
    String marca;
    String modelo;
    int ano;
    double combustivel;

     public void acelerar(int consumo)
     {
         if(combustivel >= 10)
         {
             combustivel -= consumo;
             System.out.println("Veiculo acelerando!!");
         }
         else
         {
             System.out.println("Veiculo sem combustivel não pode acelerar!!");
         }
     }
}
