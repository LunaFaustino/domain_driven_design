package br.com.fiap.beans;

public class Produto {
	
	// visibilidade, tipo de dado e variável
	private String tipo;
	private String marca;
	private int quantidade;
	private double valor;
	
	// setters
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	// getters
	public String getTipo() {
		return tipo;
	}
	
	public String getMarca() {
		return marca;
	}
	
	public int getQuantidade() {
		return quantidade;
	}
	
	public double getValor() {
		return valor;
	}

}
