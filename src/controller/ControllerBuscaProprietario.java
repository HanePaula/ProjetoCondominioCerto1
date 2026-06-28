package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import view.TelaBuscaProprietario;

public class ControllerBuscaProprietario implements ActionListener {

    TelaBuscaProprietario telaBuscaProprietario;

    public ControllerBuscaProprietario(TelaBuscaProprietario telaBuscaProprietario) {
        this.telaBuscaProprietario = telaBuscaProprietario;

        this.telaBuscaProprietario.getjBtCarregar().addActionListener(this);
        this.telaBuscaProprietario.getjBtPesquisar().addActionListener(this);
        this.telaBuscaProprietario.getjBtSair().addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent action) {
        if (action.getSource() == this.telaBuscaProprietario.getjBtCarregar()) {
            // Lógica para carregar o registro selecionado de volta para a tela de cadastro
        } else if (action.getSource() == this.telaBuscaProprietario.getjBtPesquisar()) {
            String filtro = this.telaBuscaProprietario.getjComboFiltrar().getSelectedItem().toString();
            JOptionPane.showMessageDialog(null, "Pesquisando por: " + filtro);
        } else if (action.getSource() == this.telaBuscaProprietario.getjBtSair()) {
            this.telaBuscaProprietario.dispose();
        }
    }
}
