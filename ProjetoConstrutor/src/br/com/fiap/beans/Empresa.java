package br.com.fiap.beans;

public class Empresa {

	private String razaoSocial;
	private String email;
	private String segmento;
	private int unidade;
	private Endereco endereco;
	private Produto produto;

	public Empresa() {
		super();
	}

	public Empresa(String razaoSocial, String email, String segmento, int unidade) {
		super();
		this.razaoSocial = razaoSocial.toUpperCase();
		this.email = email.toLowerCase();
		this.segmento = segmento;
		this.unidade = unidade;
	}

	public String getRazaoSocial() {
		return razaoSocial;
	}

	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSegmento() {
		return segmento;
	}

	public void setSegmento(String segmento) {
		this.segmento = segmento;
	}

	public int getUnidade() {
		return unidade;
	}

	public void setUnidade(int unidade) {
		this.unidade = unidade;
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

}
