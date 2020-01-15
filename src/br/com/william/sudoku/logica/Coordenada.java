package br.com.william.sudoku.logica;

public class Coordenada{
	private int first;
	private int second;
	public Coordenada(int a,int b){
		this.first=a;
		this.second=b;
	}

	public void setFirst(int a){
		this.first=a;
	}
	public int getFirst(){
		return this.first;
	}

	public void setSecond(int b){
		this.second=b;
	}
	public int getSecond(){
		return this.second;
	}
	public boolean equals(Coordenada a){
		if(this.first==a.getFirst()&&this.second==a.getSecond()){
			return true;
		}
		return false;
	}
}