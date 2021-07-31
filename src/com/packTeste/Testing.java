package com.packTeste;

import java.io.FileInputStream;
import java.io.FileReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Testing {
	public Testing() {
		run();
	}

	public static void main(String[] args) {
		new Testing();

	}

	public void run() {

		try {
			String file = "C:\\VLC\\sdk\\include\\vlc\\plugins\\vlc_dialog.h";
			Path caminho = Paths.get(file);
			try {
				byte[] texto = Files.readAllBytes(caminho);
				String leitura = new String(texto);
				System.out.println(leitura);
				String[] coordenadas = leitura.split("_");
				int c = coordenadas.length;
				for (int i = 1; i < c; i++) {
					System.out.println(coordenadas[i]);
					try {
						Thread.sleep(100);
					} catch (Exception e) {
					}
				}

			} catch (Exception err) {
				System.out.println(err.getMessage());
			}
		} catch (Exception e) {
		}
	}

}
