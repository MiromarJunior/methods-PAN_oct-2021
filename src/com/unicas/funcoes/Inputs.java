package com.unicas.funcoes;

import javax.swing.JOptionPane;

public class Inputs {

	public static void main(String[] args) {
		
		
		String nome = JOptionPane.showInputDialog("Qual é seu nome");
		int idade = Integer.parseInt(JOptionPane.showInputDialog("Qual a sua idade"));
		double peso = Double.parseDouble(JOptionPane.showInputDialog("Qual é o seu peso ?"));
		
		
		
		System.out.println("O nome é " + nome);
		System.out.println("Sua idade é " + idade);
		System.out.println("O seu peso é  " + peso);
		
		
		//JOptionPane.showMessageDialog(null,"O nome é "+ nome);
		//JOptionPane.showMessageDialog(null,"Sua idade é " + idade);
	//	JOptionPane.showMessageDialog(null,"O seu peso é  " + peso);
		
	}

}
