package brickBreaker;

import javax.swing.JFrame;

public class Main {

	public static void main(String[] args) {
		JFrame obj = new JFrame();
		GamePlay gamePlay = new GamePlay();
		obj.setBounds(10,10,700,600);
		obj.setTitle("BrickBreaker");
		obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		obj.setLocationRelativeTo(null);
		obj.setResizable(false);
		obj.add(gamePlay);
		obj.setVisible(true);

	}

}
