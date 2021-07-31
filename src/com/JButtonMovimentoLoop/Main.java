package com.JButtonMovimentoLoop;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Main extends JFrame {
	
	public static int X = 0;
	public static int Y = 0;
	static JButton jb = new JButton("Eu");
	private static final long serialVersionUID = 1L;

	public static void main(String[] args) {
		new Main();

	}

	public Main() {
		
		
		setLayout(null);
		getContentPane().add(jb);
		jb.setBounds(X, Y, 60, 30);

		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("Joguinho");
		setSize(600, 400);
		setLocationRelativeTo(null);
		setVisible(true);
		setResizable(false);
		eixoX();
	}
	
	public static Integer eixoX(){
		myThread();
		X +=20;
		jb.setBounds(X, Y, 60, 30);
		if(X > 500 ){
			Y = 0;
			eixoY();
		}else{
			eixoX();
		}
		
	
		return eixoY();
	}
	public static Integer eixoY(){
		myThread();
		Y += 10;
		jb.setBounds(X, Y, 60, 30);
		if(Y > 325){
			X = 0;
			Y = 324;
			eixoX();
		}else{
			eixoY();
		}
		
		return eixoX();
	}
	
	public static void myThread(){
	
		try{
			Thread.sleep(30);
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
	}

}
