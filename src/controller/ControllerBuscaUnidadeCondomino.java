package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import view.TelaBuscaUnidadeCondomino;

public class ControllerBuscaUnidadeCondomino implements ActionListener {

    TelaBuscaUnidadeCondomino telaBuscaUnidadeCondomino;

    public ControllerBuscaUnidadeCondomino(TelaBuscaUnidadeCondomino telaBuscaUnidadeCondomino) {
        this.telaBuscaUnidadeCondomino = telaBuscaUnidadeCondomino;

        this.telaBuscaUnidadeCondomino.getjBtCarregar().addActionListener(this);
        this.telaBuscaUnidadeCondomino.getjBtPesquisar().addActionListener(this);
        this.telaBuscaUnidadeCondomino.getjBtSair().addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent action) {
        if (action.getSource() == this.telaBuscaUnidadeCondomino.getjBtCarregar()) {

        } else if (action.getSource() == this.telaBuscaUnidadeCondomino.getjBtPesquisar()) {
            String filtro = this.telaBuscaUnidadeCondomino.getjComboFiltrar().getSelectedItem().toString();
            JOptionPane.showMessageDialog(null, "Pesquisando por: " + filtro);
        } else if (action.getSource() == this.telaBuscaUnidadeCondomino.getjBtSair()) {
            this.telaBuscaUnidadeCondomino.dispose();
        }
    }
}
