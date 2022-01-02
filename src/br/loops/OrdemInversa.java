package br.loops;

import java.util.Scanner;

public class OrdemInversa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Estruturas de Repetição e Arrays em Java
		
		int contador;
		int numeros[] = new int[5];
		Scanner scan = new Scanner(System.in);
		
		System.out.println("============================");
		System.out.println("        Ordem Inversa       ");
		System.out.println("============================");
		
		for(contador = 0; contador < 5; contador++) {
			System.out.print("Digite um número: ");
			numeros[contador] = scan.nextInt();
		}
		
		System.out.println("Ordem Inversa");
		
		for(contador = 4; contador >= 0; contador--) {
			System.out.println(numeros[contador]);
		}
	}

}
