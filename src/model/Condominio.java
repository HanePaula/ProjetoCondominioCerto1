package model;

import java.util.Date;
import java.util.List;

public class Condominio {
    private int id;
    private int mesreferencia;
    private int anoreferencia;
    private Date dataemissao;
    private Date datavencimento;
    private float juros;
    private float multas;
    private float correcao;
    private float valoremitido;
    private float valorpago;
    private String observacao;
    private String status;

    private UnidadeCondomino unidadeCondomino;
    private List<MovimentoCaixa> movimentos;

    public Condominio() {
        this.status = "ATIVO";
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public int getMesreferencia() { return mesreferencia; }
    public void setMesreferencia(int mesreferencia) { this.mesreferencia = mesreferencia; }

    public int getAnoreferencia() { return anoreferencia; }
    public void setAnoreferencia(int anoreferencia) { this.anoreferencia = anoreferencia; }

    public Date getDataemissao() { return dataemissao; }
    public void setDataemissao(Date dataemissao) { this.dataemissao = dataemissao; }

    public Date getDatavencimento() { return datavencimento; }
    public void setDatavencimento(Date datavencimento) { this.datavencimento = datavencimento; }

    public float getJuros() { return juros; }
    public void setJuros(float juros) { this.juros = juros; }

    public float getMultas() { return multas; }
    public void setMultas(float multas) { this.multas = multas; }

    public float getCorrecao() { return correcao; }
    public void setCorrecao(float correcao) { this.correcao = correcao; }

    public float getValoremitido() { return valoremitido; }
    public void setValoremitido(float valoremitido) { this.valoremitido = valoremitido; }

    public float getValorpago() { return valorpago; }
    public void setValorpago(float valorpago) { this.valorpago = valorpago; }

    public String getObservacao() { return observacao; }
    public void setObservacao(String observacao) { this.observacao = observacao; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }

    public UnidadeCondomino getUnidadeCondomino() { return unidadeCondomino; }
    public void setUnidadeCondomino(UnidadeCondomino unidadeCondomino) { this.unidadeCondomino = unidadeCondomino; }

    public List<MovimentoCaixa> getMovimentos() { return movimentos; }
    public void setMovimentos(List<MovimentoCaixa> movimentos) { this.movimentos = movimentos; }
}