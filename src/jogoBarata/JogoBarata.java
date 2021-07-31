package jogoBarata;

import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

@SuppressWarnings("serial")
public class JogoBarata extends JFrame {

	Boolean mousePressionado = false;

	int largura = 800;
	int altura = 670;

	ImageIcon barataParada = new ImageIcon(getClass().getResource("barataParada.gif"));
	ImageIcon barataCorrendo = new ImageIcon(getClass().getResource("barataCorrendo.gif"));
	JLabel l = new JLabel(barataParada);

	public JogoBarata() {
		editarJanela();
		int x = (int) (Math.random() * 700);
		int y = (int) (Math.random() * 600);
		l.setBounds(x, y, 250, 150);
		add(l);
		new Mover().start();
		l.addMouseListener(new MouseListener() {

			@Override
			public void mouseClicked(MouseEvent e) {
				if (l.getIcon() == barataParada) {
					l.setIcon(barataCorrendo);
				} else {
					l.setIcon(barataParada);
				}
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mousePressed(MouseEvent e) {
				mousePressionado = true;
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				mousePressionado = false;

			}
		});
	}

	public void editarJanela() {
		setSize(largura, altura);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(true);
		setLayout(null);
		setLocationRelativeTo(null);
		setVisible(true);

	}

	public static void main(String[] args) {
		new JogoBarata();
	}

	public class Mover extends Thread {
		@SuppressWarnings("unused")
		public void run() {
			while (true) {
				try {
					Thread.sleep(10);
					if (mousePressionado) {
						Point ponto = getMousePosition();
						l.setBounds(ponto.x-140, ponto.y-90, 250, 150);
					}
				} catch (Exception erro) {
					if(erro.getMessage() == null){
						JOptionPane.showMessageDialog(null, "FIM DE JOGO, VOCÊ ULTRAPASSOU O LIMITE PERMITIDO");
						System.exit(0);
					}else{
					System.out.println(erro.getMessage());
					}
				}

			}
		}

	}

}
