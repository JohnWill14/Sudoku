package br.com.com.william.sudoku.logica;
/**
* @author John William Vicente
*/
public class Logica{
	private String[][] tabuleiro;
	public Logica(String[][] tabuleiro){
		this.tabuleiro=tabuleiro;
	}
	public void setTabuleiro(String[][] tab){
		this.tabuleiro=tab;
	}
	public String[][] getTabuleiro(){
		return tabuleiro;
	}
	/***
	*Metodo para devolver true para sudoku preenchido de forma correta
	* e false para senao.
	*
	*/
	/*public boolean verificaTabuleiro(){
		for(int i=0;i<9;i++){
			if(!verificaLinha(i))return false;
			if(!verificaColuna(i))return false;
			if(!verificaQuadro(i))return false;
		}
		if(!verificaDiagonalFirst()&&verificaDiagonalSecond()){
			return false;
		}
		return true;
	}*/

}