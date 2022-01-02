package br.loops.reforçando;

public class Continues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Reforçando o Conceito de Laços em Java
		 * Interruptores
		*/
		
		int contador = 0, contador2 = 0;
		int numeros[] = {1, 2, 3, 4, 5};
		int numeros2[][] = {{1, 2, 3, 4, 5}, {1, 2, 3, 4, 5}};
		int continuar = 0;
		
		System.out.println("Continue em while");
		
		while(contador <= 5) {
			System.out.print(numeros[contador] + " ");
			if(numeros[contador] == 3) {
				continuar++;
				if(continuar == 3) {
					break;
				} else {
					continue;
				}
			}
			contador++;
		}
		
		System.out.println("\nContinue em for");
		continuar = 0;
		
		for(contador = 0; contador < 5; contador++) {
			System.out.print(numeros[contador] + " ");
			if(numeros[contador] == 4) {
				continuar++;
				if(continuar == 3) {
					break;
				} else {
					continue;
				}
			}
		}
		
		System.out.println("\nContinue em for duplo");
		continuar = 0;
		
		for(contador = 0; contador < numeros2.length; contador++) {
			for(contador2 = 0; contador2 < numeros2[contador].length; contador2++) {
				System.out.print(numeros2[contador] [contador2] + " ");
				if(numeros2[contador] [contador2] == 3) {
					continuar++;
					if(continuar == 3) {
						break;
					} else {
						continue;
					}
					
				}
			}
		}
		
		System.out.println("\nContinue em do/while");
		continuar = 0;
		contador = 0;
		contador2 = 0;
		
		do {
			System.out.print(numeros[contador] + " ");
			if(numeros[contador] == 3) {
				continuar++;
				if(continuar == 3) {
					break;
				} else {
					continue;
				}
				
			}
			contador++;
		}
		while(contador <= 5);
		
		System.out.println("\nContinue em for duplo com out");
		continuar = 0;
		
		out:
			for(contador = 0; contador < numeros2.length; contador++) {
				for(contador2 = 0; contador2 < numeros2[contador].length; contador2++) {
					System.out.print(numeros2[contador] [contador2] + " ");
					if(numeros2[contador] [contador2] == 3) {
						continuar++;
						if(continuar == 3) {
							break out;
						} else {
							continue out;
						}
					}
				}
			}
		
		System.out.println("\nContinua...");
	}
}

