package br.com.william.sudoku.validador;

public class Validador{
	public static boolean isNumber(String a){
		if(a.length()>1)return false;
		try{
			int numero=Integer.parseInt(a);
			if(numero<=0)return false;		
		}catch(java.lang.NumberFormatException e){
			return false;
		}
		return true;
	}
}