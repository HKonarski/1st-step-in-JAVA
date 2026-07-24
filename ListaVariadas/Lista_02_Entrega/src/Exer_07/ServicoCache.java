package Exer_07;

public class ServicoCache extends Componente
{

    public ServicoCache(String versao)
    {
        super(versao);
    }

    @Override
    public void iniciarComponente()
    {
        System.out.println("Inicializando serviço de cache...");
        System.out.println("Alocando memória e carregando dados em cache.");
    }

    @Override
    public void desligarComponente()
    {
        System.out.println("Desligando serviço de cache...");
        System.out.println("Liberando memória e limpando dados temporários.");
    }
}