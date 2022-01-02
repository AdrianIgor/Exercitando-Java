package br.loops;

import java.util.Random;

public class Matriz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Estruturas de Repetição e Arrays em Java
		
		int contador, contador2;
		int matriz[][] = new int[4][4];
		Random random = new Random();
		
		System.out.println("============================");
		System.out.println("           Matriz           ");
		System.out.println("============================");
		for(contador = 0; contador < matriz.length; contador++) {
			for(contador2 = 0; contador2 < matriz[contador].length; contador2++) {
				matriz[contador] [contador2] = random.nextInt(9);
				System.out.print(matriz[contador] [contador2] + " ");
			}
			System.out.println("");
		}
	}

}
