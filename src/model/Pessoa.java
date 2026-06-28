package model;

import java.util.Date;

public class Pessoa {
    private int id;
    private String nomefantasia;
    private String razaosocial;
    private String cpf;
    private String rg;
    private String cnpj;
    private String inscricaoestadual;
    private String fone1;
    private String fone2;
    private String email;
    private Date datanascimento;
    private Date datacadastro;
    private String estadocivil;
    private String cep;
    private String logradouro;
    private String cidade;
    private String bairro;
    private String complemento;
    private String observacao;
    private String tipopessoa;
    private String status;

    public Pessoa() {
        this.status = "ATIVO";
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getNomefantasia() { return nomefantasia; }
    public void setNomefantasia(String nomefantasia) { this.nomefantasia = nomefantasia; }

    public String getRazaosocial() { return razaosocial; }
    public void setRazaosocial(String razaosocial) { this.razaosocial = razaosocial; }

    public String getCpf() { return cpf; }
    public void setCpf(String cpf) { this.cpf = cpf; }

    public String getRg() { return rg; }
    public void setRg(String rg) { this.rg = rg; }

    public String getCnpj() { return cnpj; }
    public void setCnpj(String cnpj) { this.cnpj = cnpj; }

    public String getInscricaoestadual() { return inscricaoestadual; }
    public void setInscricaoestadual(String inscricaoestadual) { this.inscricaoestadual = inscricaoestadual; }

    public String getFone1() { return fone1; }
    public void setFone1(String fone1) { this.fone1 = fone1; }

    public String getFone2() { return fone2; }
    public void setFone2(String fone2) { this.fone2 = fone2; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public Date getDatanascimento() { return datanascimento; }
    public void setDatanascimento(Date datanascimento) { this.datanascimento = datanascimento; }

    public Date getDatacadastro() { return datacadastro; }
    public void setDatacadastro(Date datacadastro) { this.datacadastro = datacadastro; }

    public String getEstadocivil() { return estadocivil; }
    public void setEstadocivil(String estadocivil) { this.estadocivil = estadocivil; }

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

    public String getObservacao() { return observacao; }
    public void setObservacao(String observacao) { this.observacao = observacao; }

    public String getTipopessoa() { return tipopessoa; }
    public void setTipopessoa(String tipopessoa) { this.tipopessoa = tipopessoa; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
}