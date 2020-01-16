package br.com.william.sudoku.logica;


public class Arrays{
	private static int[][] matriz={
		{1,2,3,4,5,6,7,8,9},
		{2,3,1,6,4,5,9,8,7},
		{2,1,3,5,8,9,6,4,7}
	};
	public static int[] sorteiaArray(){
		return matriz[(int)(Math.random()*matriz.length)];
	}
}