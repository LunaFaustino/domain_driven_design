package br.com.fiap.beans;

public class Carro {
	
	// visibilidade, tipo de dado e variavel
	private String marca;
	private String modelo;
	private int ano;
	private double valorCarro;
	
	// setters
	
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public void setValor(double valor) {
		this.valorCarro = valor;
	}
	
	// getters
	
	public String getMarca() {
		return marca;
	}
	public String getModelo() {
		return modelo;
	}
	public int getAno() {
		return ano;
	}
	public double getValor() {
		return valorCarro;
	}

}
