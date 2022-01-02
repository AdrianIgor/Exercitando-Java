package br.loops.reforçando;

public class Breaks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Reforçando o Conceito de Laços em Java
		 * Interruptores
		*/
		
		int contador = 0, contador2 = 0;
		int numeros[] = {1, 2, 3, 4, 5};
		int numeros2[][] = {{1, 2, 3, 4, 5}, {1, 2, 3, 4, 5}};
		
		System.out.println("Break em while");
		
		while(contador <= 5) {
			System.out.print(numeros[contador] + " ");
			if(numeros[contador] == 3) {
				break;
			}
			contador++;
		}
		
		System.out.println("\nBreak em for");
		
		for(contador = 0; contador <= 5; contador++) {
			System.out.print(numeros[contador] + " ");
			if(numeros[contador] == 4) {
				break;
			}
		}
		
		System.out.println("\nBreak em for duplo");
		
		for(contador = 0; contador < numeros2.length; contador++) {
			for(contador2 = 0; contador2 < numeros2[contador].length; contador2++) {
				System.out.print(numeros2[contador] [contador2] + " ");
				if(numeros2[contador] [contador2] == 3) {
					break;
				}
			}
		}
		
		System.out.println("\nBreak em do/while");
		
		do {
			System.out.print(numeros[contador] + " ");
			if(numeros[contador] == 3) {
				break;
			}
			contador++;
		}
		while(contador <= 5);
		
		System.out.println("\nBreak em for duplo com out");
		
		out:
			for(contador = 0; contador < numeros2.length; contador++) {
				for(contador2 = 0; contador2 < numeros2[contador].length; contador2++) {
					System.out.print(numeros2[contador] [contador2] + " ");
					if(numeros2[contador] [contador2] == 3) {
						break out;
					}
				}
			}
		
		System.out.println("\nContinua...");
	}

}
