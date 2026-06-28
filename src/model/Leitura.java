package model;

import java.util.Date;

public class Leitura {
    private int id;
    private Date dataleitura;
    private int mesreferencia;
    private int anoreferencia;
    private float medicaoanterior;
    private float medicaoatual;
    private String tipo;
    private String observacao;
    private String status;

    private Unidade unidade;

    public Leitura() {
        this.status = "ATIVO";
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public Date getDataleitura() { return dataleitura; }
    public void setDataleitura(Date dataleitura) { this.dataleitura = dataleitura; }

    public int getMesreferencia() { return mesreferencia; }
    public void setMesreferencia(int mesreferencia) { this.mesreferencia = mesreferencia; }

    public int getAnoreferencia() { return anoreferencia; }
    public void setAnoreferencia(int anoreferencia) { this.anoreferencia = anoreferencia; }

    public float getMedicaoanterior() { return medicaoanterior; }
    public void setMedicaoanterior(float medicaoanterior) { this.medicaoanterior = medicaoanterior; }

    public float getMedicaoatual() { return medicaoatual; }
    public void setMedicaoatual(float medicaoatual) { this.medicaoatual = medicaoatual; }

    public String getTipo() { return tipo; }
    public void setTipo(String tipo) { this.tipo = tipo; }

    public String getObservacao() { return observacao; }
    public void setObservacao(String observacao) { this.observacao = observacao; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }

    public Unidade getUnidade() { return unidade; }
    public void setUnidade(Unidade unidade) { this.unidade = unidade; }
}