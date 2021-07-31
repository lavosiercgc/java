package jogoDaVelha;


import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 * Classe principal que inicia a aplicação
 *
 * @author Lavosier
 */
public class Principal {

    /**
     * Metodo responsavel por iniciar a aplica�ao
     * 
     * @param args lista de parametros do metodo main em jogo da velha
     */
    public static void main(String[] args) {
        lookAndFeel();
        JogoDaVelha CapaWindows = new JogoDaVelha();
        CapaWindows.setVisible(true);
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
