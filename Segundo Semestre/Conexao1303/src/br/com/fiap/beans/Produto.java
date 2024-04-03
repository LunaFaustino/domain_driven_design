package br.com.fiap.beans;

public class Produto {

	private int codido;
	private String tipo;
	private String marca;
	private double valor;

	public Produto() {
		super();
	}

	public Produto(int codido, String tipo, String marca, double valor) {
		super();
		this.codido = codido;
		this.tipo = tipo;
		this.marca = marca;
		this.valor = valor;
	}

	public int getCodido() {
		return codido;
	}

	public void setCodido(int codido) {
		this.codido = codido;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

}
