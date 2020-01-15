package br.com.william.sudoku.logica;
import br.com.william.sudoku.logica.Coordenada;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.List;
/**
* @author John William Vicente
*/
public class Logica{
	private String[] tabuleiro;
	public Logica(String[] tabuleiro){
		this.tabuleiro=tabuleiro;
	}
	public void setTabuleiro(String[] tab){
		this.tabuleiro=tab;
	}
	public String[] getTabuleiro(){
		return tabuleiro;
	}
	/***
	*Metodo para devolver true para sudoku preenchido de forma correta
	* e false para senao.
	*
	*/
	public boolean verificaTabuleiro(){
		for(int i=0;i<tabuleiro.length;i++){
			if(!verificaLinha(i))return false;
			if(!verificaColuna(i))return false;
			if(!verificaQuadro(i))return false;
		}
		
		return true;
	}
	public boolean verificaLinha(int linha){
		Set<Character> lista=new HashSet<>();
		for (char a:this.tabuleiro[linha].toCharArray() ) {
			lista.add(a);
		}
		if(lista.size()==tabuleiro[0].length())return true;
		return false;
	}

	public boolean verificaColuna(int coluna){
		if(coluna>=tabuleiro.length)return true;
		Set<Character> lista=new HashSet<>();
		char a;
		for (int i=0;i<tabuleiro.length ;i++ ) {
				a=this.tabuleiro[i].charAt(coluna);
				lista.add(a);
		}
		if(lista.size()==tabuleiro[0].length())return true;
		return false;
	}
	public boolean verificaQuadro(int quad ){

		// System.out.println(quad);
		int[] primeiroTermo={0,3,6};
		//int[] linhas= [0,3,6];
		int linha;
		int begin;
		begin=primeiroTermo[quad%3];
		if(quad==0||quad==1||quad==2)linha=0;
		else if(quad==3||quad==4||quad==5)linha=3;
		else linha=6;
		if(begin>=tabuleiro[0].length())return true;
		Set<Character> lista=new HashSet<>();
		char a;
		int apontador=begin;
		for (int i=1;i<=tabuleiro.length ;i++,apontador++ ) {
			
			a=this.tabuleiro[linha].charAt(apontador);
			lista.add(a);

			// System.out.println(linha+" ap="+apontador+" nº =>"+a);
			if(i%3==0){
				apontador=begin-1;
				linha+=1;
			}
		}
		 // System.out.println("***"+lista.size());
		if(lista.size()==tabuleiro.length)return true;
		return false;
		/*
			0  1   2    3 4  5    6  7  8
			tabuleiro.length 10 11   12 13 14   15 16 17
		   18 1tabuleiro.length 20   21 22 23   24 25 26
 			
 			27			30			33
 			54			57			60
		*/
	}
	
	/***
	*Devolve uma lista de coordenadas de numeros repetidos
	*/


}