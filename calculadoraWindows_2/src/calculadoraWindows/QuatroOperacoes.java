package calculadoraWindows;

public class QuatroOperacoes {

	public double valor1;
	public double valor2;
	public double calculo;

	public double somar(double valor1, double valor2) {
		calculo = (valor1 + valor2);

		return calculo;

	}

	public double subtrair(double valor1, double valor2) {

		calculo = (valor1 - valor2);

		return calculo;

	}

	public double multiplicar(double valor1, double valor2) {

		calculo = (valor1 * valor2);

		return calculo;

	}

	public double dividir(double valor1, double valor2) {

		calculo = (valor1 / valor2);

		return calculo;

	}

	public double percent(double valor1, double valor2) {
		calculo = (valor1 * valor2) / 100;

		return calculo;

	}

}
