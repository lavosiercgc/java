package com.packTeste;

import java.awt.BorderLayout;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;

@SuppressWarnings("serial")
public class SimultaneoComThreads extends JFrame {

	public JLabel tempo = new JLabel("0");
	public JLabel idade = new JLabel();
	public int segundos = 0;

	// construtor
	public SimultaneoComThreads() {
		contarTempo ct = new contarTempo();
		editarLayout();
		ct.start();
		mostrarMensagem();
		//ct.stop();
	}

	public void mostrarMensagem() {
		int anoNasc = Integer.parseInt(JOptionPane.showInputDialog("Em que ano você nasceu? "));
		int anoAtual = Integer.parseInt(JOptionPane.showInputDialog("Em que ano estamos? "));
		int resultado = anoAtual - anoNasc;
		idade.setText("Sua idade é " + resultado);
		JOptionPane.showMessageDialog(null, "Você demorou " + segundos + " segundos para responder!");

	}

	public void editarLayout() {
		Font fonte = new Font("Arial", Font.BOLD, 50);
		Font fonte2 = new Font("Arial", Font.BOLD, 30);
		add(BorderLayout.NORTH, tempo);
		add(BorderLayout.CENTER, idade);

		tempo.setHorizontalAlignment(SwingConstants.CENTER);
		tempo.setFont(fonte);
		idade.setHorizontalAlignment(SwingConstants.CENTER);
		idade.setFont(fonte2);

		setSize(600, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);

	}

	public static void main(String[] args) {
		new SimultaneoComThreads();

	}
	//class publica declarada dentro de outra, onde roda a thread do sistema simultaneo
	public class contarTempo extends Thread {

		public void run() {
			while (true) {
				try {
					Thread.sleep(1000);
					segundos++;
					tempo.setText(segundos + "");
				} catch (Exception err) {
					System.out.println(err.getMessage());
				}
			}

		}

	}
}
