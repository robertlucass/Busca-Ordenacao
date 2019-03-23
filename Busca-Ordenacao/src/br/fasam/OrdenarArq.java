package br.fasam;

public class OrdenarArq {


	public static String[] selectionSort(String vetor[])
	{
		for (int i = 0; i <= vetor.length - 2 ; i++) {
			int min = i;
			for(int j = i + 1 ; j <= vetor.length - 1 ; j++)
			{
				if(vetor[j].length() < vetor[min].length())
				{
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

	}


