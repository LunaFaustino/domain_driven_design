package br.com.fiap.beans;

public class Produto {

	private String tipo;
	private String marca;
	private int quant;
	private double valor;

	public Produto() {
		super();
	}

	public Produto(String tipo, String marca, int quant, double valor) {
		super();
		this.tipo = tipo;
		this.marca = marca;
		this.quant = quant;
		this.valor = valor;
	}

	public String getTipo() {
		return tipo;
	}

	public String getMarca() {
		return marca;
	}

	public int getQuant() {
		return quant;
	}

	public double getValor() {
		return valor;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public void setQuant(int quant) {
		this.quant = quant;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

}
