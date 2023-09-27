package br.com.fiap.beans;

public class Endereco {
	
	// visibilidade, tipo de dado  e variavel
	
	private String lougradouro;
	private String cep;
	private int numero;


	// setters
	
	public void setLougradouro(String lougradouro) {
		this.lougradouro = lougradouro;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	// getters
	
	public String getLougradouro() {
		return lougradouro;
	}
	public String getCep() {
		return cep;
	}
	public int getNumero() {
		return numero;
	}
	
}
