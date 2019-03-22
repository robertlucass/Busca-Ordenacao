package br.fasam;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.LineNumberReader;
import java.io.PrintWriter;

public class ArquivoHandler {
	

	public static String nome;
	static int i=0;
	
	public static int quantidadeLinhas() {
		
		String arquivoLeitura = "./arquivos/English.txt";
		LineNumberReader linhaLeitura = null;
		try {
			linhaLeitura = new LineNumberReader(new FileReader(arquivoLeitura));
			
		}catch(FileNotFoundException e2) {
			e2.printStackTrace();
		}
		try {
			linhaLeitura.skip(arquivoLeitura.length());
		}catch(IOException e1) {
			e1.printStackTrace();
		}
		int qtdLinha = linhaLeitura.getLineNumber();
		try {
			linhaLeitura.close();
		}catch (IOException e) {
			e.printStackTrace();
		}
		
		return qtdLinha + 1;
	}

	public static String[] Vetor() {
		
		String lista[] = new String[quantidadeLinhas()];
		int i = 0;
		
		nome = "./arquivos/English.txt";
		
		try {
			FileReader arq = new FileReader(nome);
			BufferedReader Lerarq = new BufferedReader(arq);
			String linha = Lerarq.readLine();
			int tam = Integer.parseInt(linha);
			String[] vt = new String[tam + 1];
			
			while (linha != null) {
				vt[i] = linha;
				//System.out.println(linha);
				linha = Lerarq.readLine();
				i++;

			}
			
			arq.close();
			
		}catch (IOException e) {
			e.printStackTrace();
		}
		
		return lista;
	}
	
	public void Escrever() throws IOException{
		int i = 0;
		String Palavras[] = Ordenacao.Palavras();
		int Numeros[] = Ordenacao.Numeros();
		FileWriter arq = new FileWriter("./arquivos/English.txt");
		@SuppressWarnings("resource")
		PrintWriter gravarArq = new PrintWriter(arq);
		
		while (i<quantidadeLinhas()) {
			gravarArq.printf(Palavras[i]);
			gravarArq.printf("%d", Numeros[i]);
			gravarArq.println();
			
			i++;
		}
		
	}

}
