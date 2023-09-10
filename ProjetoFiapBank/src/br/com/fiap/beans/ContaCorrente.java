package br.com.fiap.beans;

public class ContaCorrente {
	// visibilidade, tipo de dado e variavel
	private double saldo;
	private Cliente titular;
	
	// setters
	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	// getters
	
	public double getSaldo() {
		return saldo;
	}
	public Cliente getTitular() {
		return titular;
	}
}
