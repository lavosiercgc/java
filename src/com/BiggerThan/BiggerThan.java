package com.BiggerThan;

/* RETORNA O MAIOR VALOR ENTRE DOIS NUMEROS, VINDOS COM INTEGER, DOUBLE, FLOAT, STRING*/

import javax.swing.JOptionPane;

public class BiggerThan {
	
	public BiggerThan( ){
		
	}
	
	
	public static void main(String[] args) {
		new BiggerThan();
		
	}
	
	public  Integer biggerThan(int a, int b) {
		boolean x = a > b;
		if (x) {
			return a;
		} else {
			return b;
		}
	}

	public  Double biggerThan(double a, double b) {
		boolean x = a > b;
		if (x) {
			return a;
		} else {
			return b;
		}
	}

	public  Float biggerThan(float a, float b) {
		boolean x = a > b;
		if (x) {
			return a;
		} else {
			return b;
		}
	}

	public  Boolean biggerThan(String a, String b) {
		try {
			Integer xa = Integer.valueOf(a);
			Integer xb = Integer.valueOf(a);

			if (xa > 0) {
				xa = Integer.valueOf(a);
				xb = Integer.valueOf(b);
				if (xa > xb) {
					return true;
				} else {
					return false;
				}

			} else if (xa > xb) {
				return true;
			} else {
				return false;

			}
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null,e.getMessage()+" não é um numero valido");
		}
		return false;
	}
}
