package br.com.fiap.beans;

public class Endereco {

	private String logradouro;
	private String cep;
	private String bairro;
	private int numero;

	public Endereco() {
		super();
	}

	public Endereco(String logradouro, int numero, String bairro, String cep) {
		super();
		this.logradouro = logradouro;
		this.numero = numero;
		this.bairro = bairro;
		this.cep = cep;
		
	}

	public String getLogradouro() {
		return logradouro;
	}

	public String getCep() {
		return cep;
	}

	public String getBairro() {
		return bairro;
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

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

}
