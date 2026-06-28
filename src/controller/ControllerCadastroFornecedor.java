package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.TelaCadastroFornecedor;
import view.TelaBuscaFornecedor;

public class ControllerCadastroFornecedor implements ActionListener {

    TelaCadastroFornecedor telaCadastroFornecedor;

    public ControllerCadastroFornecedor(TelaCadastroFornecedor telaCadastroFornecedor) {
        this.telaCadastroFornecedor = telaCadastroFornecedor;

        this.telaCadastroFornecedor.getjButtonNovo().addActionListener(this);
        this.telaCadastroFornecedor.getjButtonCancelar().addActionListener(this);
        this.telaCadastroFornecedor.getjButtonGravar().addActionListener(this);
        this.telaCadastroFornecedor.getjButtonBuscar().addActionListener(this);
        this.telaCadastroFornecedor.getjButtonSair().addActionListener(this);

        utilities.Utilities.AtivaDesativa(this.telaCadastroFornecedor.getjPanelbotoes(), true);
    }

    @Override
    public void actionPerformed(ActionEvent action) {
        if (action.getSource() == this.telaCadastroFornecedor.getjButtonNovo()) {

            utilities.Utilities.AtivaDesativa(this.telaCadastroFornecedor.getjPanelbotoes(), false);
            utilities.Utilities.LimpaComponentes(this.telaCadastroFornecedor.getjPanelDados(), true, this.telaCadastroFornecedor.getButtonGroup1());

        } else if (action.getSource() == this.telaCadastroFornecedor.getjButtonCancelar()) {

            utilities.Utilities.AtivaDesativa(this.telaCadastroFornecedor.getjPanelbotoes(), true);
            utilities.Utilities.LimpaComponentes(this.telaCadastroFornecedor.getjPanelDados(), false, this.telaCadastroFornecedor.getButtonGroup1());

        } else if (action.getSource() == this.telaCadastroFornecedor.getjButtonGravar()) {

            utilities.Utilities.AtivaDesativa(this.telaCadastroFornecedor.getjPanelbotoes(), true);
            utilities.Utilities.LimpaComponentes(this.telaCadastroFornecedor.getjPanelDados(), false, this.telaCadastroFornecedor.getButtonGroup1());

        } else if (action.getSource() == this.telaCadastroFornecedor.getjButtonBuscar()) {
            TelaBuscaFornecedor telaBuscaFornecedor = new TelaBuscaFornecedor(null, true);
            new ControllerBuscaFornecedor(telaBuscaFornecedor);
            telaBuscaFornecedor.setVisible(true);

        } else if (action.getSource() == this.telaCadastroFornecedor.getjButtonSair()) {
            this.telaCadastroFornecedor.dispose();
        }
    }
}