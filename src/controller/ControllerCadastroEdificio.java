package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.TelaBuscaEdificio;
import view.TelaCadastroEdificio;

public class ControllerCadastroEdificio implements ActionListener {

    TelaCadastroEdificio telaCadastroEdificio;

    public ControllerCadastroEdificio(TelaCadastroEdificio telaCadastroEdificio) {
        this.telaCadastroEdificio = telaCadastroEdificio;

        this.telaCadastroEdificio.getjButtonNovo().addActionListener(this);
        this.telaCadastroEdificio.getjButtonCancelar().addActionListener(this);
        this.telaCadastroEdificio.getjButtonGravar().addActionListener(this);
        this.telaCadastroEdificio.getjButtonBuscar().addActionListener(this);
        this.telaCadastroEdificio.getjButtonSair().addActionListener(this);

        utilities.Utilities.AtivaDesativa(this.telaCadastroEdificio.getjPanelbotoes(), true);

    }

    @Override
    public void actionPerformed(ActionEvent action) {
        if (action.getSource() == this.telaCadastroEdificio.getjButtonNovo()) {
            /*
            this.telaCadastroEdificio.getjButtonNovo().setEnabled(false);
            this.telaCadastroEdificio.getjButtonCancelar().setEnabled(true);
            this.telaCadastroEdificio.getjButtonGravar().setEnabled(true);
            this.telaCadastroEdificio.getjButtonBuscar().setEnabled(false);
            this.telaCadastroEdificio.getjButtonSair().setEnabled(false);*/

            utilities.Utilities.AtivaDesativa(this.telaCadastroEdificio.getjPanelbotoes(), false);
            utilities.Utilities.LimpaComponentes(this.telaCadastroEdificio.getjPanelDados(), true, this.telaCadastroEdificio.getButtonGroup1());

        } else if (action.getSource() == this.telaCadastroEdificio.getjButtonCancelar()) {

            utilities.Utilities.AtivaDesativa(this.telaCadastroEdificio.getjPanelbotoes(), true);
            utilities.Utilities.LimpaComponentes(this.telaCadastroEdificio.getjPanelDados(), false, this.telaCadastroEdificio.getButtonGroup1());
        } else if (action.getSource() == this.telaCadastroEdificio.getjButtonGravar()) {

            
            
            
            
            
            
            utilities.Utilities.AtivaDesativa(this.telaCadastroEdificio.getjPanelbotoes(), true);
            utilities.Utilities.LimpaComponentes(this.telaCadastroEdificio.getjPanelDados(), false, this.telaCadastroEdificio.getButtonGroup1());
            
            
            
        } else if (action.getSource() == this.telaCadastroEdificio.getjButtonBuscar()) {
            TelaBuscaEdificio telaBuscaEdificio = new TelaBuscaEdificio(null, true);
            new ControllerBuscaEdificio(telaBuscaEdificio);
            telaBuscaEdificio.setVisible(true);
        } else if (action.getSource() == this.telaCadastroEdificio.getjButtonSair()) {
            this.telaCadastroEdificio.dispose();
        }
    }
}
