package Exer_09;

import java.util.Date;

public class SistemaDeEstoque implements Auditoria
{
    private Date ultimaAlteracao;

    @Override
    public void registrarAcao(String acao)
    {
        this.ultimaAlteracao = new Date();
        System.out.println("Estoque - Ação registrada: " + acao);
    }

    @Override
    public Date dataUltimaAlteracao()
    {
        return ultimaAlteracao;
    }
}