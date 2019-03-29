package br.fasam;

public class Principal {

	public static void main(String[] args) {

		String vetor[] = LerArquivo.lerArquivo("frances");

		System.out.println(vetor.length);

		long tempoInicial = System.currentTimeMillis();
		String vetorOrdenado[] = OrdenarArq.insertionSort(vetor);
		long tempoFinal = System.currentTimeMillis();
		
		printArray(vetorOrdenado);
			
		long tempo = tempoFinal - tempoInicial;

		System.out.println(vetorOrdenado.toString() + "\n");
		System.out.println("Tempo para ordenar: " + tempo + " ms");
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
		}*/

	}

	static void printArray(String arr[]) 
    { 
        int n = arr.length; 
        for (int i=0; i<n; ++i) 
            System.out.println(arr[i] + " /////// tamanho: " + arr[i].length()); 
        System.out.println(); 
    } 


}
