package br.fasam;

public class Principal {
	
	public static void main(String[] args) {
		
		
String vetor[] = LerArquivo.lerArquivo("Ingles");
		
		System.out.println(vetor.length);
		
		long tempoInicial = System.currentTimeMillis(); 
		String vetorOrdenado[] = OrdenarArq.mergeSort(vetor, 0, vetor.length-1);
		long tempoFinal = System.currentTimeMillis(); 
		
		long tempo = tempoFinal - tempoInicial;
		
		
		System.out.println(vetorOrdenado);
		System.out.println("Tempo para ordenar: " + tempo + " ms");
	}
	
	

}
