package com.packTeste;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class LerArquivo {
	Movendo m= new Movendo();

	public static void main(String[] args) {

		Path caminho = Paths.get("c:/ArrayList.txt");
		try {
			byte[] texto = Files.readAllBytes(caminho);
			String leitura = new String(texto);
			//System.out.println(leitura);
			String [] coordenadas = leitura.split("_");
			int c = coordenadas.length;
			for(int i = 1; i < c; i++){
				System.out.println(coordenadas[i]);
				try{Thread.sleep(500);}catch(Exception e){}
			}
			
		} catch (Exception err) {
			System.out.println(err.getMessage());
		}

		/*
		 * Path caminho = Paths.get("c:/ArrayList.txt"); String texto =
		 * "vamos ver se agora ele escreve sem apagar o antigo"; byte[]
		 * textEmByte = texto.getBytes(); try { Files.write(caminho, textEmByte,
		 * StandardOpenOption.APPEND);
		 * 
		 * } catch (Exception e) {
		 * 
		 * }
		 */

	}

	public void lendoEmArquivo() {
		Path caminho = Paths.get("c:/ArrayList.txt");
		try {
			byte[] texto = Files.readAllBytes(caminho);
			String leitura = new String(texto);
			System.out.println(leitura);
		} catch (Exception err) {
			System.out.println(err.getMessage());
		}
		
	}
	public void lendoCoordenadas() {
		Path caminho = Paths.get("c:/ArrayList.txt");
		try {
			byte[] texto = Files.readAllBytes(caminho);
			String leitura = new String(texto);
			String [] coordenadas = leitura.split("_");
			int c = coordenadas.length;
			
			for(int i = 2; i < c; i++){
				Integer x = Integer.valueOf(coordenadas[i]);
				//Integer y = Integer.valueOf(coordenadas[i]);
				
				m.lcirculo1.setBounds(x, 0, 150, 150);
				try{Thread.sleep(20);}catch(Exception e){}
			}
			
		} catch (Exception err) {
			System.out.println(err.getMessage());
		}
	}
	public void EscrevendoEmArquivo(String texto) {
		Path caminho = Paths.get("c:/ArrayList.txt");
		byte[] textEmByte = texto.getBytes();
		try {
			Files.write(caminho, textEmByte, StandardOpenOption.APPEND);

		} catch (Exception e) {

		}
	}

}
