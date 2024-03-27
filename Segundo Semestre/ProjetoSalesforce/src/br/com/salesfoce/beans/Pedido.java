package br.com.salesfoce.beans;

public class Pedido {

	private int codigo;
	private String descricao;
	private String dataPedido;
	private double valor;
	private String prazoPagamento;
	private Produto produto;
	
	public Pedido() {
		super();
	}
	
	public Pedido(int codigo, String descricao, String dataPedido, double valor, String prazoPagamento,
			Produto produto) {
		super();
		this.codigo = codigo;
		this.descricao = descricao;
		this.dataPedido = dataPedido;
		this.valor = valor;
		this.prazoPagamento = prazoPagamento;
		this.produto = produto;
	}
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getDataPedido() {
		return dataPedido;
	}
	public void setDataPedido(String dataPedido) {
		this.dataPedido = dataPedido;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public String getPrazoPagamento() {
		return prazoPagamento;
	}
	public void setPrazoPagamento(String prazoPagamento) {
		this.prazoPagamento = prazoPagamento;
	}
	public Produto getProduto() {
		return produto;
	}
	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	
	
	
}
