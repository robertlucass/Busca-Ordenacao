/*package br.fasam;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		String procura = "";
		
		int cod_ordenacao, codigo, x;
		
		double fim_nano, fim_milles, inicio_nano, inicio_milles;
		
		do {
			
			String French[] 			=   LerArquivo.lerArquivo("Frances");
			String Italian[] 			= 	LerArquivo.lerArquivo(".Italiano");
			String Portugues[]			= 	LerArquivo.lerArquivo(".Portugues");
			String Frutas[] 			=   LerArquivo.lerArquivo("Frutas");
			String VetorEscolhido[] 	= 	{};
			
			System.out.println("\n------- Escolha um dicionario -------"
											 +"\n1 - Frances"
											 +"\n2 - Italian"
											 +"\n3 - Portugues"
											 );
			
			x = extrair().nextInt();
	
			 if (x == 1) {
				VetorEscolhido = French;
			} 
			else if (x == 2) {
				VetorEscolhido = Italian;
			} 
			else if (x == 3) {
				VetorEscolhido = Portugues;
			}
			
			if (x < 0 || x > 3) {
				do {
					System.out.println("***** Código errado, escolha o idiomas. *****"
				+							"\n\n=============== Dicionarios =============== "
															 +"\n1 - Frances"
															 +"\n2 - Italian"
															 +"\n3 - Portugues"
															 +"\n4 - Frutas");
					x = extrair().nextInt();
					
					if (x == 1) {
						VetorEscolhido = French;
					} 
					else if (x == 2) {
						VetorEscolhido = Italian;
					} 
					else if (x == 3) {
						VetorEscolhido = Portugues;
					}
					else if (x == 4) {
						VetorEscolhido = Frutas;
					} 
				} while (x < 0 || x > 3);
			}
	
			do {						
				System.out.println("---------------- Escolha o método de ordenação ----------------"
														
														+ "\n1 - MergeSort"
														+ "\n2 - BubbleSort"
														+ "\n3 - InsertionSort"
														+ "\n4 - SelectionSort");
				cod_ordenacao = extrair().nextInt();
				inicio_nano = System.nanoTime();
				inicio_milles = System.currentTimeMillis();
	
				/*if (cod_ordenacao == 1) {
					System.out.println("AGUARDE!!!");
					OrdenarArq.quicksort(VetorEscolhido, VetorEscolhido.length - 1, VetorEscolhido.length - 1);
				} 
				if (cod_ordenacao == 1) {
					System.out.println("AGUARDE!!!");
					OrdenarArq.mergeSort(VetorEscolhido, 0, VetorEscolhido.length - 1);
				} 
				else if (cod_ordenacao == 2) {
					System.out.println("AGUARDE!!!");
					OrdenarArq.bubbleSort(VetorEscolhido);
				} 
				else if (cod_ordenacao == 3) {
					System.out.println("AGUARDE!!!");
					OrdenarArq.insertionSort(VetorEscolhido);
				} 
				else if (cod_ordenacao == 4) {
					System.out.println("AGUARDE!!!");
					OrdenarArq.selectionSort(VetorEscolhido);
				} 
				else {
					System.out.println("\n****** Código inválido ******");
				}
				
				fim_nano = System.nanoTime();
				fim_milles = System.currentTimeMillis();
	
			} while (cod_ordenacao > 5 || cod_ordenacao < 1);
			
			for (String pl : VetorEscolhido) {
				System.out.println(pl);
			}
			
			printArray(French);
			printArray(Italian);
			printArray(Portugues);
			printArray(Frutas);
				
	
			//System.out.println(French.toString() + "\n");
			
			System.out.println("\nTempo em Nanosegundos: " + (fim_nano - inicio_nano));
			System.out.println("\nTempo em Milissegundos: " + (fim_milles - inicio_milles));
			System.out.println("\nTempo em Segundos: " + (fim_nano - inicio_nano) / 1000000000);
			
			
	/*
			String palavra = "Ð°Ð±Ð°Ð»Ð¸Ñ…Ð¸Ð½/33";
			BuscarArquivo.buscaBinaria(vetor, palavra);
	
			int posDesordenada = BuscarArquivo.buscaSequencial(vetor, palavra);
			int posOrdenada = BuscarArquivo.buscaBinaria(vetorOrdenado, palavra);
			if (posDesordenada == -1) {
				System.out.println(palavra + " NÃO EXISTE");
			} else {
				System.out.println(palavra + "posição : " + posDesordenada + " no Vetor Desordenado");
				System.out.println(palavra + "posição : " + posOrdenada + " no Vetor Ordenado.");
			}
	

			
			System.out.println("\nTempo em Milissegundos: " + (fim_milles - inicio_milles));
			System.out.println("\nTempo em Nanosegundos: " + (fim_nano - inicio_nano));
			
			System.out.println("\nTempo em Segundos: " + (fim_nano - inicio_nano) / 1000000000);
	
			do {
				System.out.println("\n---------------- Deseja escolher outro dicionário? ----------------"
															   + "\n1 - Sim"
															   + "\n2 - Não");
				codigo = extrair().nextInt();
				
				if(codigo != 1 && codigo != 2) {
					System.out.println("****** Código inválido ******");
					}
				
			} while (codigo != 1 && codigo != 2);
			
		} while (codigo == 1);

	System.out.println("\nSAINDO!!!");
}

private static Scanner extrair() {
	return new Scanner(System.in);
}

static void printArray(String arr[]) 
{ 
    int n = arr.length; 
    for (int i=0; i<n; ++i) 
        System.out.println(arr[i] + " /////// tamanho: " + arr[i].length()); 
    System.out.println(); 
} 
}

*/
package br.fasam;

public class Principal {

	public static void main(String[] args) {

		String vetor[] = LerArquivo.lerArquivo("teste");

		System.out.println(vetor.length);

		long tempoInicial = System.currentTimeMillis();
		
		String vetorOrdenado[] = OrdenarArq.insertionSort(vetor);
		
		long tempoFinal = System.currentTimeMillis();
		
		printArray(vetorOrdenado);
			
		long tempo = tempoFinal - tempoInicial;

		System.out.println(vetorOrdenado.length + "\n");
		System.out.println("Tempo para ordenar: " + tempo + " ms");

		String palavra = "jararacuÃ§u-cabeÃ§a-de-sapo";
		//BuscarArquivo.buscaBinaria(vetor, palavra);

		int posDesordenada = BuscarArquivo.buscaBinaria(vetor, palavra);
		int posOrdenada = BuscarArquivo.buscaBinaria(vetorOrdenado, palavra);
		
		if (posDesordenada == -1) {
			System.out.println(palavra + " NÃO EXISTE");
		} else {
			System.out.println(palavra + " posição : " + posDesordenada + " no Vetor Desordenado");
			System.out.println(palavra + " posição : " + posOrdenada + " no Vetor Ordenado.");
		}

	}

	static void printArray(String arr[]) 
    { 
        int n = arr.length; 
        for (int i=0; i<n; ++i) 
            System.out.println(arr[i] + " /////// tamanho: " + arr[i].length()); 
        System.out.println(); 
    } 


}