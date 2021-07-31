package com.ConcatenadoArrays;

public class ImitandoReplace {

	// ERRO QUANDO USADO COM OPERADORES MATEMATICOS

	public static void main(String[] args) {
/*		String nome = "10-20-30";
		// String nome = "lavosier charles";
		String trocou = sub(nome, "+", "+");

		System.out.println(trocou);
*/
	}

	public static String sub(String str, String v1, String n1) {
		String v = String.valueOf(v1);
		String n = String.valueOf(n1);

		String nova = null;
		String[] sub = str.split(v);
		int i = sub.length;

		if (i == 2) {
			nova = (sub[0] + "" + n + "" + sub[1]);
			return nova;
		} else if (i == 3) {
			nova = (sub[0] + "" + n + "" + sub[1] + "" + n + "" + sub[2]);
			return nova;
		} else if (i == 4) {
			nova = (sub[0] + "" + n + "" + sub[1] + "" + n + "" + sub[2] + "" + n + "" + sub[3]);
			return nova;
		} else if (i == 5) {
			nova = (sub[0] + "" + n + "" + sub[1] + "" + n + "" + sub[2] + "" + n + "" + sub[3] + "" + n + "" + sub[4]);
			return nova;
		} else if (i == 6) {
			nova = (sub[0] + "" + n + "" + sub[1] + "" + n + "" + sub[2] + "" + n + "" + sub[3] + "" + n + "" + sub[4]
					+ "" + n + "" + sub[5]);
			return nova;
		} else if (i == 7) {
			nova = (sub[0] + "" + n + "" + sub[1] + "" + n + "" + sub[2] + "" + n + "" + sub[3] + "" + n + "" + sub[4]
					+ "" + n + "" + sub[5] + "" + n + "" + sub[6]);
			return nova;
		} else if (i == 8) {
			nova = (sub[0] + "" + n + "" + sub[1] + "" + n + "" + sub[2] + "" + n + "" + sub[3] + "" + n + "" + sub[4]
					+ "" + n + "" + sub[5] + "" + n + "" + sub[6] + "" + n + "" + sub[7]);
			return nova;
		} else if (i == 9) {
			nova = (sub[0] + "" + n + "" + sub[1] + "" + n + "" + sub[2] + "" + n + "" + sub[3] + "" + n + "" + sub[4]
					+ "" + n + "" + sub[5] + "" + n + "" + sub[6] + "" + n + "" + sub[7] + "" + n + "" + sub[8]);
			return nova;
		} else if (i == 10) {
			nova = (sub[0] + "" + n + "" + sub[1] + "" + n + "" + sub[2] + "" + n + "" + sub[3] + "" + n + "" + sub[4]
					+ "" + n + "" + sub[5] + "" + n + "" + sub[6] + "" + n + "" + sub[7] + "" + n + "" + sub[8] + "" + n
					+ "" + sub[9]);
			return nova;
		} else {
			return str;
		}

		// return null;
	}

}
