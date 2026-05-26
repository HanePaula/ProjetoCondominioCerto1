package condominios;

import java.util.List;

public class CustoNivel1 {
    private int id;
    private String descricao;
    private String tipocc;
    private String observacao;
    private String status;

    private List<CustoNivel2> custoNivel2List;
    private List<MovimentoCaixa> movimentos;

    public CustoNivel1() {
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

    public List<CustoNivel2> getCustoNivel2List() { return custoNivel2List; }
    public void setCustoNivel2List(List<CustoNivel2> custoNivel2List) { this.custoNivel2List = custoNivel2List; }

    public List<MovimentoCaixa> getMovimentos() { return movimentos; }
    public void setMovimentos(List<MovimentoCaixa> movimentos) { this.movimentos = movimentos; }
}