package pedidosDeApostilas;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JOptionPane;

import com.mysql.jdbc.PreparedStatement;

public class Conexao {

	String url = "jdbc:mysql://localhost/pedidodeapostilas";

	public Conexao() {
		// novoPedido(5254,"laiza de sousa chaves","PowerPoint avançado");
		// atualizarPedido();
		//consultarBanco();

	}

	public static void main(String[] args) {
		//new Conexao();
	}

	public void consultarBanco() {
		String sql = "SELECT * FROM cadastropedidodeapostila";
		try {
			Connection connection = DriverManager.getConnection(url, "root", "");
			PreparedStatement pesquisa = (PreparedStatement) connection.prepareStatement(sql);
			ResultSet resultado = pesquisa.executeQuery();

			while (resultado.next()) {
				int codigo = resultado.getInt("codigo");
				String nome = resultado.getString("nome");
				String apostila = resultado.getString("apostila");
				System.out.println("Codigo: " + codigo + " Nome: " + nome + " Apostila: " + apostila);
			}
		} catch (Exception e) {

		}

	}

	public void atualizarPedido(String apostila) {
		String sql = "UPDATE cadastropedidodeapostila SET apostila = 'Excel Avançado' WHERE codigo = 5251";
		try {
			Connection connection = DriverManager.getConnection(url, "root", "");
			java.sql.PreparedStatement atualizar = connection.prepareStatement(sql);
			atualizar.execute();
			System.out.println("executado");
		} catch (Exception e) {

		}

	}

	public void novoPedido(int codigo, String nome, String apostila) {
		Date date = new Date();
		SimpleDateFormat formata= new SimpleDateFormat("_dd_MM_yyyy");
		String hoje = String.valueOf(formata.format(date));
		
		
		String sql = "INSERT INTO cadastropedidodeapostila (codigo, nome, apostila) VALUES (" + codigo + ",'" + nome+ "', '"+ apostila +hoje+ "' )";
		
		try {
			Connection connection = DriverManager.getConnection(url, "root", "");
			java.sql.PreparedStatement atualizar = connection.prepareStatement(sql);
			atualizar.execute();
			JOptionPane.showMessageDialog(null, "Executado");
			
		} catch (Exception e) {

		}

	}

	public void deletarPedido(int codigo) {
		String sql = "DELETE FROM cadastropedidodeapostila WHERE codigo = " + codigo;
		try {
			Connection connection = DriverManager.getConnection(url, "root", "");
			java.sql.PreparedStatement atualizar = connection.prepareStatement(sql);
			atualizar.execute();
			System.out.println("executado");
		} catch (Exception e) {

		}

	}

	public void cadastrarAluno(int codigo, String nome) {
		String sql = "INSERT INTO alunos (codigo, nome) VALUES (" + codigo + ",'" + nome + "')";
		try {
			Connection connection = DriverManager.getConnection(url, "root", "");
			java.sql.PreparedStatement atualizar = connection.prepareStatement(sql);
			atualizar.execute();
			System.out.println("executado");
		} catch (Exception e) {

		}

	}

	public void cadastrarApostila(String apostila) {
		String sql = "INSERT INTO apostila (apostila) VALUES ('" + apostila + "')";
		try {
			Connection connection = DriverManager.getConnection(url, "root", "");
			java.sql.PreparedStatement atualizar = connection.prepareStatement(sql);
			atualizar.execute();
			System.out.println("executado");
		} catch (Exception e) {

		}

	}
}
