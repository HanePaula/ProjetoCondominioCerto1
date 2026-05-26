package condominios;

import java.util.Date;
import java.util.List;

public class Proprietario extends Pessoa {
    private Date dataaquisicao;
    private Date datavenda;
    private String observacao;
    private String status;

    private List<UnidadeCondomino> unidades;
    private List<FuncaoMandato> mandatos;

    public Proprietario() {
        this.status = "ATIVO";
    }

    public Date getDataaquisicao() { return dataaquisicao; }
    public void setDataaquisicao(Date dataaquisicao) { this.dataaquisicao = dataaquisicao; }

    public Date getDatavenda() { return datavenda; }
    public void setDatavenda(Date datavenda) { this.datavenda = datavenda; }

    public String getObservacao() { return observacao; }
    public void setObservacao(String observacao) { this.observacao = observacao; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }

    public List<UnidadeCondomino> getUnidades() { return unidades; }
    public void setUnidades(List<UnidadeCondomino> unidades) { this.unidades = unidades; }

    public List<FuncaoMandato> getMandatos() { return mandatos; }
    public void setMandatos(List<FuncaoMandato> mandatos) { this.mandatos = mandatos; }
}