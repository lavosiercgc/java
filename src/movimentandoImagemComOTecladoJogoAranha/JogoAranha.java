package movimentandoImagemComOTecladoJogoAranha;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class JogoAranha extends JFrame {

	ImageIcon iconParede = new ImageIcon(getClass().getResource("wall-3291473_1280.png"));
	//ImageIcon iconJunping = new ImageIcon(getClass().getResource("SpiJunping.gif"));
	ImageIcon iconJunping = new ImageIcon(getClass().getResource("SpiFight.gif"));
	ImageIcon iconFight = new ImageIcon(getClass().getResource("SpiJunping.gif"));

	JLabel lParede = new JLabel(iconParede);
	JLabel lSpider = new JLabel(iconJunping);
	int posSpiderX = 300;
	int posSpiderY = 300;

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public JogoAranha() {
		editarJanela();
		editarComponentes();
		addMovimento();

	}

	public void addMovimento() {
		addKeyListener(new KeyListener() {

			@Override
			public void keyPressed(KeyEvent arg0) {
				lSpider.setIcon(iconFight);
				//System.out.println(arg0.getKeyCode());
				if (arg0.getKeyCode() == 37) {
					posSpiderX  -= 15;

				}
				if (arg0.getKeyCode() == 38) {
					posSpiderY  -= 15;

				}
				if (arg0.getKeyCode() == 39) {
					posSpiderX  += 15;

				}
				if (arg0.getKeyCode() == 40) {
					posSpiderY += 15;

				}
				lSpider.setBounds(posSpiderX,posSpiderY,224,200);

			}

			@Override
			public void keyReleased(KeyEvent arg0) {
				if(arg0.getKeyCode()==37 ||arg0.getKeyCode()==38 ||arg0.getKeyCode()==39 ||arg0.getKeyCode()==40)
					lSpider.setIcon(iconJunping);

			}

			@Override
			public void keyTyped(KeyEvent arg0) {

			}

		});

	}

	public void editarComponentes() {
		lParede.setBounds(0, 0, 800, 600);
		lSpider.setBounds(posSpiderX, posSpiderY, 347, 165);
	}

	public void editarJanela() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(800, 600);
		setLocationRelativeTo(null);
		setVisible(true);
		setLayout(null);
		add(lSpider);
		add(lParede);

	}

	public static void main(String[] args) {
		JogoAranha J = new JogoAranha();

	}

}
