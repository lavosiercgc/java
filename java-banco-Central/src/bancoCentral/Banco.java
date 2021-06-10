package bancoCentral;

import java.util.Scanner;

public class Banco {

	public static void main(String[] args) {

		Scanner doubleScan = new Scanner(System.in);
		Scanner byteScan = new Scanner(System.in);
		ContaCorrente cc = new ContaCorrente();
		cc.setNumero("24");
		cc.setSaldo(5000.0);

		Byte op = -1;

		while (op != 0) {
			System.out.println("VOCE ESTA NA CONTA: " + cc.getNumero()
					+ "\n1 - CONSULTA SALDO;\n2 - DEBITAR; \n3 - CREDITAR; \n0 - SAIR");

			switch (op = byteScan.nextByte()) {
			case 1:
				System.out.println("O seu saldo �: " + cc.getSaldo());
				break;
			case 2:
				System.out.println("Digite o valor que voce deseja debitar: ");
				Double aux = doubleScan.nextDouble();
				Double valor = cc.getSaldo() - aux;
				if (valor < 0) {
					System.out.println("VOCE N�O POSSUI SALDO SUFICIENTE");
					break;

				} else {
					cc.debitar(aux);
					System.out.println("SEU SALDO ATUAL �: " + cc.getSaldo());
					break;

				}
			case 3:
				System.out.println("Digite o valor que voce deseja creditar: ");
				cc.creditar(doubleScan.nextDouble());
				System.out.println("O seu saldo atual �: " + cc.getSaldo());
			case 0:
				System.out.println("SAINDO");
				break;
			default:
				System.err.println("O QUE DIABOS TU FUMOU PORRA? N�O TEM ESTA OP��O");
				
				byteScan.close();				
				doubleScan.close();

			}
		}

	}

}