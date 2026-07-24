package Exer_08;

public class RepositorioSQL implements RepositorioGenerico
{

    @Override
    public void salvar(Object item)
    {
        System.out.println("Executando INSERT no banco SQL: " + item);
    }

    @Override
    public Object buscarPorId(int id)
    {
        System.out.println("Executando SELECT no banco SQL para ID: " + id);
        return new ItemConfiguracao(id, "ItemSQL");
    }

    @Override
    public void atualizar(Object item)
    {
        System.out.println("Executando UPDATE no banco SQL: " + item);
    }

    @Override
    public void deletar(int id)
    {
        System.out.println("Executando DELETE no banco SQL para ID: " + id);
    }
}
