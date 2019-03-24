package br.fasam;

public class OrdenarArq {

	public static String[] selectionSort(String vetor[]) {
		for (int i = 0; i <= vetor.length - 2; i++) {
			int min = i;
			for (int j = i + 1; j <= vetor.length - 1; j++) {
				if (vetor[j].length() < vetor[min].length()) {
					min = j;
				}
			}

			String t = vetor[min];
			vetor[min] = vetor[i];
			vetor[i] = t;
		}

		return vetor;
	}

	private static void merge(String arr[], int l, int m, int r) {
		int n1 = m - l + 1;
		int n2 = r - m;

		String L[] = new String[n1];
		String R[] = new String[n2];

		for (int i = 0; i < n1; ++i)
			L[i] = arr[l + i];
		for (int j = 0; j < n2; ++j)
			R[j] = arr[m + 1 + j];

		int i = 0, j = 0;

		int k = l;
		while (i < n1 && j < n2) {
			if (L[i].length() <= R[j].length()) {
				arr[k] = L[i];
				i++;
			} else {
				arr[k] = R[j];
				j++;
			}
			k++;
		}

		while (i < n1) {
			arr[k] = L[i];
			i++;
			k++;
		}

		while (j < n2) {
			arr[k] = R[j];
			j++;
			k++;
		}
	}

	public static String[] mergeSort(String arr[], int l, int r) {
		if (l < r) {
			int m = (l + r) / 2;

			mergeSort(arr, l, m);
			mergeSort(arr, m + 1, r);
			merge(arr, l, m, r);
		}

		return arr;
	}

	public static String[] bubbleSort(String v[]) {
		for (int i = v.length; i >= 1; i--) {
			for (int j = 1; j < i; j++) {
				if (v[j - 1].length() > v[j].length()) {
					String aux = v[j];
					v[j] = v[j - 1];
					v[j - 1] = aux;
				}
			}
		}

		return v;
	}

	public String[] quicksort(String v[], int direita, int esquerda) {
		int esq = esquerda;
		int dir = direita;
		String pivo = v[(esq + dir) / 2];
		String troca;

		while (esq <= dir) {
			while (v[esq].compareTo(pivo) < 0) {
				esq = esq + 1;

			}
			while (v[dir].compareTo(pivo) > 0) {
				dir = dir - 1;
			}
			if (esq <= dir) {
				troca = v[esq];
				v[esq] = v[dir];
				v[dir] = troca;
				esq = esq + 1;
				dir = dir + 1;
			}
		}
		if (dir > esquerda) {
			quicksort(v, esquerda, dir);
		}
		if (esq < direita) {
			quicksort(v, esq, direita);
		}
		return v;

	}

	public static String[] insertionSort(String[] array) {
		for (int i = 1; i < array.length; i++) {
			String a = array[i];
			int j;
			for (j = i - 1; j >= 0 && array[j].compareTo(a) > 0; j--) {
				array[j + 1] = array[j];
				array[j].compareTo(a);
			}
		}
		return array;
	}

}
