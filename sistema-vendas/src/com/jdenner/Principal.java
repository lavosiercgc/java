package com.jdenner;

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import com.jdenner.gui.Menu;

/**
 * Classe principal que inicia a aplicação
 *
 * @author Lavosier
 */
public class Principal {

    /**
     * Metodo responsavel por iniciar a aplica��o
     *
     * @param args lista de parametros do metodo main
     */
    public static void main(String[] args) {
        lookAndFeel();
        Menu menu = new Menu();
        menu.setVisible(true);
    }

    private static void lookAndFeel() {

        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            JFrame.setDefaultLookAndFeelDecorated(true);
            JDialog.setDefaultLookAndFeelDecorated(true);
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException e) {
            JOptionPane.showMessageDialog(null, e, "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

}
