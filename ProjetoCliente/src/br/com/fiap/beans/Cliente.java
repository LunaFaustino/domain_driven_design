package br.com.fiap.beans;

public class Cliente {
	// visibilidade, tipo de dado e variável
	private String nome;
	private String email;
	private int idade;
	private double valorMensalidade;
	
	// setters
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public void setValorMensalidade(double valorMensalidade) {
		this.valorMensalidade = valorMensalidade;
	}
	
	// getters
	public String getNome() {
		return nome;
	}
	public String getEmail() {
		return email;
	}
	public int getIdade() {
		return idade;
	}
	public double getValorMensalidade() {
		return valorMensalidade;
	}

	
	

}
