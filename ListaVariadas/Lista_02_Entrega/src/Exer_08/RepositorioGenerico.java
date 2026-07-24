package Exer_08;

public interface RepositorioGenerico
{
    void salvar(Object item);
    Object buscarPorId(int id);
    void atualizar(Object item);
    void deletar(int id);
}
