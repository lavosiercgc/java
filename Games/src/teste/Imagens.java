package teste;

import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

@SuppressWarnings("serial")
public class Imagens extends JFrame {
	Dimension d = Toolkit.getDefaultToolkit().getScreenSize();

	ImageIcon icon = new ImageIcon(getClass().getResource("Wolverine.png"));
	
	JLabel l = new JLabel(icon);
	JLabel l1 = new JLabel(icon);

	public Imagens() {
		
		
		int x = d.width, y = d.height;
		setSize(x, y);
		add(l);
		add(l1);
		new mudar().start();

		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
		setResizable(false);

	}

	public static void main(String[] args) {
		new Imagens();

	}

	public class mudar extends Thread {
		public void run() {
			int x = 450;
			while (true) {
				x +=2;
				l.setBounds(x, 100, 360,450);
				l1.setBounds(x+360, 100, 360,450);
				x++;
				if(x > 456){
					x = 450;
				}

				try {
					sleep(1);
				} catch (Exception e) {
				}
			}
		}
	}

}
