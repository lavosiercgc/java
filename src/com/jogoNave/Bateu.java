package com.jogoNave;

import java.awt.Component;

public class Bateu {

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
	

}
