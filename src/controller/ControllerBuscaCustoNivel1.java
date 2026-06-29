package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import view.TelaBuscaCustoNivel1;

public class ControllerBuscaCustoNivel1 implements ActionListener {

    TelaBuscaCustoNivel1 telaBuscaCustoNivel1;

    public ControllerBuscaCustoNivel1(TelaBuscaCustoNivel1 telaBuscaCustoNivel1) {
        this.telaBuscaCustoNivel1 = telaBuscaCustoNivel1;

        this.telaBuscaCustoNivel1.getjBtCarregar().addActionListener(this);
        this.telaBuscaCustoNivel1.getjBtPesquisar().addActionListener(this);
        this.telaBuscaCustoNivel1.getjBtSair().addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent action) {
        if (action.getSource() == this.telaBuscaCustoNivel1.getjBtCarregar()) {

        } else if (action.getSource() == this.telaBuscaCustoNivel1.getjBtPesquisar()) {
            String filtro = this.telaBuscaCustoNivel1.getjComboFiltrar().getSelectedItem().toString();
            JOptionPane.showMessageDialog(null, "Pesquisando por: " + filtro);
        } else if (action.getSource() == this.telaBuscaCustoNivel1.getjBtSair()) {
            this.telaBuscaCustoNivel1.dispose();
        }
    }
}
