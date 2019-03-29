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
		else if (txt.equalsIgnoreCase("russo"))
			path = "./txt/Russian.txt";

		try {
			FileReader arq = new FileReader(path);
			BufferedReader lerArq = new BufferedReader(arq);

			String linha = lerArq.readLine();
			int j = 0;
			
			String[] vetor = new String[Integer.parseInt(linha)];
			int i = 0;
			
			j = Integer.parseInt(linha) ;
			
			j = j  + 1;
			while (linha != null) {

				if (i < vetor.length) {
					vetor[i] = linha;
					System.out.println(linha);
					i++;
				}

				linha = lerArq.readLine() ;

			}

			arq.close();

			return vetor;
		} catch (IOException e) {
			System.err.printf("ERRO NA ABERTURA DO ARQUIVO: %s.\n", e.getMessage());
		}

		return null;
	}

}
