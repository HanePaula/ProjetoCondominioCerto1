package model;

public class CustoNivel2 {
    private int id;
    private String descricao;
    private String tipocc;
    private String observacao;
    private String status;

    private CustoNivel1 custoNivel1;

    public CustoNivel2() {
        this.status = "ATIVO";
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getDescricao() { return descricao; }
    public void setDescricao(String descricao) { this.descricao = descricao; }

    public String getTipocc() { return tipocc; }
    public void setTipocc(String tipocc) { this.tipocc = tipocc; }

    public String getObservacao() { return observacao; }
    public void setObservacao(String observacao) { this.observacao = observacao; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }

    public CustoNivel1 getCustoNivel1() { return custoNivel1; }
    public void setCustoNivel1(CustoNivel1 custoNivel1) { this.custoNivel1 = custoNivel1; }
}