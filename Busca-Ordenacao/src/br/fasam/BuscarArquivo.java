package br.fasam;

public class BuscarArquivo {

	public static int buscaSequencial(String[] vetor, String x) {
		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i].equalsIgnoreCase(x))
				return i;
		}
		return -1;
	}

/*	public static int buscaBinaria(String[] array, String palavra) {
		int esq = 0;
		int dir = array.length - 1;
		int valorMeio;
		while (esq <= dir) {
			valorMeio = esq + ((dir - esq) / 2);
			if (array[valorMeio].equalsIgnoreCase(palavra)) {
				esq = valorMeio + 1;
			} else if (array[valorMeio].equalsIgnoreCase(palavra)) {
				dir = valorMeio - 1;
			} else {
				return valorMeio;
			}
		}
		return -1;
	}boolean BuscaBin (int a[], int x )
*/
	
}
