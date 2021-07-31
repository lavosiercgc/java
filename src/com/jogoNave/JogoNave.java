package com.jogoNave;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GraphicsEnvironment;
import java.awt.Image;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class JogoNave extends JFrame {
	Dimension dimensaoTela = Toolkit.getDefaultToolkit().getScreenSize();
	ImageIcon iconNave = new ImageIcon(getClass().getResource("nave2.gif"));
	ImageIcon iconFogo = new ImageIcon(getClass().getResource("circulo.png"));
	ImageIcon iconExplodir = new ImageIcon(getClass().getResource("explodir.gif"));
	ImageIcon iconFundo = new ImageIcon(getClass().getResource("fundo-do-espaco.jpg"));
	Bateu bateu = new Bateu();
	int xFogo = 350;
	int yFogo = 0;
	int xNave1 = 350;
	int yNave1 = 450;
	int pontos = 0;
	Boolean mousePressionado = false;

	Font fonteFogo = new Font("Arial", Font.BOLD, 0);
	Font fonteNave = new Font("Arial", Font.BOLD, 30);
	Color corFogo = new Color(0, 200, 0);

	JLabel lnave1 = new JLabel(iconNave);
	JLabel lnave2 = new JLabel("" + pontos);
	JLabel lFundo = new JLabel(iconFundo);
	JLabel lfogo = new JLabel(iconFogo);

	// CONSTRUTOR DA CLASSE PRINCIPAL

	public JogoNave() {
		Painel painel = new Painel();
		add(painel);
		painel.setLayout(new BorderLayout());
		painel.add(lFundo);
		

		editarJanela();
		editarComponetes();
		escutarTeclado();
		escutarMouse();
		new Mover().start();
		 MinimalTestPlayer player = new MinimalTestPlayer();
		 player.play("D:\\Filmes\\Planeta51.avi");
		 
		 
	}

	public void escutarTeclado() {
		addKeyListener(new KeyListener() {

			public void keyPressed(KeyEvent e) {
				int tecla = e.getKeyCode();
				pontos++;
				lnave2.setText(("" + pontos));

				if (tecla == 37) {
					xNave1 -= 20;
					lnave1.setBounds(xNave1, yNave1, 145, 200);

				}
				if (tecla == 39) {
					xNave1 += 20;
					lnave1.setBounds(xNave1, yNave1, 145, 200);
				}
				if (tecla == 38) {
					yNave1 -= 20;
					lnave1.setBounds(xNave1, yNave1, 145, 200);
				}
				if (tecla == 40) {
					yNave1 += 20;
					lnave1.setBounds(xNave1, yNave1, 145, 200);
				}
			}

			public void keyReleased(KeyEvent e) {

			}

			public void keyTyped(KeyEvent e) {

			}

		});
	}

	public void editarJanela() {
		
		setBackground(corFogo);
		setLayout(null);
		setResizable(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(dimensaoTela.width,dimensaoTela.height);
		setLocationRelativeTo(null);
		setVisible(true);
		new TreadFogo().start();

	}

	public void editarComponetes() {

		lfogo.setBounds(xFogo, yFogo, 150, 150);
		add(lfogo);

		lnave1.setBounds(xNave1, yNave1, 145, 200);
		lnave1.setFont(fonteNave);
		add(lnave1);

		lnave2.setBounds(0, 0, 300, 100);
		lnave2.setForeground(corFogo);
		lnave2.setFont(fonteNave);
		add(lnave2);

		lFundo.setBounds(0, 0, dimensaoTela.width, dimensaoTela.height);
		lFundo.setFont(fonteNave);
		add(lFundo);
		

	}

	public static void main(String[] args) {
		new JogoNave();

	}

	// velocidade do FOGO
	public class TreadFogo extends Thread {
		public void run() {
			while (true) {
				try {
					Thread.sleep(10);
				} catch (Exception e) {
				}
				yFogo += 1;
				if (yNave1 > 550) {
					yNave1 = 540;
				}
				if (yFogo > 590) {
					yFogo = 0;
				}
				if (xFogo < xNave1) {
					xFogo += 1;
				}
				if (xFogo > xNave1) {
					xFogo -= 1;
				}
				lfogo.setBounds(xFogo, yFogo, 150, 150);
				;
				if (bateu.bateu(lfogo, lnave1)) {
					lnave1.setIcon(iconExplodir);
					JOptionPane.showMessageDialog(null, "GAME OVER " + "Pontos: " + (pontos/20));
					System.exit(0);
				}
			}

		}

	}

	public class Painel extends JPanel {
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			Image img = (Image) lFundo.getIcon();
			g.drawImage(img, 0, 0, this);

		}

	}

	// ESCUTAND O MOUSE
	public void escutarMouse() {
		lnave1.addMouseListener(new MouseListener() {

			public void mouseClicked(MouseEvent arg0) {

			}

			public void mouseEntered(MouseEvent arg0) {

			}

			public void mouseExited(MouseEvent arg0) {

			}

			public void mousePressed(MouseEvent arg0) {
				mousePressionado = true;

			}

			public void mouseReleased(MouseEvent arg0) {
				mousePressionado = false;

			}

		});
	}

	public class Mover extends Thread {
		public void run() {
			while (true) {
				try {
					sleep(20);
				} catch (Exception e) {
				}
				if (mousePressionado) {
					pontos++;
					lnave2.setText("" + pontos);
					Point ponto = getMousePosition();
					lnave1.setBounds(xNave1 = ponto.x - 70, yNave1 = ponto.y - 100, 145, 200);
				}
			}
		}

	}
	// FIM DO ESCUTANDO O MOUSE

}
