package condominios;

import java.util.List;

public class SindicoProfissional extends Pessoa {
    private String cra;

    private List<FuncaoMandato> mandatos;

    public SindicoProfissional() {}

    public String getCra() { return cra; }
    public void setCra(String cra) { this.cra = cra; }

    public List<FuncaoMandato> getMandatos() { return mandatos; }
    public void setMandatos(List<FuncaoMandato> mandatos) { this.mandatos = mandatos; }
}