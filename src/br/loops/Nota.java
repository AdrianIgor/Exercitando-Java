package br.loops;

import java.util.Scanner;

public class Nota {
	public static void main(String[] args) {
		
		//Estruturas de Repetição e Arrays em Java
		
		int nota;
		boolean b1 = true;
		Scanner scan = new Scanner(System.in);
		while(b1 == true) {
			System.out.println("=========================");
			System.out.println("          Notas          ");
			System.out.println("=========================");
			System.out.print("Digite a nota do aluno: ");
			nota = scan.nextInt();
			System.out.println(nota);
			if(nota < 0 || nota > 10) 
				System.out.println("Você deve digitar a nota entre 0 e 10");
			else
				b1 = false;
		}
	}
}
