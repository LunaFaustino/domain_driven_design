package br.com.global.beans;

public class Representante {

	private String nome;
	private String cpf;
	private Contato contato;

	public Representante() {
		super();
	}

	public Representante(String nome, String cpf, Contato contato) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.contato = contato;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Contato getContato() {
		return contato;
	}

	public void setContato(Contato contato) {
		this.contato = contato;
	}

}
