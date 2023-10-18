package br.com.fiap.beans;

public class Humano extends Mamifero {

	private String rg;

	public Humano() {
		super();
	}

	public Humano(String rg) {
		super();
		this.rg = rg;
	}

	public Humano(String nome, int idade, double peso, String rg) {
		super(nome, idade, peso);
		this.rg = rg;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

}
