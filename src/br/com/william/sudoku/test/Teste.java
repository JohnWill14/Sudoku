package br.com.william.sudoku.test;
import  br.com.william.sudoku.logica.Coordenada;
import  br.com.william.sudoku.logica.Logica;
import java.util.Scanner;
public class Teste{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String[] tab=new String[9];
		for (int i=0;i<9 ;i++ ) {
			tab[i]=sc.next();
		//	System.out.println(tab[i]);
		}
		Logica log=new Logica(tab);
		System.out.println(log.verificaTabuleiro());
		while(sc.hasNext()){
			for (int i=0;i<9 ;i++ ) {
				tab[i]=sc.next();
				//	System.out.println(tab[i]);
			}
			log.setTabuleiro(tab);
			System.out.println(log.verificaTabuleiro());
		}
	}
}