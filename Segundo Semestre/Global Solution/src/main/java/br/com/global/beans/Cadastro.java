package br.com.global.beans;

public class Cadastro {

	private String nome;
	private String email;
	private String cep;

	public Cadastro() {
		super();
	}

	public Cadastro(String nome, String email, String cep) {
		super();
		this.nome = nome;
		this.email = email;
		this.cep = cep;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

}
