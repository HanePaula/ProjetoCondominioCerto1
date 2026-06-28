package model;

import java.util.Date;

public class FuncaoMandato {
    private int id;
    private Date datainicio;
    private Date datafim;
    private String funcao;
    private String observacao;
    private String status;

    private Pessoa pessoa;

    public FuncaoMandato() {
        this.status = "ATIVO";
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public Date getDatainicio() { return datainicio; }
    public void setDatainicio(Date datainicio) { this.datainicio = datainicio; }

    public Date getDatafim() { return datafim; }
    public void setDatafim(Date datafim) { this.datafim = datafim; }

    public String getFuncao() { return funcao; }
    public void setFuncao(String funcao) { this.funcao = funcao; }

    public String getObservacao() { return observacao; }
    public void setObservacao(String observacao) { this.observacao = observacao; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }

    public Pessoa getPessoa() { return pessoa; }
    public void setPessoa(Pessoa pessoa) { this.pessoa = pessoa; }
}