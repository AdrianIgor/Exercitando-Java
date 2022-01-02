package br.loops;

import java.util.Random;

public class Aleatorio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Estruturas de Repetição e Arrays em Java
		
		int contador;
		int num[] = new int[20];
		Random random = new Random();
		
		System.out.println("============================");
		System.out.println("         Aleatório          ");
		System.out.println("============================");
		for(contador = 0; contador < num.length; contador++) {
			num[contador] = random.nextInt(100);
			System.out.print(num[contador] + " ");
		}
		
		System.out.println("\nSucessores");
		
		for(contador = 0; contador < num.length; contador++) {
			System.out.print((num[contador]+1) + " ");
		}
	}

}
