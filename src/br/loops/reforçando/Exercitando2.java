package br.loops.refor�ando;

public class Exercitando2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Refor�ando o Conceito de La�os em Java
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
