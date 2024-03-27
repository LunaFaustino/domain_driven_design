package br.com.salesfoce.beans;

public class Endereco {
	
	private String cep;
	private String pais;
	private String ufEstadoProvincia;
	private String cidade;
	private String logradouro;
	private int numPredioCasa;
	
	public Endereco() {
		super();
	}
	
	public Endereco(String cep, String pais, String ufEstadoProvincia, String cidade, String logradouro,
			int numPredioCasa) {
		super();
		this.cep = cep;
		this.pais = pais;
		this.ufEstadoProvincia = ufEstadoProvincia;
		this.cidade = cidade;
		this.logradouro = logradouro;
		this.numPredioCasa = numPredioCasa;
	}
	
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
	public String getUfEstadoProvincia() {
		return ufEstadoProvincia;
	}
	public void setUfEstadoProvincia(String ufEstadoProvincia) {
		this.ufEstadoProvincia = ufEstadoProvincia;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getLogradouro() {
		return logradouro;
	}
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}
	public int getNumPredioCasa() {
		return numPredioCasa;
	}
	public void setNumPredioCasa(int numPredioCasa) {
		this.numPredioCasa = numPredioCasa;
	}
	
	
	
}
