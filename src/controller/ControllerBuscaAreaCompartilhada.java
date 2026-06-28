package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import view.TelaBuscaAreaCompartilhada;

public class ControllerBuscaAreaCompartilhada implements ActionListener {

    TelaBuscaAreaCompartilhada telaBuscaAreaCompartilhada;

    public ControllerBuscaAreaCompartilhada(TelaBuscaAreaCompartilhada telaBuscaAreaCompartilhada) {
        this.telaBuscaAreaCompartilhada = telaBuscaAreaCompartilhada;

        this.telaBuscaAreaCompartilhada.getjBtCarregar().addActionListener(this);
        this.telaBuscaAreaCompartilhada.getjBtPesquisar().addActionListener(this);
        this.telaBuscaAreaCompartilhada.getjBtSair().addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent action) {
        if (action.getSource() == this.telaBuscaAreaCompartilhada.getjBtCarregar()) {

        } else if (action.getSource() == this.telaBuscaAreaCompartilhada.getjBtPesquisar()) {
            String filtro = this.telaBuscaAreaCompartilhada.getjComboFiltrar().getSelectedItem().toString();
            JOptionPane.showMessageDialog(null, "Pesquisando por: " + filtro);
        } else if (action.getSource() == this.telaBuscaAreaCompartilhada.getjBtSair()) {
            this.telaBuscaAreaCompartilhada.dispose();
        }
    }
}
