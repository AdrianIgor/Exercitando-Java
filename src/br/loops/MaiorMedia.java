package br.loops;

import java.util.Scanner;

public class MaiorMedia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Estruturas de Repeti��o e Arrays em Java
		
		int contador = 1, n1, maior = 0;
		double media = 0;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("=========================");
		System.out.println("      Maior e M�dia      ");
		System.out.println("=========================");
		
		do {
			System.out.print("Digite um n�mero inteiro: ");
			n1 = scan.nextInt();
			media += n1;
			if(n1 > maior) {
				maior = n1;
			}
			contador++;
		}
		while(contador<6);
		
		media /= 5;
		System.out.println("Maior n�mero: " + maior);
		System.out.println("M�dia: " + media);
	}

}
