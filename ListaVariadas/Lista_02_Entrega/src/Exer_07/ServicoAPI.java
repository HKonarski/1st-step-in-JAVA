package Exer_07;

public class ServicoAPI extends Componente
{

    public ServicoAPI(String versao)
    {
        super(versao);
    }

    @Override
    public void iniciarComponente()
    {
        System.out.println("Inicializando serviço de API...");
        System.out.println("Estabelecendo conexões e carregando endpoints.");
    }

    @Override
    public void desligarComponente()
    {
        System.out.println("Desligando serviço de API...");
        System.out.println("Encerrando conexões e liberando recursos.");
    }
}