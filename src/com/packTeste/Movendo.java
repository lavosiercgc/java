package com.packTeste;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;
import java.io.FileWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

@SuppressWarnings("serial")
public class Movendo extends JFrame {
	
	Boolean mousePressionado = false;
	ImageIcon iconCirculo = new ImageIcon(getClass().getResource("\\Imagens\\circulo.png"));
	JLabel lcirculo1 = new JLabel(iconCirculo);
	JLabel lcirculo2 = new JLabel(iconCirculo);
	Dimension dimensao = Toolkit.getDefaultToolkit().getScreenSize();
	JButton btn = new JButton("Buscar");

	public Movendo() {
		//====================================
		addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				mousePressionado = false;
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				mousePressionado = true;
				desenhos.clear();
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		
		
		//====================================
		editarJanela();
		editarComponentes();
		new Time().start();

	}

	public void editarJanela() {

		setLayout(null);
		setSize(dimensao.width, dimensao.height);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);

	}

	public void editarComponentes() {
		btn.setBounds(0,0,100,50);
		add(btn);
		btn.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0) {
				
				
			}
			
		});
		
		lcirculo1.setBounds(100, 0, 150, 150);
		add(lcirculo1);

	}

	public static void main(String[] args) {
		new Movendo();

	}

	public void paint(Graphics g) {
		for (int i = 1; i < desenhos.size(); i++) {
			int x = desenhos.get(i).x;
			int y = desenhos.get(i).y;
			int x2 = desenhos.get(i - 1).x;
			int y2 = desenhos.get(i - 1).y;
			
			//EscrevendoEmArquivo("_"+x+"_"+y);
			//====================
			g.drawLine(x2,y2,x,y);
		}

	}
	// Escrevendo no arquivo salvando as coordenadas do mouse
	public void EscrevendoEmArquivo(String texto) {
		Path caminho = Paths.get("c:/ArrayList.txt");
		byte[] textEmByte = texto.getBytes();
		try {
			Files.write(caminho, textEmByte, StandardOpenOption.APPEND);

		} catch (Exception e) {

		}
	}

	ArrayList<Desenho> desenhos = new ArrayList<Desenho>();

	public class Desenho {
		int x, y;

		public Desenho(int x, int y) {
			this.x = x;
			this.y = y;
			
		}

	}

	public class Time extends Thread {
		//LerArquivo la = new LerArquivo();
		public void run() {
			while (true) {
				if(mousePressionado){
				try {
					Point ponto = getMousePosition();
					desenhos.add(new Desenho(ponto.x, ponto.y));
					EscrevendoEmArquivo("_"+ponto.x+"_"+ponto.y);
					//sleep(5);
				} catch (Exception e) { System.out.println(e.getMessage());
				}
				}repaint();
				seguindo();
				
			}
		}

		public void seguindo() {
			for (int i = 1; i < desenhos.size(); i++) {
				int x = desenhos.get(i-1).x;
				int y = desenhos.get(i-1).y;
				try {
					
				//	sleep(1);
				} catch (Exception e) {
				}
				lcirculo1.setBounds(x - 75, y - 75, 150, 150);

			}

		}
	}

}
