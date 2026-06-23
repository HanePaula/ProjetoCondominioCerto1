package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.TelaCadastroCustoNivel2;

public class ControllerCadastroCustoNivel2 implements ActionListener {

    TelaCadastroCustoNivel2 telaCadastroCustoNivel2;

    public ControllerCadastroCustoNivel2(TelaCadastroCustoNivel2 telaCadastroCustoNivel2) {
        this.telaCadastroCustoNivel2 = telaCadastroCustoNivel2;

        this.telaCadastroCustoNivel2.getjButtonNovo().addActionListener(this);
        this.telaCadastroCustoNivel2.getjButtonCancelar().addActionListener(this);
        this.telaCadastroCustoNivel2.getjButtonGravar().addActionListener(this);
        this.telaCadastroCustoNivel2.getjButtonBuscar().addActionListener(this);
        this.telaCadastroCustoNivel2.getjButtonSair().addActionListener(this);

        utilities.Utilities.AtivaDesativa(this.telaCadastroCustoNivel2.getjPanelbotoes(), true);
    }

    @Override
    public void actionPerformed(ActionEvent action) {
        if (action.getSource() == this.telaCadastroCustoNivel2.getjButtonNovo()) {

            utilities.Utilities.AtivaDesativa(this.telaCadastroCustoNivel2.getjPanelbotoes(), false);
            utilities.Utilities.LimpaComponentes(this.telaCadastroCustoNivel2.getjPanelDados(), true, this.telaCadastroCustoNivel2.getButtonGroup1());

        } else if (action.getSource() == this.telaCadastroCustoNivel2.getjButtonCancelar()) {

            utilities.Utilities.AtivaDesativa(this.telaCadastroCustoNivel2.getjPanelbotoes(), true);
            utilities.Utilities.LimpaComponentes(this.telaCadastroCustoNivel2.getjPanelDados(), false, this.telaCadastroCustoNivel2.getButtonGroup1());

        } else if (action.getSource() == this.telaCadastroCustoNivel2.getjButtonGravar()) {

            utilities.Utilities.AtivaDesativa(this.telaCadastroCustoNivel2.getjPanelbotoes(), true);
            utilities.Utilities.LimpaComponentes(this.telaCadastroCustoNivel2.getjPanelDados(), false, this.telaCadastroCustoNivel2.getButtonGroup1());

        } else if (action.getSource() == this.telaCadastroCustoNivel2.getjButtonBuscar()) {

        } else if (action.getSource() == this.telaCadastroCustoNivel2.getjButtonSair()) {
            this.telaCadastroCustoNivel2.dispose();
        }
    }
}