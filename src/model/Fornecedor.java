package condominios;

import java.util.List;

public class Fornecedor extends Pessoa {
    private List<MovimentoCaixa> movimentos;

    public Fornecedor() {}

    public List<MovimentoCaixa> getMovimentos() { return movimentos; }
    public void setMovimentos(List<MovimentoCaixa> movimentos) { this.movimentos = movimentos; }
}
