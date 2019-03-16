package br.fasam;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Busca {
	public static void main(String[] args) {
	
		String nome = null;
		int i=0;
		Scanner leia = new Scanner(System.in);
		String palav = leia.nextLine();
		leia.close();
		palav = palav + " " + palav.length()+ " ";
		@SuppressWarnings("unused")
		String aquivoLeitura = "./arquivos/English.txt";
		
		try {
			FileReader Arq = new FileReader(nome);
			BufferedReader Lerarq = new BufferedReader(Arq);
			while(i<ArquivoHandler.quantidadeLinhas()) {
				if(Lerarq.readLine().equals(palav)) {
					System.out.println("Linha: %d"+ i+1);
			}
				
			i++;
				
			}
			Arq.close();
			
			
		}catch (IOException e) {
			e.printStackTrace();
		}
	
	}
}