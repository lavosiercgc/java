package com.packTeste;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;

public class capturarTeclado extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public static void main(String[] args) {
		new capturarTeclado();
	}
	
	//implementa todo
	public capturarTeclado(){
		addKeyListener(new KeyListener(){

		
			public void keyPressed(KeyEvent e) {
			char letra = e.getKeyChar();
			int code = e.getKeyCode();
			System.out.print(letra +""+code);
				
			}

			
			public void keyReleased(KeyEvent e) {
				
				
			}

			
			public void keyTyped(KeyEvent e) {
				
				
			}
			
		});
		setSize(200,100);
		setLocationRelativeTo(null);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	//IMPLEMENTA PARCIAL
	public static void implementaParcial(){
		KeyListener kl = new KeyAdapter(){
			public void keyPressed(KeyEvent e) {
				char letra = e.getKeyChar();
				int code = e.getKeyCode();
				System.out.print(letra +""+code);
					
				}
			
		};
	}
}
