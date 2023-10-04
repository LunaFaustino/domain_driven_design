package br.com.fiap.beans;

public class Aluno {
	private int rm;
	private String nome;
	private String turma;
	private double nota;
	private Endereco endereco;

	// metodo Construtor Vazio

	public Aluno() {
		super();
	}

	// metodo Construtor Cheio

	public Aluno(int rm, String nome, String turma, double nota) {
		super();
		this.rm = rm;
		this.nome = nome;
		this.turma = turma;
		this.nota = nota;
	}

	// getters e setters

	public int getRm() {
		return rm;
	}

	public String getNome() {
		return nome;
	}

	public String getTurma() {
		return turma;
	}

	public double getNota() {
		return nota;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setRm(int rm) {
		this.rm = rm;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setTurma(String turma) {
		this.turma = turma;
	}

	public void setNota(double nota) {
		this.nota = nota;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

}
