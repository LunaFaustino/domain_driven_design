package br.com.fiap.beans;

public class Endereco {
	
	// visibilidade, tipo de dado e variavel
	
	private String logradouro;
	private String cep;
	private int numero;
	private String complemento;
	private String bairro;
	private String municipio;
	private String estado;
	
	// setters
	
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public void setMunicipio(String municipio) {
		this.municipio = municipio;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	// getters
	
	public String getLogradouro() {
		return logradouro;
	}
	public String getCep() {
		return cep;
	}
	public int getNumero() {
		return numero;
	}
	public String getComplemento() {
		return complemento;
	}
	public String getBairro() {
		return bairro;
	}
	public String getMunicipio() {
		return municipio;
	}
	public String getEstado() {
		return estado;
	}

}
