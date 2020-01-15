package br.com.william.sudoku.test;

import br.com.william.sudoku.gui.Principal;

public class TestPrincipal{
	public static void main(String[] args) {
		Principal janela=new Principal();
		janela.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
		janela.setVisible(true);
	}
}