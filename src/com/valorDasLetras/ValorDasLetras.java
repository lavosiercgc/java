package com.valorDasLetras;

import java.util.Scanner;

import javax.script.ScriptException;

public class ValorDasLetras {
	static String texto = null;

	public static void main(String[] args) throws ScriptException {
		CallLettersValue();

	}

	public static void CallLettersValue() throws ScriptException {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println();
		String str = sc.nextLine();
		if(str.contains("1")||str.contains("2")||str.contains("3")||str.contains("4")||str.contains("5")
				||str.contains("6")||str.contains("7")||str.contains("8")||str.contains("9")){
		lettersValue(str,1);
		}else{
			lettersValue(str);
		}
	}
	
	public static Integer lettersValue(String letter) throws ScriptException {
		Integer valorPalavra = null;
		int aa = letter.length();
		String[] ab = letter.split("");

		for (int ix = 0; ix < aa; ix++) {
			valorPalavra = FuncaoLetras.lettersValue(ab[ix]);
			System.out.print(" "+valorPalavra);

		}
		CallLettersValue();
		return valorPalavra;
	}
	
	public static String lettersValue(String letter, int a) throws ScriptException {
		String [] textoSeparado = letter.split(" ");
		int ta =textoSeparado.length;
		String valorPalavra= "";
		for (int ix = 0; ix < ta ; ix++) {
			valorPalavra = FuncaoLetras.lettersValue(textoSeparado[ix],true);
			System.out.print(" "+valorPalavra);


		}
		CallLettersValue();
		return  valorPalavra;
	}

}
