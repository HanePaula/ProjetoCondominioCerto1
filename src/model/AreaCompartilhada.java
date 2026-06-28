package model;

import java.util.List;

public class AreaCompartilhada {
    private int id;
    private String descricao;
    private String observacao;
    private String status;

    private List<AreaCompartilhadaEdificio> edificios;
    private List<Reserva> reservas;

    public AreaCompartilhada() {
        this.status = "ATIVO";
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getDescricao() { return descricao; }
    public void setDescricao(String descricao) { this.descricao = descricao; }

    public String getObservacao() { return observacao; }
    public void setObservacao(String observacao) { this.observacao = observacao; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }

    public List<AreaCompartilhadaEdificio> getEdificios() { return edificios; }
    public void setEdificios(List<AreaCompartilhadaEdificio> edificios) { this.edificios = edificios; }

    public List<Reserva> getReservas() { return reservas; }
    public void setReservas(List<Reserva> reservas) { this.reservas = reservas; }
}