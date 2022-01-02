package br.loops;

import java.util.Scanner;

public class Fatorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Estruturas de Repetição e Arrays em Java
		
		int contador, n1, fatorial = 1;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("=========================");
		System.out.println("         Tabuada         ");
		System.out.println("=========================");
		
		System.out.print("Digite o número que deseja fazer fatorial: ");
		n1 = scan.nextInt();
		
		System.out.println(n1 + "!");
		
		for(contador = n1; contador >= 1; contador--) {
			System.out.print(contador + " ");
			fatorial *= contador;
		}
		
		System.out.println("= " + fatorial);
	}

}
