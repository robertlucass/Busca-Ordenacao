package br.fasam;

public class Principal {

	public static void main(String[] args) {

		String vetor[] = LerArquivo.lerArquivo("portugues");

		System.out.println(vetor.length);

		long tempoInicial = System.currentTimeMillis();
		String vetorOrdenado[] = OrdenarArq.mergeSort(vetor, 0, vetor.length - 1);
		long tempoFinal = System.currentTimeMillis();

		long tempo = tempoFinal - tempoInicial;

		System.out.println(vetorOrdenado.length);
		System.out.println("Tempo para ordenar: " + tempo + " ms");
		
		
		String palavra = "abacaxi/B" ;
		BuscarArquivo.buscaBinaria(vetor, palavra );
		
		int posDesordenada = BuscarArquivo.buscaBinaria(vetor, palavra);
		int posOrdenada = BuscarArquivo.buscaBinaria(vetorOrdenado, palavra);
		if(posDesordenada == -1)
		{
			System.out.println(palavra + "NÃO EXISTE");
		}
		else
		{
			System.out.println(palavra + "posição : " + posDesordenada + " no Vetor Desordenado");
			System.out.println(palavra + "posição : " + posOrdenada + " no Vetor Ordenado.");
		}
		
		System.out.println();
	}

}
