package calculadoraWindows;

import java.util.Scanner;

public class Calculos {

	public static void main(String[] args) throws InterruptedException {

		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("valor a multiplicar:");

			String str1 = sc.nextLine();
			String str2 = sc.nextLine();
			String str3 = sc.nextLine();

			Double valor1 = Double.valueOf(str1);
			Double valor2 = Double.valueOf(str3);
			QuatroOperacoes qo = new QuatroOperacoes();
			if (str2.equals("+")) {
				qo.somar(valor1, valor2);
			} else if (str2.equals("-")) {
				qo.subtrair(valor1, valor2);
			} else if (str2.equals("*")) {
				qo.multiplicar(valor1, valor2);
			} else if (str2.equals("/")) {
				qo.dividir(valor1, valor2);
			}

			// qo.multiplicar(valor1, valor2);
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}

	}

}
