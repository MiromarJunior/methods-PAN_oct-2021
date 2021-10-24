package com.unicas.funcoes;

public class Funcao5 {

	
	static int myMethods(int x, int y) {
		return x + y;
	}
	
	static int myMethods2(int y) {
		return y++;
	}
	public static void main(String[] args) {
		
		int z = myMethods(5, 3);
		System.out.println(z);

	}

}
