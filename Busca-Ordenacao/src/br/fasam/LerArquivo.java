package br.fasam;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LerArquivo {

	public static String[] lerArquivo(String txt) {

		String path = "";

		if (txt.equalsIgnoreCase("frances"))
			path = "./txt/French.txt";
		else if (txt.equalsIgnoreCase("italiano"))
			path = "./txt/Italian.txt";
		else if (txt.equalsIgnoreCase("portugues"))
			path = "./txt/Portuguese (Brazilian).txt";
		else if (txt.equalsIgnoreCase("russo"))
			path = "./txt/Russian.txt";
		else if (txt.equalsIgnoreCase("teste"))
			path = "./txt/teste.txt";

		try {
			FileReader arq = new FileReader(path);
			BufferedReader lerArq = new BufferedReader(arq);

			String linha = lerArq.readLine();

			String[] vetor = new String[Integer.parseInt(linha) - 1];
			int i = 0;

			while (linha != null) {

				if (i < vetor.length) {
					vetor[i] = linha;
					System.out.println(linha);
					i++;
				}

				linha = lerArq.readLine();

			}

			arq.close();

			return vetor;
		} catch (IOException e) {
			System.err.printf("ERRO NA ABERTURA DO ARQUIVO: %s.\n", e.getMessage());
		}

		return null;
	}

}
