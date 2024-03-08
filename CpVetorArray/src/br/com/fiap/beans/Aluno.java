package br.com.fiap.beans;

public class Aluno {
	
	// visibilidade, tipo de dado, variável
	private int rm;
	private String nome;
	private String turma;
	private double nota;
	
	// construtor vazio
	public Aluno() {
		super();
	}
	
	// construtor cheio
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
	
	
}
