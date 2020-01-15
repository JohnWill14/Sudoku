package br.com.william.sudoku.gui;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import br.com.william.sudoku.gui.Tabuleiro;
public class Principal extends javax.swing.JFrame{
	private JButton checar;
	private JButton limpar;
	private JPanel tab;
	public Principal(){
		super("Sudoku");
		this.setLayout(new BorderLayout());
		this.setResizable(false);
		initComponent();

		this.setSize(410,490);
	}
	public void initComponent(){
		barra();
		centro();
		botoes();
		return;
	}
	public void barra(){
		JPanel barra=new JPanel();
		JPanel painelLeft=new JPanel();

		JLabel titulo=new JLabel("Sudoku");
		titulo.setFont(new java.awt.Font("Dialog",2,23));

		FlowLayout layoutL=(FlowLayout) painelLeft.getLayout();
		layoutL.setAlignment(FlowLayout.LEFT);
		painelLeft.add(titulo);

		barra.add(painelLeft);
		this.add(barra,BorderLayout.NORTH);
	}
	public void centro(){
		tab=new Tabuleiro();
		add(tab,BorderLayout.CENTER);
	}
	public void botoes(){
		JPanel painel=new JPanel();
		checar=new JButton("Checar");
		limpar=new JButton("Limpar");
		//customização
		checar.setBackground(java.awt.Color.green);
		limpar.setBackground(java.awt.Color.red);
		checar.setForeground(java.awt.Color.white);
		limpar.setForeground(java.awt.Color.white);

		checar.setFont(new java.awt.Font("Dialog",3,18));
		limpar.setFont(new java.awt.Font("Dialog",3,18));
		
		painel.setBorder(javax.swing.BorderFactory.createEtchedBorder());
		painel.add(limpar);
		painel.add(checar);
		
		this.add(painel,BorderLayout.SOUTH);
	}

}