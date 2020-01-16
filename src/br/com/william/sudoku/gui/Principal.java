package br.com.william.sudoku.gui;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import br.com.william.sudoku.gui.Tabuleiro;
import br.com.william.sudoku.validador.Validador;
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
	public void escolheCampo(int[] vetor){
		((Tabuleiro) tab).bloqueiaCampo(vetor);
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
		titulo.setFont(new java.awt.Font("Dialog",3,38));

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
	public JButton getChecar(){
		return this.checar;
	}

	public JButton getLimpar(){
		return this.limpar;
	}
	public JTextField[] getTabuleiro(){
		return ((Tabuleiro)this.tab).getCampos();
	}
	public String[] getMatriz() throws java.lang.NumberFormatException{
		int cont=0;
		String[] matriz=new String[9];
		JTextField[] campo= ((Tabuleiro)this.tab).getCampos();	
		for(int i=0;i<9;i++){
			matriz[i]=new String();
			for (int j=0;j<9 ;j++,cont++ ) {
				
				if(Validador.isNumber(campo[cont].getText())){
					matriz[i]+=campo[cont].getText();
				}else{
					throw new  java.lang.NumberFormatException("Valor '"+campo[cont].getText()+"' está incorreto!");

				}
			}
		}
		return matriz;
	}
}