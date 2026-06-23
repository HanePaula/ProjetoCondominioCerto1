package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.TelaCadastroUnidade;

public class ControllerCadastroUnidade implements ActionListener {

    TelaCadastroUnidade telaCadastroUnidade;

    public ControllerCadastroUnidade(TelaCadastroUnidade telaCadastroUnidade) {
        this.telaCadastroUnidade = telaCadastroUnidade;

        this.telaCadastroUnidade.getjButtonNovo().addActionListener(this);
        this.telaCadastroUnidade.getjButtonCancelar().addActionListener(this);
        this.telaCadastroUnidade.getjButtonGravar().addActionListener(this);
        this.telaCadastroUnidade.getjButtonBuscar().addActionListener(this);
        this.telaCadastroUnidade.getjButtonSair().addActionListener(this);

        utilities.Utilities.AtivaDesativa(this.telaCadastroUnidade.getjPanelbotoes(), true);
    }

    @Override
    public void actionPerformed(ActionEvent action) {
        if (action.getSource() == this.telaCadastroUnidade.getjButtonNovo()) {

            utilities.Utilities.AtivaDesativa(this.telaCadastroUnidade.getjPanelbotoes(), false);
            utilities.Utilities.LimpaComponentes(this.telaCadastroUnidade.getjPanelDados(), true, this.telaCadastroUnidade.getButtonGroup1());

        } else if (action.getSource() == this.telaCadastroUnidade.getjButtonCancelar()) {

            utilities.Utilities.AtivaDesativa(this.telaCadastroUnidade.getjPanelbotoes(), true);
            utilities.Utilities.LimpaComponentes(this.telaCadastroUnidade.getjPanelDados(), false, this.telaCadastroUnidade.getButtonGroup1());

        } else if (action.getSource() == this.telaCadastroUnidade.getjButtonGravar()) {

            utilities.Utilities.AtivaDesativa(this.telaCadastroUnidade.getjPanelbotoes(), true);
            utilities.Utilities.LimpaComponentes(this.telaCadastroUnidade.getjPanelDados(), false, this.telaCadastroUnidade.getButtonGroup1());

        } else if (action.getSource() == this.telaCadastroUnidade.getjButtonBuscar()) {

        } else if (action.getSource() == this.telaCadastroUnidade.getjButtonSair()) {
            this.telaCadastroUnidade.dispose();
        }
    }
}