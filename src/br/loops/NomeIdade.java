package br.loops;

import java.util.Scanner;

public class NomeIdade {
	public static void main(String[] args) {
		
		//Estruturas de Repetição e Arrays em Java
		
		Scanner scan = new Scanner(System.in);
		int matricula, altura, escolha = 1;
		System.out.println("==========================");
		System.out.println("          Alunos          ");
		System.out.println("==========================");
		while(escolha != 0) {
			System.out.print("Digite a matrícula do aluno: ");
			matricula = scan.nextInt();
			System.out.print("Digite a altura do aluno (em cm): ");
			altura = scan.nextInt();
			System.out.print("Digite 0 para sair ou qualquer número para continuar: ");
			escolha = scan.nextInt();
			if(escolha == 0) 
				System.out.println("Obrigado por usar o aplicativo!");
			else
				System.out.println("==========================");
		}
	}
}
