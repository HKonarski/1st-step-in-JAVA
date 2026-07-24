package Exer_09;

import java.util.Date;

public class AreaDeSeguranca implements Auditoria
{
    private Date ultimaAlteracao;

    @Override
    public void registrarAcao(String acao)
    {
        this.ultimaAlteracao = new Date();
        System.out.println("Segurança - Ação registrada: " + acao);
    }

    @Override
    public Date dataUltimaAlteracao()
    {
        return ultimaAlteracao;
    }

    @Override
    public void exibirHistorico()
    {
        System.out.println("Histórico de segurança: ações críticas registradas com controle de acesso reforçado.");
    }
}
