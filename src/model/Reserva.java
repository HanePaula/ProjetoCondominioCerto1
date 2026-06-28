package model;

import java.util.Date;

public class Reserva {
    private int id;
    private Date datahorainicio;
    private Date datahorafim;
    private String observacao;
    private String status;

    private AreaCompartilhada areaCompartilhada;
    private UnidadeCondomino unidadeCondomino;

    public Reserva() {
        this.status = "ATIVO";
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public Date getDatahorainicio() { return datahorainicio; }
    public void setDatahorainicio(Date datahorainicio) { this.datahorainicio = datahorainicio; }

    public Date getDatahorafim() { return datahorafim; }
    public void setDatahorafim(Date datahorafim) { this.datahorafim = datahorafim; }

    public String getObservacao() { return observacao; }
    public void setObservacao(String observacao) { this.observacao = observacao; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }

    public AreaCompartilhada getAreaCompartilhada() { return areaCompartilhada; }
    public void setAreaCompartilhada(AreaCompartilhada areaCompartilhada) { this.areaCompartilhada = areaCompartilhada; }

    public UnidadeCondomino getUnidadeCondomino() { return unidadeCondomino; }
    public void setUnidadeCondomino(UnidadeCondomino unidadeCondomino) { this.unidadeCondomino = unidadeCondomino; }
}