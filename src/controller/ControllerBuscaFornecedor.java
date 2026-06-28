package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import view.TelaBuscaFornecedor;

public class ControllerBuscaFornecedor implements ActionListener {

    TelaBuscaFornecedor telaBuscaFornecedor;

    public ControllerBuscaFornecedor(TelaBuscaFornecedor telaBuscaFornecedor) {
        this.telaBuscaFornecedor = telaBuscaFornecedor;

        this.telaBuscaFornecedor.getjBtCarregar().addActionListener(this);
        this.telaBuscaFornecedor.getjBtPesquisar().addActionListener(this);
        this.telaBuscaFornecedor.getjBtSair().addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent action) {
        if (action.getSource() == this.telaBuscaFornecedor.getjBtCarregar()) {

        } else if (action.getSource() == this.telaBuscaFornecedor.getjBtPesquisar()) {
            String filtro = this.telaBuscaFornecedor.getjComboFiltrar().getSelectedItem().toString();
            JOptionPane.showMessageDialog(null, "Pesquisando por: " + filtro);
        } else if (action.getSource() == this.telaBuscaFornecedor.getjBtSair()) {
            this.telaBuscaFornecedor.dispose();
        }
    }
}
