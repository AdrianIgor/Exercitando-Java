package br.loops;

import java.util.Scanner;

public class Tabuada {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Estruturas de Repetição e Arrays em Java
		
		int contador, n1;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("=========================");
		System.out.println("         Tabuada         ");
		System.out.println("=========================");
		
		System.out.print("Digite o número que deseja fazer tabuada: ");
		n1 = scan.nextInt();
		System.out.println("Tabuada");
		for(contador = 1; contador < 11; contador++) {
			System.out.println(n1 + " X " + contador + " = " + (n1*contador));
		}
	}

}
