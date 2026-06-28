package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.TelaCadastroSindicoProfissional;
import view.TelaBuscaSindicoProfissional;

public class ControllerCadastroSindicoProfissional implements ActionListener {

    TelaCadastroSindicoProfissional telaCadastroSindicoProfissional;

    public ControllerCadastroSindicoProfissional(TelaCadastroSindicoProfissional telaCadastroSindicoProfissional) {
        this.telaCadastroSindicoProfissional = telaCadastroSindicoProfissional;

        this.telaCadastroSindicoProfissional.getjButtonNovo().addActionListener(this);
        this.telaCadastroSindicoProfissional.getjButtonCancelar().addActionListener(this);
        this.telaCadastroSindicoProfissional.getjButtonGravar().addActionListener(this);
        this.telaCadastroSindicoProfissional.getjButtonBuscar().addActionListener(this);
        this.telaCadastroSindicoProfissional.getjButtonSair().addActionListener(this);

        utilities.Utilities.AtivaDesativa(this.telaCadastroSindicoProfissional.getjPanelbotoes(), true);
    }

    @Override
    public void actionPerformed(ActionEvent action) {
        if (action.getSource() == this.telaCadastroSindicoProfissional.getjButtonNovo()) {

            utilities.Utilities.AtivaDesativa(this.telaCadastroSindicoProfissional.getjPanelbotoes(), false);
            utilities.Utilities.LimpaComponentes(this.telaCadastroSindicoProfissional.getjPanelDados(), true, this.telaCadastroSindicoProfissional.getButtonGroup1());

        } else if (action.getSource() == this.telaCadastroSindicoProfissional.getjButtonCancelar()) {

            utilities.Utilities.AtivaDesativa(this.telaCadastroSindicoProfissional.getjPanelbotoes(), true);
            utilities.Utilities.LimpaComponentes(this.telaCadastroSindicoProfissional.getjPanelDados(), false, this.telaCadastroSindicoProfissional.getButtonGroup1());

        } else if (action.getSource() == this.telaCadastroSindicoProfissional.getjButtonGravar()) {

            utilities.Utilities.AtivaDesativa(this.telaCadastroSindicoProfissional.getjPanelbotoes(), true);
            utilities.Utilities.LimpaComponentes(this.telaCadastroSindicoProfissional.getjPanelDados(), false, this.telaCadastroSindicoProfissional.getButtonGroup1());

        } else if (action.getSource() == this.telaCadastroSindicoProfissional.getjButtonBuscar()) {
            TelaBuscaSindicoProfissional telaBuscaSindicoProfissional = new TelaBuscaSindicoProfissional(null, true);
            new ControllerBuscaSindicoProfissional(telaBuscaSindicoProfissional);
            telaBuscaSindicoProfissional.setVisible(true);

        } else if (action.getSource() == this.telaCadastroSindicoProfissional.getjButtonSair()) {
            this.telaCadastroSindicoProfissional.dispose();
        }
    }
}