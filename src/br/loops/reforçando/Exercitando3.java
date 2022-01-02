package br.loops.reforçando;

public class Exercitando3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Reforçando o Conceito de Laços em Java
		 * Array e Matrizes
		*/
		
		int idades[] = new int[10];
		idades[0] = 23;
		idades[1] = 18;
		idades[2] = 6;
		idades[3] = 55;
		idades[4] = 43;
		idades[5] = 8;
		idades[6] = 60;
		idades[7] = 10;
		idades[8] = 34;
		idades[9] = 27;
		
		int[] i = {10, 25};
		int[] k = new int[] {1, 2, 3};
		int[] j = new int[2];
		
		System.out.println("");
		System.out.println("========================");
		System.out.println("         Arrays         ");
		System.out.println("========================");
		
		for(int idade : idades) {
			System.out.println(idade);
			if(idade >= 18) {
				System.out.println("Maior de idade!");
			} else {
				System.out.println("Menor de idade!");
			}
		}
		
		System.out.println("");
		System.out.println("=========================");
		System.out.println("         Arrays2         ");
		System.out.println("=========================");
		for(int contador = 0; contador < idades.length; contador++) {
			int idade = idades[contador];
			System.out.println(idade);
			if(idade >= 18) {
				System.out.println("Maior de idade!");
			} else {
				System.out.println("Menor de idade!");
			}
		}
	}

}
