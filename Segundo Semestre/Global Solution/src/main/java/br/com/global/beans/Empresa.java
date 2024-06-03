package br.com.global.beans;

import br.com.global.models.Endereco;

public class Empresa {

	private String nomeFant;
	private String razaoSoc;
	private String cnpj;
	private Contato contato;
	private Representante representante;
	private Endereco endereco;
	private Produto produto;

	public Empresa() {
		super();
	}

	public Empresa(String nomeFant, String razaoSoc, String cnpj, Contato contato, Representante representante, Endereco endereco, Produto produto) {
		super();
		this.nomeFant = nomeFant;
		this.razaoSoc = razaoSoc;
		this.cnpj = cnpj;
		this.contato = contato;
		this.representante = representante;
		this.endereco = endereco;
		this.produto = produto;
	}

	public String getNomeFant() {
		return nomeFant;
	}

	public void setNomeFant(String nomeFant) {
		this.nomeFant = nomeFant;
	}

	public String getRazaoSoc() {
		return razaoSoc;
	}

	public void setRazaoSoc(String razaoSoc) {
		this.razaoSoc = razaoSoc;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public Contato getContato() {
		return contato;
	}

	public void setContato(Contato contato) {
		this.contato = contato;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public Representante getRepresentante() {
		return representante;
	}

	public void setRepresentante(Representante representante) {
		this.representante = representante;
	}

}
