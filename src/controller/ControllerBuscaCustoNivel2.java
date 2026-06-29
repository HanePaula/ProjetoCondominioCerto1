package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import view.TelaBuscaCustoNivel2;

public class ControllerBuscaCustoNivel2 implements ActionListener {

    TelaBuscaCustoNivel2 telaBuscaCustoNivel2;

    public ControllerBuscaCustoNivel2(TelaBuscaCustoNivel2 telaBuscaCustoNivel2) {
        this.telaBuscaCustoNivel2 = telaBuscaCustoNivel2;

        this.telaBuscaCustoNivel2.getjBtCarregar().addActionListener(this);
        this.telaBuscaCustoNivel2.getjBtPesquisar().addActionListener(this);
        this.telaBuscaCustoNivel2.getjBtSair().addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent action) {
        if (action.getSource() == this.telaBuscaCustoNivel2.getjBtCarregar()) {

        } else if (action.getSource() == this.telaBuscaCustoNivel2.getjBtPesquisar()) {
            String filtro = this.telaBuscaCustoNivel2.getjComboFiltrar().getSelectedItem().toString();
            JOptionPane.showMessageDialog(null, "Pesquisando por: " + filtro);
        } else if (action.getSource() == this.telaBuscaCustoNivel2.getjBtSair()) {
            this.telaBuscaCustoNivel2.dispose();
        }
    }
}
