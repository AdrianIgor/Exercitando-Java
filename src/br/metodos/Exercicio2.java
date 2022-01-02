package br.metodos;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* Entendendo Métodos Java
		 * Criação
		*/

		
		Scanner scan = new Scanner(System.in);
		int horas, minutos;
		
		System.out.println("============================");
		System.out.println("      Horas e Minutos       ");
		System.out.println("============================");
		System.out.print("Que horas são (em horas)? ");
		horas = scan.nextInt();
		System.out.print("Que horas são (em minutos)? ");
		minutos = scan.nextInt();
		System.out.println(saudacao(horas, minutos));
	}
	
	public static String saudacao(int horas, int minutos) {
		String saudacao = "";
		System.out.println(horas + ":" + minutos);
		if(minutos < 0 || minutos > 59) {
			System.out.println("Horas ou minutos inválidos!");
		}else if(horas >= 5 && horas < 12) {
			saudacao = "Bom dia!";
		} else if(horas >= 12 && horas < 20) {
			saudacao = "Boa tarde!";
		} else if((horas >=20 && horas < 24)||(horas >= 00 && horas < 5)) {
			saudacao = "Boa noite!";
		} else {
			System.out.println("Horas ou minutos inválidos!");
		}
		return saudacao;
	}

}
