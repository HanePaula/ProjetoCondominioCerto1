package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import view.TelaBuscaEdificio;

public class ControllerBuscaEdificio implements ActionListener {

    TelaBuscaEdificio telaBuscaEdificio;

    public ControllerBuscaEdificio(TelaBuscaEdificio telaBuscaEdificio) {

        this.telaBuscaEdificio = telaBuscaEdificio;

        this.telaBuscaEdificio.getjBtCarregar().addActionListener(this);
        this.telaBuscaEdificio.getjBtPesquisar().addActionListener(this);
        this.telaBuscaEdificio.getjBtSair().addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent action) {

        if (action.getSource() == this.telaBuscaEdificio.getjBtCarregar()) {

        } else if (action.getSource() == this.telaBuscaEdificio.getjBtPesquisar()) {
            
            if (this.telaBuscaEdificio.getjComboFiltrar().getSelectedItem().toString() == "Id"){
                JOptionPane.showMessageDialog(null, "ID");
            }else if (this.telaBuscaEdificio.getjComboFiltrar().getSelectedItem().toString() == "Nome"){
                JOptionPane.showMessageDialog(null, "Nome");
            }
            
            //Id, Nome, CNPJ, CEP, Cidade
            
            

        } else if (action.getSource() == this.telaBuscaEdificio.getjBtSair()) {
            this.telaBuscaEdificio.dispose();
        }
    }
}
