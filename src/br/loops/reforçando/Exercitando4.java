package br.loops.reforçando;

public class Exercitando4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Reforçando o Conceito de Laços em Java
		 * Array e Matrizes
		*/
		
		int idades[][] = new int[][] {{12, 35}, {45, 22}};
		
		System.out.println("============================");
		System.out.println("    Matriz com foreach      ");
		System.out.println("============================");
		
		for(int id[] : idades) {
			for(int id2 : id) {
				System.out.println(id2);
			}
		}
		
		System.out.println("============================");
		System.out.println("   Matriz com for duplo     ");
		System.out.println("============================");
		
		for(int i = 0; i < idades.length; i++) {
			int id[] = idades[i];
			for(int j = 0; j < idades[i].length; j++) {
				System.out.println(idades[i][j]);
			}
		}
		
		byte ex1[] = new byte[4];
		ex1[0] = 2;
		ex1[1] = 100;
		ex1[2] = 70;
		ex1[3] = 56;
		
		
		
		float ex2[] = new float[4];
		ex2[0] = 2.5f;
		ex2[1] = 6.5f;
		ex2[2] = 12.4f;
		ex2[3] = 8.9f;
		
		
		System.out.println("======================================");
		System.out.println("  Arrays com outros tipos de dados 1  ");
		System.out.println("======================================");
		
		for(byte b : ex1) {
			System.out.println(b);
		}
		
		System.out.println("======================================");
		System.out.println("  Arrays com outros tipos de dados 2  ");
		System.out.println("======================================");
		
		for(float f : ex2) {
			System.out.println(f);
		}
	}

}
