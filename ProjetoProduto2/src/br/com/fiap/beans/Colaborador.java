package br.com.fiap.beans;

public class Colaborador {
	private String nome;
	private double salario;
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public String getNome() {
		return nome;
	}
	public double getSalario() {
		return salario;
	}
	
	// metodo get que vai exibir resultado de mais de um atributo
	public String getTudoColaborador() {
		return "\nNome do colaborador: " + nome + "\nSalário: " + salario;
		
	}
	
	// if else
	public String pagarTaxa() {
		String informacao = null;
		if (salario > 22000) {
			informacao = "Paga taxa";
		}else {
			informacao = "Não paga taxa";
		}
		
		
		return informacao;
	}

	

}
