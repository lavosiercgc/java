package com.packTeste;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

@SuppressWarnings("serial")
public class PrimeiroJogoNave extends JFrame {
	int xFogo = 350;
	int yFogo = 0;
	int xNave1 = 350;
	int yNave1 = 450;

	Font fonteFogo = new Font("Arial", Font.BOLD, 30);
	Font fonteNave = new Font("Arial", Font.BOLD, 20);
	Color corFogo = new Color(50, 200, 50);

	JLabel lnave1 = new JLabel("NAVE1");
	JLabel lnave2 = new JLabel("NAVE2");
	JLabel lfogo = new JLabel("FOGO");

	// CONSTRUTOR DA CLASSE PRINCIPAL

	public PrimeiroJogoNave() {

		editarJanela();
		editarComponetes();
		escutarTeclado();
	}

	public void escutarTeclado() {
		addKeyListener(new KeyListener() {

			public void keyPressed(KeyEvent e) {
				int tecla = e.getKeyCode();
				
				if (tecla == 37) {
					xNave1 -= 20;
					lnave1.setBounds(xNave1, yNave1, 100, 100);
				}
				if (tecla == 39) {
					xNave1 += 20;
					lnave1.setBounds(xNave1, yNave1, 100, 100);
				}
				if (tecla == 38) {
					yNave1 -= 20;
					lnave1.setBounds(xNave1, yNave1, 100, 100);
				}
				if (tecla == 40) {
					yNave1 += 20;
					lnave1.setBounds(xNave1, yNave1, 100, 100);
				}
			}

			public void keyReleased(KeyEvent e) {

			}

			public void keyTyped(KeyEvent e) {

			}

		});
	}

	public void editarComponetes() {
		
		lfogo.setBounds(xFogo, yFogo, 100, 100);
		lfogo.setFont(fonteFogo);
		add(lfogo);
		lnave1.setBounds(xNave1, yNave1, 100, 100);
		lnave1.setFont(fonteNave);
		add(lnave1);

	}

	public void editarJanela() {
		setBackground(corFogo);
		setLayout(null);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(800, 600);
		setLocationRelativeTo(null);
		setVisible(true);
		new TreadFogo().start();

	}

	public static void main(String[] args) {
		new PrimeiroJogoNave();

	}

	// velocidade do FOGO e simulando o desejo do fogo em atingir a nave
	public class TreadFogo extends Thread {
		public void run() {
			while (true) {
				try {
					Thread.sleep(18);
				} catch (Exception e) {
				}
				yFogo += 5;
				if (yFogo > 500) {
					yFogo = 0;
				}
				if(xFogo < xNave1){
					xFogo += 3;
				}if(xFogo > xNave1){
					xFogo -= 3;
				}
				
				lfogo.setBounds(xFogo, yFogo, 100, 50);
			}

		}

	}

}
