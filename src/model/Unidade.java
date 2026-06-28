package model;

import java.util.List;

public class Unidade {
    private int id;
    private String descricao;
    private float metragemtotal;
    private float metragemindividual;
    private int tipounidade;
    private String observacao;
    private String status;

    private Edificio edificio;
    private List<UnidadeCondomino> condominios;
    private List<Leitura> leituras;

    public Unidade() {
        this.status = "ATIVO";
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getDescricao() { return descricao; }
    public void setDescricao(String descricao) { this.descricao = descricao; }

    public float getMetragemtotal() { return metragemtotal; }
    public void setMetragemtotal(float metragemtotal) { this.metragemtotal = metragemtotal; }

    public float getMetragemindividual() { return metragemindividual; }
    public void setMetragemindividual(float metragemindividual) { this.metragemindividual = metragemindividual; }

    public int getTipounidade() { return tipounidade; }
    public void setTipounidade(int tipounidade) { this.tipounidade = tipounidade; }

    public String getObservacao() { return observacao; }
    public void setObservacao(String observacao) { this.observacao = observacao; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }

    public Edificio getEdificio() { return edificio; }
    public void setEdificio(Edificio edificio) { this.edificio = edificio; }

    public List<UnidadeCondomino> getCondominios() { return condominios; }
    public void setCondominios(List<UnidadeCondomino> condominios) { this.condominios = condominios; }

    public List<Leitura> getLeituras() { return leituras; }
    public void setLeituras(List<Leitura> leituras) { this.leituras = leituras; }
}