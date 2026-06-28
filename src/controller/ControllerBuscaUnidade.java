package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import view.TelaBuscaUnidade;

public class ControllerBuscaUnidade implements ActionListener {

    TelaBuscaUnidade telaBuscaUnidade;

    public ControllerBuscaUnidade(TelaBuscaUnidade telaBuscaUnidade) {
        this.telaBuscaUnidade = telaBuscaUnidade;

        this.telaBuscaUnidade.getjBtCarregar().addActionListener(this);
        this.telaBuscaUnidade.getjBtPesquisar().addActionListener(this);
        this.telaBuscaUnidade.getjBtSair().addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent action) {
        if (action.getSource() == this.telaBuscaUnidade.getjBtCarregar()) {

        } else if (action.getSource() == this.telaBuscaUnidade.getjBtPesquisar()) {
            String filtro = this.telaBuscaUnidade.getjComboFiltrar().getSelectedItem().toString();
            JOptionPane.showMessageDialog(null, "Pesquisando por: " + filtro);
        } else if (action.getSource() == this.telaBuscaUnidade.getjBtSair()) {
            this.telaBuscaUnidade.dispose();
        }
    }
}
