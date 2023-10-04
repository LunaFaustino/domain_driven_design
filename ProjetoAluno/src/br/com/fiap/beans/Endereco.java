package br.com.fiap.beans;

public class Endereco {
	private String logradouro;
	private String cep;
	private int numero;

	// construtor vazio

	public Endereco() {
		super();
	}

	// construtor cheio

	public Endereco(String logradouro, String cep, int numero) {
		super();
		this.logradouro = logradouro;
		this.cep = cep;
		this.numero = numero;
	}

	// getter e setter

	public String getLogradouro() {
		return logradouro;
	}

	public String getCep() {
		return cep;
	}

	public int getNumero() {
		return numero;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

}
