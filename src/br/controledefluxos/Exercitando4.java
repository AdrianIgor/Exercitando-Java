package br.controledefluxos;

import java.util.Scanner;

public class Exercitando4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* L�gica Condicional e Controle de Fluxos em Java
		 * Controle de Fluxos
		*/
		
		Scanner scan = new Scanner(System.in);
		String mes = null;
		int resposta;
		
        System.out.println("===========================");
        System.out.println("        NOME DO M�S        ");
        System.out.println("===========================");
        
        System.out.print("Digite o numero do m�s: ");
        resposta = scan.nextInt();
        
        switch(resposta) {
        	case 1:
        			mes = "Janeiro";
            		System.out.println("Estamos no m�s de " + mes);
            		System.out.println("F�rias!");
            		break;
        	case 2:
        			mes = "Fevereiro";
            		System.out.println("Estamos no m�s de " + mes);
            		break;
        	case 3:
        			mes = "Mar�o";
            		System.out.println("Estamos no m�s de " + mes);
            		break;
        	case 4:
        			mes = "Abril";
            		System.out.println("Estamos no m�s de " + mes);
            		break;
        	case 5:
        			mes = "Maio";
            		System.out.println("Estamos no m�s de " + mes);
            		break;
        	case 6:
        			mes = "Junho";
            		System.out.println("Estamos no m�s de " + mes);
            		break;
        	case 7:
        			mes = "Julho";
            		System.out.println("Estamos no m�s de " + mes);
            		System.out.println("F�rias!");
            		break;
        	case 8:
        			mes = "Agosto";
            		System.out.println("Estamos no m�s de " + mes);
            		break;
        	case 9:
        			mes = "Setembro";
            		System.out.println("Estamos no m�s de " + mes);
            		break;
        	case 10:
        			mes = "Outubro";
            		System.out.println("Estamos no m�s de " + mes);
            		break;
        	case 11:
        			mes = "Novembro";
            		System.out.println("Estamos no m�s de " + mes);
            		break;
        	case 12:
        			mes = "Dezembro";
            		System.out.println("Estamos no m�s de " + mes);
            		System.out.println("F�rias!");
            		break;
        	default:
        			System.out.println("N�mero inv�lido");
        			break;
        }
	}

}
