package condominios;

import java.util.Date;

public class MovimentoCaixa {
    private int id;
    private Date dataemissao;
    private Date datavencimento;
    private Date datapagamento;
    private float valoremitido;
    private float juros;
    private float multas;
    private float correcaomonetaria;
    private float valorpagrec;
    private String tipo;
    private boolean flagrateio;
    private String flagformla;
    private String observacao;
    private String status;

    private Condominio condominio;
    private CustoNivel1 custoNivel1;
    private Fornecedor fornecedor;

    public MovimentoCaixa() {
        this.status = "ATIVO";
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public Date getDataemissao() { return dataemissao; }
    public void setDataemissao(Date dataemissao) { this.dataemissao = dataemissao; }

    public Date getDatavencimento() { return datavencimento; }
    public void setDatavencimento(Date datavencimento) { this.datavencimento = datavencimento; }

    public Date getDatapagamento() { return datapagamento; }
    public void setDatapagamento(Date datapagamento) { this.datapagamento = datapagamento; }

    public float getValoremitido() { return valoremitido; }
    public void setValoremitido(float valoremitido) { this.valoremitido = valoremitido; }

    public float getJuros() { return juros; }
    public void setJuros(float juros) { this.juros = juros; }

    public float getMultas() { return multas; }
    public void setMultas(float multas) { this.multas = multas; }

    public float getCorrecaomonetaria() { return correcaomonetaria; }
    public void setCorrecaomonetaria(float correcaomonetaria) { this.correcaomonetaria = correcaomonetaria; }

    public float getValorpagrec() { return valorpagrec; }
    public void setValorpagrec(float valorpagrec) { this.valorpagrec = valorpagrec; }

    public String getTipo() { return tipo; }
    public void setTipo(String tipo) { this.tipo = tipo; }

    public boolean isFlagrateio() { return flagrateio; }
    public void setFlagrateio(boolean flagrateio) { this.flagrateio = flagrateio; }

    public String getFlagformla() { return flagformla; }
    public void setFlagformla(String flagformla) { this.flagformla = flagformla; }

    public String getObservacao() { return observacao; }
    public void setObservacao(String observacao) { this.observacao = observacao; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }

    public Condominio getCondominio() { return condominio; }
    public void setCondominio(Condominio condominio) { this.condominio = condominio; }

    public CustoNivel1 getCustoNivel1() { return custoNivel1; }
    public void setCustoNivel1(CustoNivel1 custoNivel1) { this.custoNivel1 = custoNivel1; }

    public Fornecedor getFornecedor() { return fornecedor; }
    public void setFornecedor(Fornecedor fornecedor) { this.fornecedor = fornecedor; }
}