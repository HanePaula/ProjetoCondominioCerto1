package utilities;

import java.awt.Component;
import java.awt.Container;
import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Utilities {

    public static void AtivaDesativa(Container container, boolean ativar) {
        for (Component c : container.getComponents()) {
            String cmd = ((javax.swing.AbstractButton) null instanceof javax.swing.AbstractButton
                    ? ((javax.swing.AbstractButton) c).getActionCommand() : "");
            try {
                cmd = ((javax.swing.AbstractButton) c).getActionCommand();
            } catch (Exception e) {
                cmd = "0";
            }
            if (cmd.equals("1")) {
                c.setEnabled(!ativar);
            } else {
                c.setEnabled(ativar);
            }
        }
    }

    public static void LimpaComponentes(Container container, boolean habilitar, ButtonGroup bg) {
        for (Component c : container.getComponents()) {
            if (c instanceof JTextField) {
                ((JTextField) c).setText("");
                c.setEnabled(habilitar);
            } else if (c instanceof JTextArea) {
                ((JTextArea) c).setText("");
                c.setEnabled(habilitar);
            } else if (c instanceof JComboBox) {
                ((JComboBox<?>) c).setSelectedIndex(0);
                c.setEnabled(habilitar);
            } else if (c instanceof JCheckBox) {
                ((JCheckBox) c).setSelected(false);
                c.setEnabled(habilitar);
            } else if (c instanceof JRadioButton) {
                ((JRadioButton) c).setSelected(false);
                c.setEnabled(habilitar);
            } else if (c instanceof Container) {
                LimpaComponentes((Container) c, habilitar, bg);
            }
        }
        if (bg != null) {
            bg.clearSelection();
        }
    }
}