package br.fasam;

public class BuscarArquivo {
	
	
	public static int buscaSequencial(String[] vetor, String x)
	{
		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i].equalsIgnoreCase(x))
				return i;
		}
		return -1;
	}

}


