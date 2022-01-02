package br.loops.reforçando;

public class Exercitando {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Reforçando o Conceito de Laços em Java
		 * Loops
		*/
		
		int contador;
		boolean b1 = false;
		
		for(contador = 3; contador < 12; contador += 2) {
			
			if(contador == 7) {
				continue;
			}
			
			System.out.print(contador + " ");
		}
		
		System.out.println("");
		
		contador = 0;
		while(contador <= 5) {
			System.out.println("Não existe um caminho para a felicidade. A felicidade é o caminho.");
			
			if(contador == 2) {
				b1 = true;
			}
			
			if(b1 == true) {
				System.out.println("Feliz 2022!");
			}
			
			contador++;
		}
	}

}
