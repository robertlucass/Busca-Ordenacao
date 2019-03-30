package br.fasam;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class Saida {

	public static void metodoPorScan(String[] arquivo) {

		try {
			@SuppressWarnings("resource")
			PrintStream ps = new PrintStream("./saida/saída.txt");
			String linha = "";
			ps.print("Palavra --> TAMANHO \n");

			for (int i = 0; i < arquivo.length; i++) {
				linha = arquivo[i] + " --> " + arquivo[i].length() + "\n";
				ps.print(linha);
			}

		} catch (FileNotFoundException e) {

			e.printStackTrace();
		}
	}
}