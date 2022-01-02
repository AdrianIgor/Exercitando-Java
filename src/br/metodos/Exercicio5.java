package br.metodos;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* Entendendo Métodos Java
		 * Retornos
		*/

		
		Scanner scan = new Scanner(System.in);
		String nome;
		int base, baseMenor, altura, resposta;
		boolean a = true, a2 = true;

		System.out.println("=================================");
		System.out.println("          Calcular Área          ");
		System.out.println("=================================");
		System.out.print("Digite o tipo de quadrilátero(Quadrado, Retângulo ou Trapézio): ");
		while (a == true) {
			nome = scan.next();
			switch (nome) {
			case "Quadrado":
				System.out.print("Digite a altura do Quadrado: ");
				altura = scan.nextInt();
				resposta = area(altura);
				System.out.println("Área do Quadrado: " + Integer.toString(resposta));
				a = false;
				break;
			case "Retângulo":
				while(a2 == true) {
					System.out.print("Digite a base do Retângulo: ");
					base = scan.nextInt();
					System.out.print("Digite a altura do Retângulo: ");
					altura = scan.nextInt();
					if(base == altura) {
						System.out.println("A base deve ser menor que a altura ou vice-versa.");
					} else {
						resposta = area(base, altura);
						System.out.println("Área do Retângulo: " + Integer.toString(resposta));
						a = false;
						a2 = false;
					}
				}
				break;
			case "Trapézio":
				while(a2 == true) {
					System.out.print("Digite a base do Trapézio: ");
					base = scan.nextInt();
					System.out.print("Digite a base menor do Trapézio: ");
					baseMenor = scan.nextInt();
					if(baseMenor >= base) {
						System.out.println("A base menor deve ser menor que a base.");
					} else {
						System.out.print("Digite a altura do Trapézio: ");
						altura = scan.nextInt();
						resposta = area(base, baseMenor, altura);
						System.out.println("Área do Trapézio: " + Integer.toString(resposta));
						a = false;
						a2 = false;
					}
				}
				break;
			default:
				System.out.print("Digite um dos três quatriláteros para proceguir com a aplicativo: ");
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
