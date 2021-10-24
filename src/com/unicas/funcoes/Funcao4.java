package com.unicas.funcoes;

public class Funcao4 {

	
	static int myMethods(int x) {
		return ++x;
	}
	
	static int myMethods2(int y) {
		return y++;
	}
	public static void main(String[] args) {
		System.out.println(myMethods(3));
		System.out.println(myMethods2(3));
	

	}

}
