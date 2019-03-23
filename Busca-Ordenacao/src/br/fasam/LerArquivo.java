package br.fasam;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LerArquivo {
	
	public static String[] lerArquivo(String dic) {

		String path = "";

		if (dic.equalsIgnoreCase("ingles"))
			path = "./arquivos/English";
		else if (dic.equalsIgnoreCase("espanhol"))
			path = "C:\\Users\\Casas Bahia\\Desktop\\idiomas";
		else if(dic.equalsIgnoreCase("portugues"))
			path = "C:\\Users\\Casas Bahia\\Desktop\\idiomas";

		try {
			FileReader arq = new FileReader(path); 
			BufferedReader lerArq = new BufferedReader(arq);

			String linha = lerArq.readLine(); 
			

			String[] vetor = new String[Integer.parseInt(linha)];
			int i = 0;
			while (linha != null) {

				if (i < vetor.length) {
					vetor[i] = linha;
					i++;
				}
				
				linha = lerArq.readLine();

			}

			arq.close();

			return vetor;
		} catch (IOException e) {
			System.err.printf("Erro na abertura do arquivo: %s.\n", e.getMessage());
		}

		return null;
	}

}
