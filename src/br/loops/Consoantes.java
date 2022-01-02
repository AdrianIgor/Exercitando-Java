package br.loops;

import java.util.Scanner;

public class Consoantes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Estruturas de Repetição e Arrays em Java
		
		int contador, consoantes = 0;
		String resposta;
		String cons[] = new String[6];
		Scanner scan = new Scanner(System.in);
		
		System.out.println("============================");
		System.out.println("         Consoantes         ");
		System.out.println("============================");
		
		for(contador = 0; contador < cons.length; contador++) {
			System.out.print("Digite um caractere: ");
			resposta = scan.next();
			if(!(resposta.equalsIgnoreCase("a")
				|| resposta.equalsIgnoreCase("e") 
				|| resposta.equalsIgnoreCase("i") 
				|| resposta.equalsIgnoreCase("o") 
				|| resposta.equalsIgnoreCase("u"))) {
					cons[contador] = resposta;
					consoantes++;
			}
		}
		
		for(String c : cons) {
			if(c != null) {
				System.out.print(c + " ");
			} 
			
		}
		
		System.out.println("Total de consoantes: " + consoantes);
	}

}
