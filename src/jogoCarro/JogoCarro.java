package jogoCarro;

import java.awt.Component;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

@SuppressWarnings("serial")
public class JogoCarro extends JFrame {

	JLabel lcarro1 = new JLabel(new ImageIcon(getClass().getResource("car1.png")));
	JLabel lcarro2 = new JLabel(new ImageIcon(getClass().getResource("car2.png")));
	JLabel lcarro3 = new JLabel(new ImageIcon(getClass().getResource("car3.jpg")));

	public JogoCarro() {
		editarJanela();
		new Movimento().start();
	}

	public void editarJanela() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(1200, 250);
		setLocationRelativeTo(null);
		setVisible(true);
		setLayout(null);
		lcarro1.setBounds(0, 100, 200, 100);
		lcarro2.setBounds(950, 100, 200, 100);
		add(lcarro1);
		add(lcarro2);
		bateu(lcarro1,lcarro2);
	}

	public static void main(String[] args) {
		new JogoCarro();

	}

	
	//METODO PARA MAPEAR O MOVIMENTO DOS OBJETOS AVISAR DA COLISÃO
	public boolean bateu(Component a, Component b){
		int aX = a.getX();
		int aY = a.getY();
		int ladoDireitoA = aX+a.getWidth();
		int ladoEsquerdoA = aX;
		int ladoBaixoA = aY+a.getHeight();
		int ladoCimaA = aY;
		
		int bX = b.getX();
		int bY = b.getY();
		int ladoDireitoB = bX+b.getWidth();
		int ladoEsquerdoB = bX;
		int ladoBaixoB = bY+b.getHeight();
		int ladoCimaB = bY;
		
		boolean bateu = false;
		
		boolean cDireita = false;
		boolean cCima = false;
		boolean cBaixo = false;
		boolean cEsquerda = false;
		
		if(ladoDireitoA >=ladoEsquerdoB){
			cDireita = true;
		}
		if(ladoCimaA <=ladoBaixoB){
			cCima = true;
		}
		if(ladoBaixoA >=ladoCimaB){
			cBaixo = true;
		}
		
		if(ladoEsquerdoA <=ladoDireitoB){
			cEsquerda = true;
		}
		
		if(cDireita && cEsquerda && cBaixo && cCima){
			bateu = true;
		}
		
		
		return bateu;
	}
	// FINAL DO METODO PARA AVISO DE COLISÃO DOS OBJETOS
	
	// new class thread

		public class Movimento extends Thread {
			public void run() {
				while (true) {
					try {sleep(10);} catch (Exception e) {}
							lcarro1.setBounds(lcarro1.getX() + 2, 0, 250, 150);
							lcarro2.setBounds(lcarro2.getX() - 1, 0, 250, 150);
							
							if(bateu(lcarro1,lcarro2)){
								JOptionPane.showMessageDialog(null, "VOCÊ BATEU O VEICULO");
								System.exit(0);
							}
						

				}
			}
		}

}
