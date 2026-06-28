package model;

public class AreaCompartilhadaEdificio {
    private int id;
    private String observacao;
    private String status;

    private Edificio edificio;
    private AreaCompartilhada areaCompartilhada;

    public AreaCompartilhadaEdificio() {
        this.status = "ATIVO";
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getObservacao() { return observacao; }
    public void setObservacao(String observacao) { this.observacao = observacao; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }

    public Edificio getEdificio() { return edificio; }
    public void setEdificio(Edificio edificio) { this.edificio = edificio; }

    public AreaCompartilhada getAreaCompartilhada() { return areaCompartilhada; }
    public void setAreaCompartilhada(AreaCompartilhada areaCompartilhada) { this.areaCompartilhada = areaCompartilhada; }
}