package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.TelaCadastroUnidadeCondomino;

public class ControllerCadastroUnidadeCondomino implements ActionListener {

    TelaCadastroUnidadeCondomino telaCadastroUnidadeCondomino;

    public ControllerCadastroUnidadeCondomino(TelaCadastroUnidadeCondomino telaCadastroUnidadeCondomino) {
        this.telaCadastroUnidadeCondomino = telaCadastroUnidadeCondomino;

        this.telaCadastroUnidadeCondomino.getjButtonNovo().addActionListener(this);
        this.telaCadastroUnidadeCondomino.getjButtonCancelar().addActionListener(this);
        this.telaCadastroUnidadeCondomino.getjButtonGravar().addActionListener(this);
        this.telaCadastroUnidadeCondomino.getjButtonBuscar().addActionListener(this);
        this.telaCadastroUnidadeCondomino.getjButtonSair().addActionListener(this);

        utilities.Utilities.AtivaDesativa(this.telaCadastroUnidadeCondomino.getjPanelbotoes(), true);
    }

    @Override
    public void actionPerformed(ActionEvent action) {
        if (action.getSource() == this.telaCadastroUnidadeCondomino.getjButtonNovo()) {

            utilities.Utilities.AtivaDesativa(this.telaCadastroUnidadeCondomino.getjPanelbotoes(), false);
            utilities.Utilities.LimpaComponentes(this.telaCadastroUnidadeCondomino.getjPanelDados(), true, this.telaCadastroUnidadeCondomino.getButtonGroup1());

        } else if (action.getSource() == this.telaCadastroUnidadeCondomino.getjButtonCancelar()) {

            utilities.Utilities.AtivaDesativa(this.telaCadastroUnidadeCondomino.getjPanelbotoes(), true);
            utilities.Utilities.LimpaComponentes(this.telaCadastroUnidadeCondomino.getjPanelDados(), false, this.telaCadastroUnidadeCondomino.getButtonGroup1());

        } else if (action.getSource() == this.telaCadastroUnidadeCondomino.getjButtonGravar()) {

            utilities.Utilities.AtivaDesativa(this.telaCadastroUnidadeCondomino.getjPanelbotoes(), true);
            utilities.Utilities.LimpaComponentes(this.telaCadastroUnidadeCondomino.getjPanelDados(), false, this.telaCadastroUnidadeCondomino.getButtonGroup1());

        } else if (action.getSource() == this.telaCadastroUnidadeCondomino.getjButtonBuscar()) {

        } else if (action.getSource() == this.telaCadastroUnidadeCondomino.getjButtonSair()) {
            this.telaCadastroUnidadeCondomino.dispose();
        }
    }
}