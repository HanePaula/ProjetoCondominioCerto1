/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import controller.ControllerCadastroEdificio;
import controller.ControllerCadastroUnidade;
import controller.ControllerCadastroProprietario;
import controller.ControllerCadastroFornecedor;
import controller.ControllerCadastroSindicoProfissional;
import controller.ControllerCadastroAreaCompartilhada;
import controller.ControllerCadastroCustoNivel1;
import controller.ControllerCadastroCustoNivel2;
import controller.ControllerCadastroUnidadeCondomino;

/**
 *
 * @author aluno
 */
public class TelaMenuPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form TelaMenuPrincipal
     */
    public TelaMenuPrincipal() {
        initComponents();
        
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TelaCadastroUnidade tela = new TelaCadastroUnidade(null, true);
                new ControllerCadastroUnidade(tela);
                tela.setVisible(true);
            }
        });
        
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TelaCadastroProprietario tela = new TelaCadastroProprietario(null, true);
                new ControllerCadastroProprietario(tela);
                tela.setVisible(true);
            }
        });
        
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TelaCadastroFornecedor tela = new TelaCadastroFornecedor(null, true);
                new ControllerCadastroFornecedor(tela);
                tela.setVisible(true);
            }
        });
        
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TelaCadastroSindicoProfissional tela = new TelaCadastroSindicoProfissional(null, true);
                new ControllerCadastroSindicoProfissional(tela);
                tela.setVisible(true);
            }
        });
        
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                System.exit(0);
            }
        });

        // --- Adicionando programaticamente as telas que faltavam no menu principal ---
        
        javax.swing.JMenuItem jMenuItemUnidadeCondomino = new javax.swing.JMenuItem("Unidade Condômino");
        jMenuItemUnidadeCondomino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TelaCadastroUnidadeCondomino tela = new TelaCadastroUnidadeCondomino(null, true);
                new ControllerCadastroUnidadeCondomino(tela);
                tela.setVisible(true);
            }
        });
        
        javax.swing.JMenuItem jMenuItemAreaCompartilhada = new javax.swing.JMenuItem("Área Compartilhada");
        jMenuItemAreaCompartilhada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TelaCadastroAreaCompartilhada tela = new TelaCadastroAreaCompartilhada(null, true);
                new ControllerCadastroAreaCompartilhada(tela);
                tela.setVisible(true);
            }
        });
        
        javax.swing.JMenuItem jMenuItemCustoNivel1 = new javax.swing.JMenuItem("Custo Nível 1");
        jMenuItemCustoNivel1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TelaCadastroCustoNivel1 tela = new TelaCadastroCustoNivel1(null, true);
                new ControllerCadastroCustoNivel1(tela);
                tela.setVisible(true);
            }
        });
        
        javax.swing.JMenuItem jMenuItemCustoNivel2 = new javax.swing.JMenuItem("Custo Nível 2");
        jMenuItemCustoNivel2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TelaCadastroCustoNivel2 tela = new TelaCadastroCustoNivel2(null, true);
                new ControllerCadastroCustoNivel2(tela);
                tela.setVisible(true);
            }
        });

        // Inserir organizadamente no jMenu2 ("Cadastros")
        jMenu2.insert(jMenuItemUnidadeCondomino, 2);
        jMenu2.insert(jMenuItemAreaCompartilhada, 3);
        
        // Posição do Sair atualmente é a última. Inserir os Custos e Separador antes dela.
        int count = jMenu2.getItemCount();
        int insertIndex = count - 2; // Inserir antes de jSeparator2 (que é count - 2) e jMenuItem7 (count - 1)
        jMenu2.insertSeparator(insertIndex++);
        jMenu2.insert(jMenuItemCustoNivel1, insertIndex++);
        jMenu2.insert(jMenuItemCustoNivel2, insertIndex++);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jMenu2.setText("Cadastros");

        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Company.png"))); // NOI18N
        jMenuItem2.setText("Edificio");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem2);

        jMenuItem3.setText("Unidade Hab./Com.");
        jMenu2.add(jMenuItem3);
        jMenu2.add(jSeparator1);

        jMenuItem4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Boss.png"))); // NOI18N
        jMenuItem4.setText("Proprietário");
        jMenu2.add(jMenuItem4);

        jMenuItem5.setText("Fornecedor");
        jMenu2.add(jMenuItem5);

        jMenuItem6.setText("Síndico Profissional");
        jMenu2.add(jMenuItem6);
        jMenu2.add(jSeparator2);

        jMenuItem7.setText("Sair");
        jMenu2.add(jMenuItem7);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Movimentos");
        jMenuBar1.add(jMenu3);

        jMenu4.setText("Relatórios");
        jMenuBar1.add(jMenu4);

        jMenu5.setText("Ajuda");

        jMenuItem1.setText("Sobre");
        jMenu5.add(jMenuItem1);

        jMenuBar1.add(jMenu5);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 652, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 351, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed

        TelaCadastroEdificio telaCadastroEdificio = new TelaCadastroEdificio(null, true);
        new ControllerCadastroEdificio(telaCadastroEdificio);
        telaCadastroEdificio.setVisible(true);

    }//GEN-LAST:event_jMenuItem2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaMenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaMenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaMenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaMenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaMenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    // End of variables declaration//GEN-END:variables
}
