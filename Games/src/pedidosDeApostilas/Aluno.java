package pedidosDeApostilas;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Aluno {
	static Conexao conexao;

	public Aluno() {
		cadastroPedidoDeApostila();
	}

	public static void main(String[] args) {
		new Aluno();
	}

	public void cadastroPedidoDeApostila() {
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("nome: ");
			String nome = sc.nextLine();

			System.out.println("Codigo ");
			Integer codigo = sc.nextInt();

			Scanner sc2 = new Scanner(System.in);
			System.out.println("apostila: ");
			String apostila = sc2.nextLine();

			conexao = new Conexao();
			conexao.novoPedido(codigo, nome, apostila);
			sc.close();
			sc2.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

	public void cadastroDeApostila() {
		conexao.consultarBanco();

	}

}
