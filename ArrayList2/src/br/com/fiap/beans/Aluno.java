package br.com.fiap.beans;

public class Aluno extends Pessoa {

	private int rm;

	public Aluno() {
		super();
	}

	public Aluno(String nome, int idade, int rm) {
		super(nome, idade);
		this.rm = rm;
	}

	public int getRm() {
		return rm;
	}

	public void setRm(int rm) {
		this.rm = rm;
	}

}
