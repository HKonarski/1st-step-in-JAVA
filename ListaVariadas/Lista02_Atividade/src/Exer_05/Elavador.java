package Exer_05;

public class Elavador
{
    private int andarAtual;
    private int totalAndares;
    private int capacidade;
    private int pessoasPresentes;

    public Elavador(int totalAndares, int capacidade)
    {
        this.andarAtual = 0;
        this.totalAndares = totalAndares;
        this.capacidade = capacidade;
        this. pessoasPresentes = 0;
    }

    public int getAndarAtual()
    {
        return andarAtual;
    }
    public void exibirInformacoes ()
    {
        System.out.println("Andar atual: " + andarAtual);
        System.out.println("Total de andares: " + totalAndares);
        System.out.println("Pessoas presentes: " + pessoasPresentes);
        System.out.println("--------------*******--------------");
    }
    public void etrar (int quantidade) {
        if (quantidade + pessoasPresentes <= capacidade)
        {
            pessoasPresentes += quantidade;
            System.out.println("entraram " + quantidade + " pessoas. Total: " + pessoasPresentes);
        } else {
            System.out.println("Capacidade excedida. Não pode haver mais pessoas dentro");
        }
    }
    public void sair (int quantidade)
        {
            if (quantidade <= pessoasPresentes)
            {
                pessoasPresentes -= quantidade;
                System.out.println("Sairam " + quantidade + " pessoas. Total: " + pessoasPresentes);
            }
            else
            {
                System.out.println("Não a pessoas no elevador");
            }
        }
    public void subir ()
    {
        if (andarAtual <= totalAndares)
        {
            andarAtual++;
            System.out.println("subindo para o andar: " + andarAtual);
        }
        else
        {
            System.out.println("Você ja está no ultimo andar!!");
        }
    }
    public void descer ()
    {
        if (andarAtual > 0)
        {
            andarAtual --;
            System.out.println("Desceu para o andar: " + andarAtual);
        }
        else
        {
            System.out.println("Voce está no térreo!!");
        }
    }
}
