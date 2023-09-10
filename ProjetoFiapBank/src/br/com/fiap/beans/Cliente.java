package br.com.fiap.beans;

public class Cliente {
	// visibilidade, tipo de dado, variável
	private String nome;
	private String cpf;
	private Endereco endereco;
	
	// setters
	
	public void setName(String name) {
		this.nome = name;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	// getters
	
	public String getName() {
		return nome;
	}
	public String getCpf() {
		return cpf;
	}
	public Endereco getEndereco() {
		return endereco;
	}


	

}
