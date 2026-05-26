package condominios;

import java.util.List;

public class Edificio {
    private int id;
    private String nome;
    private int quantidadeandares;
    private int quantidadeunidades;
    private String cnpj;
    private int anolancamento;
    private float areatotal;
    private String cep;
    private String logradouro;
    private String cidade;
    private String bairro;
    private String complemento;
    private String numerounidadeagua;
    private String numerounidadegas;
    private String formulacalculo;
    private String observacao;
    private String status;

    private List<Unidade> unidades;
    private List<AreaCompartilhadaEdificio> areasCompartilhadas;

    public Edificio() {
        this.status = "ATIVO";
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public int getQuantidadeandares() { return quantidadeandares; }
    public void setQuantidadeandares(int quantidadeandares) { this.quantidadeandares = quantidadeandares; }

    public int getQuantidadeunidades() { return quantidadeunidades; }
    public void setQuantidadeunidades(int quantidadeunidades) { this.quantidadeunidades = quantidadeunidades; }

    public String getCnpj() { return cnpj; }
    public void setCnpj(String cnpj) { this.cnpj = cnpj; }

    public int getAnolancamento() { return anolancamento; }
    public void setAnolancamento(int anolancamento) { this.anolancamento = anolancamento; }

    public float getAreatotal() { return areatotal; }
    public void setAreatotal(float areatotal) { this.areatotal = areatotal; }

    public String getCep() { return cep; }
    public void setCep(String cep) { this.cep = cep; }

    public String getLogradouro() { return logradouro; }
    public void setLogradouro(String logradouro) { this.logradouro = logradouro; }

    public String getCidade() { return cidade; }
    public void setCidade(String cidade) { this.cidade = cidade; }

    public String getBairro() { return bairro; }
    public void setBairro(String bairro) { this.bairro = bairro; }

    public String getComplemento() { return complemento; }
    public void setComplemento(String complemento) { this.complemento = complemento; }

    public String getNumerounidadeagua() { return numerounidadeagua; }
    public void setNumerounidadeagua(String numerounidadeagua) { this.numerounidadeagua = numerounidadeagua; }

    public String getNumerounidadegas() { return numerounidadegas; }
    public void setNumerounidadegas(String numerounidadegas) { this.numerounidadegas = numerounidadegas; }

    public String getFormulacalculo() { return formulacalculo; }
    public void setFormulacalculo(String formulacalculo) { this.formulacalculo = formulacalculo; }

    public String getObservacao() { return observacao; }
    public void setObservacao(String observacao) { this.observacao = observacao; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }

    public List<Unidade> getUnidades() { return unidades; }
    public void setUnidades(List<Unidade> unidades) { this.unidades = unidades; }

    public List<AreaCompartilhadaEdificio> getAreasCompartilhadas() { return areasCompartilhadas; }
    public void setAreasCompartilhadas(List<AreaCompartilhadaEdificio> areasCompartilhadas) { this.areasCompartilhadas = areasCompartilhadas; }
}