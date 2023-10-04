package br.com.fiap.beans;

public class Colaborador {

	private String nome;
	private String cargo;
	private double salario;

	// construtor vazio

	public Colaborador() {
		super();
	}

	// construtor cheio

	public Colaborador(String nome, String cargo, double salario) {
		super();
		this.nome = nome;
		this.cargo = cargo;
		this.salario = salario;
	}

	// getters e setters

	public String getNome() {
		return nome;
	}

	public String getCargo() {
		return cargo;
	}

	public double getSalario() {
		return salario;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

}
