package br.controledefluxos;

import java.util.Scanner;

public class Exercitando3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* Lógica Condicional e Controle de Fluxos em Java
		 * Controle de Fluxos
		*/
		
		Scanner scan = new Scanner(System.in);
		String mes = null;
		int resposta;
		
        System.out.println("===========================");
        System.out.println("        NOME DO MÊS        ");
        System.out.println("===========================");
        
        System.out.print("Digite o numero do mês: ");
        resposta = scan.nextInt();
        
        if(resposta == 1) {
        	mes = "Janeiro";
        	System.out.println("Estamos no mês de " + mes);
        } else if(resposta == 2) {
        	mes = "Fevereiro";
        	System.out.println("Estamos no mês de " + mes);
        } else if(resposta == 3) {
        	mes = "Março";
        	System.out.println("Estamos no mês de " + mes);
        } else if(resposta == 4) {
        	mes = "Abril";
        	System.out.println("Estamos no mês de " + mes);
        } else if(resposta == 5) {
        	mes = "Maio";
        	System.out.println("Estamos no mês de " + mes);
        } else if(resposta == 6) {
        	mes = "Junho";
        	System.out.println("Estamos no mês de " + mes);
        } else if(resposta == 7) {
        	mes = "Julho";
        	System.out.println("Estamos no mês de " + mes);
        } else if(resposta == 8) {
        	mes = "Agosto";
        	System.out.println("Estamos no mês de " + mes);
        } else if(resposta == 9) {
        	mes = "Setembro";
        	System.out.println("Estamos no mês de " + mes);
        } else if(resposta == 10) {
        	mes = "Outubro";
        	System.out.println("Estamos no mês de " + mes);
        } else if(resposta == 11) {
        	mes = "Novembro";
        	System.out.println("Estamos no mês de " + mes);
        } else if(resposta == 12) {
        	mes = "Dezembro";
        	System.out.println("Estamos no mês de " + mes);
        } else {
        	System.out.println("Número inválido");
        }
        
        
        if((mes == "Janeiro"||mes == "Julho")||mes == "Dezembro")
        	System.out.println("Férias!");
        
	}

}
