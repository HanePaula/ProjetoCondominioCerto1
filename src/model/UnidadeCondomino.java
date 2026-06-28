package model;

import java.util.Date;
import java.util.List;

public class UnidadeCondomino {
    private int id;
    private Date dataaquisicao;
    private Date datavenda;
    private String observacao;
    private String status;

    private Unidade unidade;
    private Proprietario proprietario;
    private List<Condominio> condominios;

    public UnidadeCondomino() {
        this.status = "ATIVO";
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public Date getDataaquisicao() { return dataaquisicao; }
    public void setDataaquisicao(Date dataaquisicao) { this.dataaquisicao = dataaquisicao; }

    public Date getDatavenda() { return datavenda; }
    public void setDatavenda(Date datavenda) { this.datavenda = datavenda; }

    public String getObservacao() { return observacao; }
    public void setObservacao(String observacao) { this.observacao = observacao; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }

    public Unidade getUnidade() { return unidade; }
    public void setUnidade(Unidade unidade) { this.unidade = unidade; }

    public Proprietario getProprietario() { return proprietario; }
    public void setProprietario(Proprietario proprietario) { this.proprietario = proprietario; }

    public List<Condominio> getCondominios() { return condominios; }
    public void setCondominios(List<Condominio> condominios) { this.condominios = condominios; }
}