package br.com.fiap.beans;

public class Touro extends Mamifero {

	private double tamanhoChifre;

	public Touro() {
		super();
	}

	public Touro(double tamanhoChifre) {
		super();
		this.tamanhoChifre = tamanhoChifre;
	}
	

	public Touro(String nome, int idade, double peso, double tamanhoChifre) {
		super(nome, idade, peso);
		this.tamanhoChifre = tamanhoChifre;
		
	}

	public double getTamanhoChifre() {
		return tamanhoChifre;
	}

	public void setTamanhoChifre(double tamanhoChifre) {
		this.tamanhoChifre = tamanhoChifre;
	}

}
