package br.com.bytebank.banco.teste;

public class Teste {

	public static void main(String[] args) {
		
		int[] idades = new int[5];
		
		for(int i = 0; i < idades.length; i++) {
			idades[i] = i * i;
		}
		
		for(int i = 0; i < idades.length; i++) {
			System.out.println(idades[i]);
		}
		
//		int[]idades = new int[5];
//		
//		idades[0] = 29;
//		idades[1] = 39;
//		idades[2] = 19;
//		idades[3] = 59;
//		idades[4] = 69;
//		
//		int idade4 = idades[4];
//		
//		System.out.println(idade4);
//		
//		System.out.println(idades.length);
		
	}

}
