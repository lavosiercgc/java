package com.packTeste;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

@SuppressWarnings("serial")
public class MovendoGravado extends JFrame {

	Boolean mousePressionado = false;
	ImageIcon iconCirculo = new ImageIcon(getClass().getResource("\\Imagens\\circulo.png"));
	JLabel lcirculo1 = new JLabel(iconCirculo);
	JLabel lcirculo2 = new JLabel(iconCirculo);
	Dimension dimensao = Toolkit.getDefaultToolkit().getScreenSize();
	JButton btn = new JButton("Buscar");

	public MovendoGravado() {
		editarJanela();
		editarComponentes();
		lendoCoordenadas();

	}

	public void editarJanela() {

		setLayout(null);
		setSize(dimensao.width, dimensao.height);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);

	}

	public void editarComponentes() {
		btn.setBounds(0, 0, 100, 50);
		add(btn);
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

			}

		});

		//lcirculo1.setBounds(100, 0, 150, 150);
		add(lcirculo1);

	}

	public static void main(String[] args) {
		new MovendoGravado();

	}
	
	ArrayList<arrayCordenadas> arrayCordenadas = new ArrayList<arrayCordenadas>();

	public class arrayCordenadas {
		int x, y;

		public arrayCordenadas(int x, int y) {
			this.x = x;
			this.y = y;
			lcirculo1.setBounds(x, y, 150, 150);
			
		}

	}
	public void lendoCoordenadas() {
		Path caminho = Paths.get("c:/ArrayList.txt");
		try {
			byte[] texto = Files.readAllBytes(caminho);
			String leitura = new String(texto);
			String [] coordenadas = leitura.split("_");
			int c = coordenadas.length;
			
			
			for(int i = 1; i < c; i++){
				try{Thread.sleep(10);}catch(Exception e){}
				String a =coordenadas[i];
				String b =coordenadas[i+1];
				Integer x = Integer.valueOf(a);
				Integer y = Integer.valueOf(b);
				new arrayCordenadas(x,y);	
				//lcirculo1.setBounds(x, y, 150, 150);
			
			}
			
		} catch (Exception err) {
			//System.out.println(err.getMessage());
		}
	}
	
	public class Time extends Thread {
		
		
		public void run() {
			while (true){
				
				
				try{sleep(100);}catch(Exception e){}
			}
			
			
		}

	}

}
