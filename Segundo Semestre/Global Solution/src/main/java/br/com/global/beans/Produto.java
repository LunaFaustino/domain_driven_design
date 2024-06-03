package br.com.global.beans;

public class Produto {

	private String tipo;
	private double quantidade;
	private String reciclagem;

	public Produto() {
		super();
	}

	public Produto(String tipo, double quantidade, String reciclagem) {
		super();
		this.tipo = tipo;
		this.quantidade = quantidade;
		this.reciclagem = reciclagem;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public double getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(double quantidade) {
		this.quantidade = quantidade;
	}

	public String getReciclagem() {
		return reciclagem;
	}

	public void setReciclagem(String reciclagem) {
		this.reciclagem = reciclagem;
	}

}
