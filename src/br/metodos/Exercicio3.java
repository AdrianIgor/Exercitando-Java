package br.metodos;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio3 {	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* Entendendo Métodos Java
		 * Criação
		*/

		
		Scanner scan = new Scanner(System.in);
		int au, bu, taxas, parcelas;
		double valorInicial;
		
		System.out.println("======================================");
		System.out.println("      Valor Total de Empréstimo       ");
		System.out.println("======================================");
		System.out.print("Digite o seu valor de empréstimo: ");
		valorInicial = scan.nextDouble();
		System.out.print("Digite sua taxa: ");
		taxas = scan.nextInt();
		System.out.print("Digite seu tempo de mepréstimo (meses): ");
		parcelas = scan.nextInt();
		valorFinal(valorInicial, taxas, parcelas);
	}
	
	public static void valorFinal(double valor, int taxa, int tempo) {
		DecimalFormat df = new DecimalFormat("0.00"); //Evitar calculos com números de casas grandes
		double calculo1 = valor/tempo;
		String converter = df.format(calculo1);
		double converterTaxa = taxa/100.00;
	    double calculo2 =  valor*converterTaxa;
	    String converter2 = df.format(calculo2);
		double calculo3 = Double.parseDouble(converter) + Double.parseDouble(converter2);
		String converter3 = df.format(calculo3);
		double valorDefinitivo = Double.parseDouble(converter3)*tempo;
		System.out.println("Valor total: " + df.format(valorDefinitivo));
	}

}
