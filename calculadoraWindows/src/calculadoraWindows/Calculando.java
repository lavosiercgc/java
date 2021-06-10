package calculadoraWindows;

import java.util.Scanner;

public class Calculando {
	Double valor1;
	Double valor2;
	Double calculo;

	public void calculos() {
//BLOCO DE OPÇÕES PARA INICIALIZAÇÃO
		Scanner sc = new Scanner(System.in);
		System.out.println("Diga o que deseja fazer?");
		System.out.println("1 SOMAR");
		System.out.println("2 SUBTRAIR");
		System.out.println("3 MULTIPLICAR");
		System.out.println("4 DIVIDIR");
		System.out.println("0 Sair");
		String fator = sc.nextLine();

//TRATA SE FOR VAZIO OU ZERO
		if (fator.isEmpty()) {
			System.out.println("Busca impropria");
			calculos();
		} else if (fator.equals("0")) {
			sc.close();
			System.exit(0);
		}

// BLOCO DE RECEBIMENTO DOS VALORES
		System.out.println("valor1: ");
		String str1 = sc.nextLine();
		if (str1.isEmpty()) {
			System.out.println("Busca impropria");
			calculos();
		}
		System.out.println("valor2: ");
		String str2 = sc.nextLine();
		if (str2.isEmpty()) {
			System.out.println("Busca impropria");
			calculos();
		}
		valor1 = Double.valueOf(str1);
		valor2 = Double.valueOf(str2);
// BLOCO DE DECISÃO DO FATOR + CALCULO
		if (fator.equals("1")) {
			calculo = valor1 + valor2;
		} else if (fator.equals("2")) {
			calculo = valor1 - valor2;
		} else if (fator.equals("3")) {
			calculo = valor1 * valor2;
		} else if (fator.equals("4")) {
			calculo = valor1 / valor2;
		} else {
			System.out.println("Busca impropria");
		}
		System.out.println(calculo);

		calculos();

	}
}
