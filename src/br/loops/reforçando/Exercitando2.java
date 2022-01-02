package br.loops.reforçando;

public class Exercitando2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Reforçando o Conceito de Laços em Java
		 * Interruptores
		*/
		
		for(int contador = 1; contador <= 14; contador++) {
			
			if((contador%2) == 0) {
				System.out.print(contador + " ");
			} else {
				continue;
			}
			
			if(contador == 12) {
				break;
			}
		}
		
	}

}
