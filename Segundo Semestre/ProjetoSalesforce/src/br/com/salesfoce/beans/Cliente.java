package br.com.salesfoce.beans;

public class Cliente {
	
	private int codigo;
	private String nome;
	private Endereco endereco;
	private Pedido pedido;
	private Contato contato;
	
	public Cliente() {
		super();
	}
	
	public Cliente(int codigo, String nome, Endereco endereco, Pedido pedido, Contato contato) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.endereco = endereco;
		this.pedido = pedido;
		this.contato = contato;
	}
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	public Pedido getPedido() {
		return pedido;
	}
	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}
	public Contato getContato() {
		return contato;
	}
	public void setContato(Contato contato) {
		this.contato = contato;
	}
	
	

}
