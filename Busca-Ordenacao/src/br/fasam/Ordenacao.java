package br.fasam;

public class Ordenacao {
	
	//teste2

	static int aux = 0;
	static String auxp;
	static int i=0;
	static int qtdLinhas = ArquivoHandler.quantidadeLinhas();
	public static String vetor[] = ArquivoHandler.Vetor();
	public static String palavras[] = new String[qtdLinhas];
	public static int numeros[] = new int [qtdLinhas];
	
	public static void Separar() {
		while (i< qtdLinhas) {
			palavras[i]=vetor[i];
			
			numeros[i] = vetor[i].length();
		}
	}
	
/**********************************************************************/
	
/*=========================inicio Bubble Sort=========================*/	
	public static void BubbleSort() {
		Separar();
		long tempoinicio = System.currentTimeMillis();
		
		for(i = 0; i < qtdLinhas-1; i++) {
			for(int j = 0; j < qtdLinhas - 2; i++) {
				if(numeros[j] > numeros[j + 1]) {
					aux = numeros[j];
					numeros[j] = numeros [j + 1];
					numeros[j + 1] = aux;
					auxp = palavras[j];
					palavras[j] = palavras[j+1];
					palavras[j+1] = auxp;
				}
			}
		}
		
		long tempofim = System.currentTimeMillis();
		long tempototal = (tempofim - tempoinicio);
		System.out.printf("Tempo gasto na ordenação: %d"+ tempototal);
		
	}
/*=========================Final Bubble Sort==========================*/
	
/**********************************************************************/
	
/*========================Inicio Selection Sort=======================*/
	public static void SelectionSort() {
		Separar();
		int i, j;
		int min, temp;
		String temp2;
		
		long tempoinicio = System.currentTimeMillis();
		
		for(i = 0; i < qtdLinhas; i++) {
			min = i;
			
			for(j = i+1;j < qtdLinhas; j++) {
				min = j;
			}
			temp = numeros[i];
			numeros[i] = numeros[min];
			numeros[min] = temp;
			temp2 = palavras[i];
			palavras[i] = palavras[min];
			palavras[min] = temp2;
		}
	
		long tempofim = System.currentTimeMillis();
		long tempototal = (tempofim - tempoinicio);
		System.out.printf("Tempo gasto na ordenação: %d"+ tempototal);
	
	}
/*========================Final Selection Sort========================*/
	
/**********************************************************************/
	
/*=========================inicio Quick Sort==========================*/	
	
	public static void QuickSort() {
		Separar();
		
		long tempoinicio = System.currentTimeMillis();
		
		QuickSort(numeros, 0, qtdLinhas);
		long tempofim = System.currentTimeMillis();
		long tempototal = (tempofim - tempoinicio);
		System.out.printf("Tempo gasto na ordenação: %d"+ tempototal);
	}
	
	private static void QuickSort(int vetor[], int inicio, int fim) {
		if(inicio < fim) {
			int posicaoPivo = separar(vetor, inicio, fim);
			QuickSort(vetor, inicio, posicaoPivo - 1);
			QuickSort(vetor, posicaoPivo - 1, fim);
		}
		
	}
	
/*=========================Final Bubble Sort==========================*/
	
/**********************************************************************/	
	
/*========================inicio Insertion Sort=======================*/
	public static void InsertionSort() {
		Separar();
		long tempoinicio = System.currentTimeMillis();
		
		for(i = 0; i <numeros.length; i++) {
			int a = numeros[i];
			String b = palavras[i];
			
			for(int j = i - 1; j >= 0 && numeros[j] > a; j--) {
				numeros[j +1] = numeros[j];
				numeros[j] = a;
				palavras[j +1] = palavras[j];
				palavras[j] = b;
			}
		}
		
		
		long tempofim = System.currentTimeMillis();
		long tempototal = (tempofim - tempoinicio);
		System.out.printf("Tempo gasto na ordenação: %d"+ tempototal);
		
	}
/*========================Final Insertion Sort========================*/
	
/**********************************************************************/


	private static int separar(int[] vetor, int inicio, int fim) {
		int pivo = vetor[inicio];
		int i = inicio + 1, f = fim;
		
		while (i <= f) {
			if(vetor[i] <= pivo)
				i++;
			else if( pivo < vetor[f])
				f++;
			else {
				int troca = vetor[i];
				vetor[i] = vetor[f];
				vetor[f] = troca;
				
				String trocapalavra = palavras[i];
				palavras[i] = palavras[f];
				palavras[f] = trocapalavra;
				
				i++;
				f--;
			}
		}
		
		vetor[inicio] = vetor[f];
		vetor[f] = pivo;		
		return f;
	}
	public static String[] Palavras() {
		return palavras;
	}
	public static int[] Numeros() {
		return numeros;
	}	
}