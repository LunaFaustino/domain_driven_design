package br.com.fiap.beans;

public class Professor extends Pessoa {

	private double salario;

	public Professor() {
		super();
	}

	public Professor(String nome, int idade, double salario) {
		super(nome, idade);
		this.salario = salario;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

}
