package com.unicas.funcoes;

import javax.swing.JOptionPane;

public class Inputs {

	public static void main(String[] args) {
		
		
		String nome = JOptionPane.showInputDialog("Qual ? seu nome");
		int idade = Integer.parseInt(JOptionPane.showInputDialog("Qual a sua idade"));
		double peso = Double.parseDouble(JOptionPane.showInputDialog("Qual ? o seu peso ?"));
		
		
		
		System.out.println("O nome ? " + nome);
		System.out.println("Sua idade ? " + idade);
		System.out.println("O seu peso ?  " + peso);
		
		
		//JOptionPane.showMessageDialog(null,"O nome ? "+ nome);
		//JOptionPane.showMessageDialog(null,"Sua idade ? " + idade);
	//	JOptionPane.showMessageDialog(null,"O seu peso ?  " + peso);
		
	}

}
