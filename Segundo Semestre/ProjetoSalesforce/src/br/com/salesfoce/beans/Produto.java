package br.com.salesfoce.beans;

public class Produto {
	
	private int codigo;
	private String tipo;
	private String descricao;
	private String disponibilidade;
	private String prazoLicensa;
	private double valorProduto;
	private String nome;
	
	public Produto() {
		super();
	}
	
	public Produto(int codigo, String tipo, String descricao, String disponibilidade, String prazoLicensa,
			double valorProduto, String nome) {
		super();
		this.codigo = codigo;
		this.tipo = tipo;
		this.descricao = descricao;
		this.disponibilidade = disponibilidade;
		this.prazoLicensa = prazoLicensa;
		this.valorProduto = valorProduto;
		this.nome = nome;
	}
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getDisponibilidade() {
		return disponibilidade;
	}
	public void setDisponibilidade(String disponibilidade) {
		this.disponibilidade = disponibilidade;
	}
	public String getPrazoLicensa() {
		return prazoLicensa;
	}
	public void setPrazoLicensa(String prazoLicensa) {
		this.prazoLicensa = prazoLicensa;
	}
	public double getValorProduto() {
		return valorProduto;
	}
	public void setValorProduto(double valorProduto) {
		this.valorProduto = valorProduto;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	
	
}
