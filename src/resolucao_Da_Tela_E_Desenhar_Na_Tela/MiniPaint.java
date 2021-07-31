package resolucao_Da_Tela_E_Desenhar_Na_Tela;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import javax.swing.JFrame;

@SuppressWarnings("serial")
public class MiniPaint extends JFrame {
	Boolean pressionado = false;
	Dimension dimensao = Toolkit.getDefaultToolkit().getScreenSize();
	
	public MiniPaint(){
		setSize(dimensao.width,dimensao.height);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
		new TimeDesenho().start();
		///INCIO  MOUSE LISTENER
		addMouseListener(new MouseListener() {
			
		
			public void mouseReleased(MouseEvent e) {
				pressionado = false;
			}			
			public void mousePressed(MouseEvent e) {
				pressionado = true;
				desenhos.clear();
				
			}		
			public void mouseExited(MouseEvent e) {
					
			}
			public void mouseEntered(MouseEvent e) {
				
				
			}			
			public void mouseClicked(MouseEvent e) {
				
				
			}
		});
		
		//FIM MOUSE LISTENER
	}
	
	ArrayList<Desenho> desenhos = new ArrayList<Desenho>();
	public class Desenho{
		int x,y;
		public Desenho(int x, int y){
			this.x=x;
			this.y=y;
			
		}
	}
	public class TimeDesenho extends Thread{
		public void run(){
			while(true){
				if(pressionado){
				try{
				Point ponto = getMousePosition();
				desenhos.add(new Desenho(ponto.x,ponto.y));
				sleep(10);
				}catch(Exception e){}
				repaint();
				}
			}
			
		}
	}
	public void paint(Graphics g){
		for(int i = 1; i < desenhos.size();i++ ){
			int x = desenhos.get(i).x;
			int y = desenhos.get(i).y;
			int x2 =desenhos.get(i-1).x;
			int y2 = desenhos.get(i-1).y;
			g.drawLine(x2, y2, x, y);
			System.out.println(x +"<<x == y>>"+y);
			}
	}

	public static void main(String[] args) {
		new MiniPaint();

	}

}
