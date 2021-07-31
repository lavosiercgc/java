package pongGame;
//VERSAO JFRAME

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;

public class Tennis extends JFrame  implements Runnable, KeyListener {
	private static final long serialVersionUID = 1L;
	int WIDTH = 700, HEIGHT = 500;
	Thread thread;
	HumanPaddle p1;
	AIPaddle p2;
	Ball b1;
	boolean gameStarted;
	Graphics gfx;
	Image img;

	public Tennis() {
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(null);
		setSize(WIDTH, HEIGHT);
		setVisible(true);
		gameStarted = false;
		addKeyListener(this);
		p1 = new HumanPaddle(1);
		b1 = new Ball();
		p2 = new AIPaddle(2, b1);
		img = createImage(WIDTH, HEIGHT);
		//gfx = img.getGraphics();
		thread = new Thread(this);
		thread.start();

	}

	public void paint(Graphics g) {
		gfx = img.getGraphics();
		gfx.setColor(Color.black);
		gfx.fillRect(0, 0, WIDTH, HEIGHT);
		if(b1.getX() < -10 || b1.getX() > 710){
			gfx.setColor(Color.red);
			gfx.drawString("Game Over",350,250);
			
		}else{
		p1.draw(gfx);
		b1.draw(gfx);
		p2.draw(gfx);
		
		}
		if(!gameStarted){
			gfx.setColor(Color.white);
			gfx.drawString("Tennis", 340,100);
			gfx.drawString("Pressione \"Enter\" para iniciar", 310, 130);
		}
		g.drawImage(img,0,0,this);
	}

	public void update(Graphics g) {
		paint(g);
	}

	public void run() {
		for (;;) {
			if (gameStarted) {
				p1.move();
				p2.move();
				b1.move();
				b1.checkPaddleCollision(p1, p2);
			}
			repaint();
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

	public void keyPressed(KeyEvent e) {
		if (e.getKeyCode() == KeyEvent.VK_UP) {
			p1.setUpAccel(true);
		} else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
			p1.setDownAccel(true);

		}else if(e.getKeyCode() == KeyEvent.VK_ENTER){
			gameStarted = true;
		}

	}

	public void keyReleased(KeyEvent e) {
		if (e.getKeyCode() == KeyEvent.VK_UP) {
			p1.setUpAccel(false);
		} else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
			p1.setDownAccel(false);

		}

	}

	public void keyTyped(KeyEvent arg0) {

	}
	public static void main(String[] args){
		new Tennis();
	}

}
