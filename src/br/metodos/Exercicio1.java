package br.metodos;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* Entendendo Métodos Java
		 * Criação
		*/

		
		System.out.println("===================================");
		System.out.println("      Operadores Aritméticos       ");
		System.out.println("===================================");
		Scanner scan = new Scanner(System.in);
		int a, b;
		
		System.out.print("Digite um número: ");
		a = scan.nextInt();
		System.out.print("Digite outro número: ");
		b = scan.nextInt();
		
		System.out.println("Soma: " + soma(a, b));
		System.out.println("Subtração: " + subtracao(a, b));
		System.out.println("Multiplicação: " + multiplicacao(a, b));
		System.out.println("Divisão: " + divisao(a, b));
		System.out.print("Pressione entre para continuar:");
		scan.next();
		
		
		
		
	}
	
	public static int soma(int valor, int valor2) {
		int valorFinal = valor+valor2;
		return valorFinal;
	}
	
	public static int subtracao(int valor, int valor2) {
		int valorFinal = valor-valor2;
		return valorFinal;
	}
	
	public static int multiplicacao(int valor, int valor2) {
		int valorFinal = valor*valor2;
		return valorFinal;
	}
	
	public static double divisao(int valor, int valor2) {
		double valorFinal = valor/valor2;
		return valorFinal;
	}
	
}
