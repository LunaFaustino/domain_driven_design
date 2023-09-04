package br.com.fiap.beans;

public class Produto {
	
	// visibilidade, tipo de dado e varável
	private String tipo;
	private String marca;
	private int quantidade;
	private double valor;
	
	// setters
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	// getters
	public String getTipo() {
		return tipo;
	}

}
