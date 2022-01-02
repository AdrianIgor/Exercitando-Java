package br.metodos;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* Entendendo M�todos Java
		 * Retornos
		*/

		
		Scanner scan = new Scanner(System.in);
		String nome;
		int base, baseMenor, altura, resposta;
		boolean a = true, a2 = true;

		System.out.println("=================================");
		System.out.println("          Calcular �rea          ");
		System.out.println("=================================");
		System.out.print("Digite o tipo de quadril�tero(Quadrado, Ret�ngulo ou Trap�zio): ");
		while (a == true) {
			nome = scan.next();
			switch (nome) {
			case "Quadrado":
				System.out.print("Digite a altura do Quadrado: ");
				altura = scan.nextInt();
				resposta = area(altura);
				System.out.println("�rea do Quadrado: " + Integer.toString(resposta));
				a = false;
				break;
			case "Ret�ngulo":
				while(a2 == true) {
					System.out.print("Digite a base do Ret�ngulo: ");
					base = scan.nextInt();
					System.out.print("Digite a altura do Ret�ngulo: ");
					altura = scan.nextInt();
					if(base == altura) {
						System.out.println("A base deve ser menor que a altura ou vice-versa.");
					} else {
						resposta = area(base, altura);
						System.out.println("�rea do Ret�ngulo: " + Integer.toString(resposta));
						a = false;
						a2 = false;
					}
				}
				break;
			case "Trap�zio":
				while(a2 == true) {
					System.out.print("Digite a base do Trap�zio: ");
					base = scan.nextInt();
					System.out.print("Digite a base menor do Trap�zio: ");
					baseMenor = scan.nextInt();
					if(baseMenor >= base) {
						System.out.println("A base menor deve ser menor que a base.");
					} else {
						System.out.print("Digite a altura do Trap�zio: ");
						altura = scan.nextInt();
						resposta = area(base, baseMenor, altura);
						System.out.println("�rea do Trap�zio: " + Integer.toString(resposta));
						a = false;
						a2 = false;
					}
				}
				break;
			default:
				System.out.print("Digite um dos tr�s quatril�teros para proceguir com a aplicativo: ");
				break;
			}
		}

	}
	
	
	public static int area(int a) {
		int fim = a*a;
		return fim;
	}
	
	public static int area(int b, int a) {
		int fim = b*a;
		return fim;
	}
	
	public static int area(int b, int bM, int a) {
		int fim = ((bM + b)*a)/2;
		return fim;
	}
	
}
