package br.loops;

import java.util.Scanner;

public class ParImpar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Estruturas de Repeti��o e Arrays em Java
		
		int contador = 1, n1, par = 0, impar = 0;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("=========================");
		System.out.println("       Par ou �mpar      ");
		System.out.println("=========================");
		
		do {
			System.out.print("Digite um n�mero inteiro: ");
			n1 = scan.nextInt();
			if(n1%2 == 0) {
				par++;
			} else {
				impar++;
			}
			contador++;
		}
		while(contador<11);
		
		System.out.println("Quantidade de pares: " + par);
		System.out.println("Quantidade de �mpares: " + impar);
	}

}
