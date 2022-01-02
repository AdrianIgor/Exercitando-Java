package br.controledefluxos;

import java.util.Scanner;

public class Exercitando4 {

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
        
        switch(resposta) {
        	case 1:
        			mes = "Janeiro";
            		System.out.println("Estamos no mês de " + mes);
            		System.out.println("Férias!");
            		break;
        	case 2:
        			mes = "Fevereiro";
            		System.out.println("Estamos no mês de " + mes);
            		break;
        	case 3:
        			mes = "Março";
            		System.out.println("Estamos no mês de " + mes);
            		break;
        	case 4:
        			mes = "Abril";
            		System.out.println("Estamos no mês de " + mes);
            		break;
        	case 5:
        			mes = "Maio";
            		System.out.println("Estamos no mês de " + mes);
            		break;
        	case 6:
        			mes = "Junho";
            		System.out.println("Estamos no mês de " + mes);
            		break;
        	case 7:
        			mes = "Julho";
            		System.out.println("Estamos no mês de " + mes);
            		System.out.println("Férias!");
            		break;
        	case 8:
        			mes = "Agosto";
            		System.out.println("Estamos no mês de " + mes);
            		break;
        	case 9:
        			mes = "Setembro";
            		System.out.println("Estamos no mês de " + mes);
            		break;
        	case 10:
        			mes = "Outubro";
            		System.out.println("Estamos no mês de " + mes);
            		break;
        	case 11:
        			mes = "Novembro";
            		System.out.println("Estamos no mês de " + mes);
            		break;
        	case 12:
        			mes = "Dezembro";
            		System.out.println("Estamos no mês de " + mes);
            		System.out.println("Férias!");
            		break;
        	default:
        			System.out.println("Número inválido");
        			break;
        }
	}

}
