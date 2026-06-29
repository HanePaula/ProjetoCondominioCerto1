package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.TelaCadastroCustoNivel1;
import view.TelaBuscaCustoNivel1;


public class ControllerCadastroCustoNivel1 implements ActionListener {

    TelaCadastroCustoNivel1 telaCadastroCustoNivel1;

    public ControllerCadastroCustoNivel1(TelaCadastroCustoNivel1 telaCadastroCustoNivel1) {
        this.telaCadastroCustoNivel1 = telaCadastroCustoNivel1;

        this.telaCadastroCustoNivel1.getjButtonNovo().addActionListener(this);
        this.telaCadastroCustoNivel1.getjButtonCancelar().addActionListener(this);
        this.telaCadastroCustoNivel1.getjButtonGravar().addActionListener(this);
        this.telaCadastroCustoNivel1.getjButtonBuscar().addActionListener(this);
        this.telaCadastroCustoNivel1.getjButtonSair().addActionListener(this);

        utilities.Utilities.AtivaDesativa(this.telaCadastroCustoNivel1.getjPanelbotoes(), true);
    }

    @Override
    public void actionPerformed(ActionEvent action) {
        if (action.getSource() == this.telaCadastroCustoNivel1.getjButtonNovo()) {

            utilities.Utilities.AtivaDesativa(this.telaCadastroCustoNivel1.getjPanelbotoes(), false);
            utilities.Utilities.LimpaComponentes(this.telaCadastroCustoNivel1.getjPanelDados(), true, this.telaCadastroCustoNivel1.getButtonGroup1());

        } else if (action.getSource() == this.telaCadastroCustoNivel1.getjButtonCancelar()) {

            utilities.Utilities.AtivaDesativa(this.telaCadastroCustoNivel1.getjPanelbotoes(), true);
            utilities.Utilities.LimpaComponentes(this.telaCadastroCustoNivel1.getjPanelDados(), false, this.telaCadastroCustoNivel1.getButtonGroup1());

        } else if (action.getSource() == this.telaCadastroCustoNivel1.getjButtonGravar()) {

            // Lógica de salvar o CustoNivel1 (model) ainda não foi implementada,
            // igual no exemplo do professor.

            utilities.Utilities.AtivaDesativa(this.telaCadastroCustoNivel1.getjPanelbotoes(), true);
            utilities.Utilities.LimpaComponentes(this.telaCadastroCustoNivel1.getjPanelDados(), false, this.telaCadastroCustoNivel1.getButtonGroup1());

        } else if (action.getSource() == this.telaCadastroCustoNivel1.getjButtonBuscar()) {
            TelaBuscaCustoNivel1 telaBuscaCustoNivel1 = new TelaBuscaCustoNivel1(null, true);
            new ControllerBuscaCustoNivel1(telaBuscaCustoNivel1);
            telaBuscaCustoNivel1.setVisible(true);

        } else if (action.getSource() == this.telaCadastroCustoNivel1.getjButtonSair()) {
            this.telaCadastroCustoNivel1.dispose();
        }
    }
}