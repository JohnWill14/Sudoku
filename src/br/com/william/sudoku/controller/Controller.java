package br.com.william.sudoku.controller;

import br.com.william.sudoku.gui.Principal; 
import br.com.william.sudoku.logica.Logica; 
import  br.com.william.sudoku.logica.Arrays;
import javax.swing.JTextField;
public class Controller{
	private Principal janela;
	private Logica log;
	
	public Controller(){
		janela=new Principal();
		preencheCampo();
		janela.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
		log=new Logica();
		janela.getChecar().addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                print();
            }
        });
        janela.getLimpar().addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpar();
            }
        });
	}

	public void start(){
		janela.setVisible(true);
	}
	public void print(){

		try{
			String[] test=janela.getMatriz();
			
				
			log.setTabuleiro(test);
			if(log.verificaTabuleiro()){
				javax.swing.JOptionPane.showMessageDialog(null,"Parabéns seu jogo está correto");
			}else{
				javax.swing.JOptionPane.showMessageDialog(null,"Desculpe há algo de errado no seu jogo !!!");
			}
		}catch(java.lang.NumberFormatException e){
			javax.swing.JOptionPane.showMessageDialog(null,e.getMessage());
		}
	}
	public void limpar(){
		 JTextField[] campos= janela.getTabuleiro();
		 for(JTextField i:campos){
		 	i.setText("");
		 	i.setEnabled(true);
		 }
		 preencheCampo();
		//janela=new Principal();
	}
	public void preencheCampo(){
		janela.escolheCampo(Arrays.sorteiaArray());

	}

}