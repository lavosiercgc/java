package calculadoraWindows;

public class Calculadora {

	public static void main(String[] args) {
		QuatroOperacoes qo = new QuatroOperacoes();
		qo.calculo(0);
		String str = "800*10";
		
//===================================================
		try {
			String str1 = String.valueOf(str);

			char[] operadores = { '+', '-', '/', '*' };
			char operadorSelecionado = 0;
			

			String valor = str1;
			String y = "";

			// Qual a operação ?
			for (int i = 0; i < operadores.length; i++) {
				if (valor.indexOf(operadores[i]) != -1) {
					operadorSelecionado = operadores[i];
					break;
				}
			}

			String parte1 = valor.substring(0, valor.indexOf(operadorSelecionado));
			String parte2 = valor.substring(valor.indexOf(operadorSelecionado) + 1);

			switch (operadorSelecionado) {
			case '+':
				y = String.valueOf(Double.parseDouble(parte1) + Double.parseDouble(parte2)/100);
				break;
			case '-':
				y = String.valueOf(Double.parseDouble(parte1) - Double.parseDouble(parte2)/100);
				break;
			case '/':
				y = String.valueOf(Double.parseDouble(parte1) / Double.parseDouble(parte2)/100);
				break;
			case '*':
				y = String.valueOf(Double.parseDouble(parte1) * Double.parseDouble(parte2)/100);
				break;
			default:
				System.out.println("Operador desconhecido");
				break;

			}
			
			System.out.println(y);
			
			

		} catch (Exception ex) {
			ex.printStackTrace();
		}
//===================================================
		
	}
}
