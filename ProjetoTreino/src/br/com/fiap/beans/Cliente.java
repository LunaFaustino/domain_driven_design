package br.com.fiap.beans;

public class Cliente {
	// visibilidade, tipo de dado e variavel
	
	private String nome;
	private String cpf;
	private int idade;
	private double valor;
	private Endereco endereco;
	
	// setters
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	// getters
	
	public String getNome() {
		return nome;
	}
	public String getCpf() {
		return cpf;
	}
	public int getIdade() {
		return idade;
	}
	public double getValor() {
		return valor;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	
	

}
