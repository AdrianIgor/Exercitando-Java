package br.exercitando;

public class Variaveis4 {

	/* Variáveis, Tipos de Dados e Operadores Matemáticos
	 * Conversões(casting)
	*/
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long l;
		int i;
		double d;
		float f;
		
		l = 100;
		i = 10;
		d = 10.5d;
		f = 10.5f;
		
		System.out.println("");
		System.out.println("l = " + l);
		System.out.println("i = " + i);
		System.out.println("d = " + d);
		System.out.println("f = " + f);
		
		l = i;
		i = (int) l;
		d = f;
		f = (float) d;
		
		System.out.println("");
		System.out.println("l = i : " + l);
		System.out.println("i = (int) l : " + i);
		System.out.println("d = f : " + d);
		System.out.println("f = (float) d : " + f);
		
		i = (int) f;
		
		System.out.println("");
		System.out.println("i = (int) f : " + i);
		
	}

}
