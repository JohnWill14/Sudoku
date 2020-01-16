package br.com.william.sudoku.gui;

import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.GridLayout;

public class Tabuleiro extends JPanel{
	private JTextField[] campos;
	private JPanel[] quadros;
	public Tabuleiro(){
		super();
		quadros=new JPanel[9];
		campos=new JTextField[81];
		// setLayout(new GridLayout());
		initComponents();
	}
	public void initComponents(){
		for(int i=0;i<9;i++){
			quadros[i]=new JPanel();
			// quadros[i].setBackground(java.awt.Color.green);
			quadros[i].setPreferredSize(new java.awt.Dimension(110, 110));
			add(quadros[i]); 
			// 0  1  2| 3  4  5 | 6  7  8
			// 9 10 11|12 13 14 |15 16 17
			//18 19 20|21 22 23 |24 25 26
			//27       30        33
			//54       57        60
			//					 69
			//					 78 79 80
		}
			int[] inicio={0,3,6,27,30,33,54,57,60};
			//campos=new JTextField[81];
			for(int i=0;i<inicio.length;i++){
				for(int j=inicio[i];j<inicio[i]+21;j+=9){
					campos[j]=new JTextField();
					campos[j+1]=new JTextField();
					campos[j+2]=new JTextField();

					campos[j].setPreferredSize(new java.awt.Dimension(30,30));;
					campos[j+1].setPreferredSize(new java.awt.Dimension(30,30));;
					campos[j+2].setPreferredSize(new java.awt.Dimension(30,30));;
					
					campos[j].setHorizontalAlignment(javax.swing.JTextField.CENTER);
					campos[j+1].setHorizontalAlignment(javax.swing.JTextField.CENTER);
					campos[j+2].setHorizontalAlignment(javax.swing.JTextField.CENTER);

					quadros[i].add(campos[j]);
					quadros[i].add(campos[j+1]);
					quadros[i].add(campos[j+2]);
				}
			}	
		

	}
	public void bloqueiaCampo(int[] vetor){
		for(int i=0;i<vetor.length;i++){
			int id=(int)(Math.random()*81);
			campos[id].setText(vetor[i]+"");
			campos[id].setEnabled(false);
		}
	}
	public JTextField[] getCampos(){
		return this.campos;
	}
}