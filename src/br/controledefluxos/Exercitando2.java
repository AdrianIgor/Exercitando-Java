package br.controledefluxos;

public class Exercitando2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* Lógica Condicional e Controle de Fluxos em Java
		 * Operadores Lógicos
		*/
		
		boolean b1 = true, b2 = false, b3 = true, b4 = false;
		int i1 = 5, i2 = 7;
		float f1 = 2.1f, f2 = 1.5f;
		
		System.out.println("b1 && b2: " + (b1 && b2));
		System.out.println("b1 && b3: " + (b1 && b3));
		System.out.println("b2||b3: " + (b2||b3));
		System.out.println("b2||b4: " + (b3||b4));
		System.out.println("b1^b3: " + (b1^b3));
		System.out.println("b4^b1: " + (b4^b1));
		System.out.println("!b1: " + (!b1));
		System.out.println("!b2: " + (!b2));
		
		System.out.println("((i1>i2)||(f2<f1)): " + ((i1>i2)||(f2<f1)));
		System.out.println("((i1+i2)<(f2-f1))&&true: " + (((i1+i2)<(f2-f1))&&true));
	}

}
