package com.unicas.funcoes;

import javax.swing.JOptionPane;

public class MaiorMenorIdade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int idade = Integer.parseInt(JOptionPane.showInputDialog("Informe sua idade"));
		
		if(idade < 18 ) {
			System.out.println("Menor de idade");
			System.out.println("ano que vem será maior ");
		}else {
			System.out.println("Maior");
			JOptionPane.showMessageDialog(null,"Maior");
		}

	}

}
