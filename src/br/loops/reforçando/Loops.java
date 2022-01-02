package br.loops.reforçando;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Reforçando o Conceito de Laços em Java
		 * Loops
		*/
		
		int tentativas = 1, limiteTentativas = 3, quantidade = 0, numero;
		int numeros[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		String resposta;
		
		Scanner scan = new Scanner(System.in);
		
		boolean acertou = false;
		
		ArrayList<String> nome = new ArrayList<>();
		nome.add("Eduardo");
		nome.add("Fabio");
		nome.add("Kelly");
		nome.add("Maria");
		nome.add("Fernanda");
		
		
		
		System.out.println("============================");
		System.out.println("            For             ");
		System.out.println("============================");
		System.out.println("Incremento");
		
		for(numero = 1; numero <= 10; numero++) {
			System.out.print(numero + " ");
		}
		
		System.out.println("\nDecremento");
		
		for(numero = 10; numero >= 1; numero--) {
			System.out.print(numero + " ");
		}
		
		System.out.println("\nForeach");
		
		for(int n : numeros) {
			System.out.print(n + " ");
		}
		
		System.out.println("\nIterator");
		
		for(Iterator<String> n = nome.iterator(); n.hasNext();) {
			System.out.print(n.next() + " ");
		}
		
		System.out.println("\n============================");
		System.out.println("           While            ");
		System.out.println("============================");
		System.out.println("Você possui 3 tentativas");
		while(tentativas <= limiteTentativas) {
			if(acertou == true) {
				tentativas = 4;
			} else {
				System.out.println("Tentativa " + tentativas);
				System.out.println("Quantos anos eu tenho?");
				System.out.println("a) 22");
				System.out.println("b) 28");
				System.out.println("c) 30");
				System.out.println("d) 19");
				System.out.println("e) 18");
				resposta = scan.next();
				switch(resposta) {
					case "a":
						System.out.println("Resposta incorreta.");
						tentativas++;
						quantidade++;
						break;
					case "b":
						System.out.println("Resposta incorreta.");
						tentativas++;
						quantidade++;
						break;
					case "c":
						System.out.println("Resposta incorreta.");
						tentativas++;
						quantidade++;
						break;
					case "d":
						System.out.println("Resposta correta.");
						acertou = true;
						quantidade++;
						break;
					case "e":
						System.out.println("Resposta incorreta.");
						tentativas++;
						quantidade++;
						break;
				}
			}
			
		}
		
		System.out.println("Você teve " + quantidade + " tentativa(s).");
		
		System.out.println("============================");
		System.out.println("       While infinito       ");
		System.out.println("============================");
		
		while(true) {
			System.out.print("Olá, Mundo! ");
			System.out.print("Continuar executando?(S/N) ");
			resposta = scan.next();
		}
	}

}
