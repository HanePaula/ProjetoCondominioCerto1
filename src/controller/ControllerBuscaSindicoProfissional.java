package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import view.TelaBuscaSindicoProfissional;

public class ControllerBuscaSindicoProfissional implements ActionListener {

    TelaBuscaSindicoProfissional telaBuscaSindicoProfissional;

    public ControllerBuscaSindicoProfissional(TelaBuscaSindicoProfissional telaBuscaSindicoProfissional) {
        this.telaBuscaSindicoProfissional = telaBuscaSindicoProfissional;

        this.telaBuscaSindicoProfissional.getjBtCarregar().addActionListener(this);
        this.telaBuscaSindicoProfissional.getjBtPesquisar().addActionListener(this);
        this.telaBuscaSindicoProfissional.getjBtSair().addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent action) {
        if (action.getSource() == this.telaBuscaSindicoProfissional.getjBtCarregar()) {

        } else if (action.getSource() == this.telaBuscaSindicoProfissional.getjBtPesquisar()) {
            String filtro = this.telaBuscaSindicoProfissional.getjComboFiltrar().getSelectedItem().toString();
            JOptionPane.showMessageDialog(null, "Pesquisando por: " + filtro);
        } else if (action.getSource() == this.telaBuscaSindicoProfissional.getjBtSair()) {
            this.telaBuscaSindicoProfissional.dispose();
        }
    }
}
