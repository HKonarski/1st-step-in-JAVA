package Exer_08;

public class RepositorioNoSQL implements RepositorioGenerico
{

    @Override
    public void salvar(Object item)
    {
        System.out.println("Inserindo documento no banco NoSQL: " + item);
    }

    @Override
    public Object buscarPorId(int id)
    {
        System.out.println("Buscando documento no banco NoSQL para ID: " + id);
        return new ItemConfiguracao(id, "ItemNoSQL");
    }

    @Override
    public void atualizar(Object item)
    {
        System.out.println("Atualizando documento no banco NoSQL: " + item);
    }

    @Override
    public void deletar(int id)
    {
        System.out.println("Removendo documento no banco NoSQL para ID: " + id);
    }
}