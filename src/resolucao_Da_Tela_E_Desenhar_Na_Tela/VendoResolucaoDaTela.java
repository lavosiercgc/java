package resolucao_Da_Tela_E_Desenhar_Na_Tela;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Toolkit;

import javax.swing.JFrame;

@SuppressWarnings("serial")
public class VendoResolucaoDaTela extends JFrame {
	
	//ME RETORNA A RESOLUCAO DA TELA NO PC UTILIZADO
	Dimension dimensaoTela =Toolkit.getDefaultToolkit().getScreenSize();
	
	public VendoResolucaoDaTela(){
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(null);
		setResizable(false);
		setSize(dimensaoTela.width,dimensaoTela.height);
		setTitle("Lavosier");
		setLocationRelativeTo(null);
		setVisible(true);
		
			
	}
	public void paint(Graphics g){
		g.drawLine(100,100,500,500);
		g.drawRect(400, 100, 300,300);
		g.drawOval(400,100, 300, 300);
		g.fillRect(700, 400, 400, 400);
		g.setColor(Color.blue);
		g.fillOval(720, 400, 360,360);
		g.drawLine(150,200,600,600);
	}

	public static void main(String[] args) {
		new VendoResolucaoDaTela();
	}
	public class movendo extends  Thread{
		public void run(){
			int i = 100;
			while(true){
				i++;
				try{sleep(20);}catch(Exception e){}
								
				
			}
		}
		
	}
	

}
