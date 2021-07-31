package com.packTeste;

import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Cronometro extends JFrame {

	private static final long serialVersionUID = 1L;
	JLabel numero = new JLabel("0");
	Font fonte = new Font("Arial", Font.BOLD, 150);

	public static void main(String[] args) {
		new Cronometro();

	}

	public Cronometro() {
		add(numero);
		numero.setFont(fonte);
		numero.setHorizontalAlignment(SwingConstants.CENTER);
		setTitle("Cronometro");
		setSize(300, 300);
		setResizable(true);
		setLocationRelativeTo(null);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		contagem();

	}

	public void contagem() {
		int n = 0;
		while (true) {
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
			}
			n++;
			numero.setText((n * 100) + "");
		}
	}

}
