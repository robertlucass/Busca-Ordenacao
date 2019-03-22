package br.fasam;

import java.io.IOException;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner (System.in);
		
		String [] idioma = ArquivoHandler.Vetor();
		

		for (String obj : idioma ) {
		System.out.println(obj);
			
		}
	
	}
}	
		/*int opc ;
		System.out.println("Escolha qual a ordenação: ");
		System.out.println("Selection Sort = 1 / Bubble Sort = 2 / QuicK Sort = 3 / Insertion Sort = 4");
		
		opc = leia.nextInt();
		
			switch(opc){
			
			case 1:
				
				
				break;
			}
		
			
		


	}

}*/
