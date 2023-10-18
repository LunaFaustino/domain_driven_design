package br.com.fiap.beans;

public class Mamifero {

	private String nome;
	private int idade;
	private double peso;

	public Mamifero() {
		super();
	}

	public Mamifero(String nome, int idade, double peso) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.peso = peso;
	}

	public String getNome() {
		return nome;
	}

	public int getIdade() {
		return idade;
	}

	public double getPeso() {
		return peso;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

}
