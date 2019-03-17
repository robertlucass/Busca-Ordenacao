package br.fasam;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class ArquivoHandler {
	public static void main(String[] args) {
	
	try {
		   BufferedReader leitor = new BufferedReader(
		   new FileReader("./arquivos/English.txt"));
		   String linha = leitor.readLine();
		   while ((linha = leitor.readLine()) != null){ 
                
		      System.out.println(linha);
		      linha = leitor.readLine();
		   }			   
		  
		} catch (FileNotFoundException exemple) {
		   System.out.println("Erro " + exemple);
		} catch (IOException exemple) {
		   System.out.println("Erro " + exemple);
		}
}
}


		


