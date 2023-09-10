package br.com.fiap.beans;

public class Endereco {
	// visibilidade, tipo de dado e variavel
	private String logradouro;
	private int numero;
	private String cep;
	private String bairro;
	private String municipio;
	private String cidade;
	private String nacionalidade;
	
	// setters
	
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public void setMunicipio(String municipio) {
		this.municipio = municipio;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}
	
	// getters
	
	public String getLogradouro() {
		return logradouro;
	}
	public int getNumero() {
		return numero;
	}
	public String getCep() {
		return cep;
	}
	public String getBairro() {
		return bairro;
	}
	public String getMunicipio() {
		return municipio;
	}
	public String getCidade() {
		return cidade;
	}
	public String getNacionalidade() {
		return nacionalidade;
	}

	
	

}
