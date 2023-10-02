package br.com.fiap.beans;

public class Colaborador {
	
	private String nome;
	private String cargo;
	private double valorHora;
	private double qtdHora;
	
	
	public String getNome() {
		return nome;
	}
	public String getCargo() {
		return cargo;
	}
	public double getValorHora() {
		return valorHora;
	}
	public double getQtdHora() {
		return qtdHora;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public void setValorHora(double valorHora) {
		this.valorHora = valorHora;
	}
	public void setQtdHora(double qtdHora) {
		this.qtdHora = qtdHora;
	}
	
	// get tudo (nome e cargo)
	
	public String getNomeCargo() {
		
		return "Nome: " + nome + "\nCargo: " + cargo;
	}
	
	// metodo worker
	
	public double calcularSalario() {
		
		return valorHora * qtdHora;
		
	}
	
	// metodo if else
	public String pagarTaxa() {
		if(calcularSalario() > 1000) {
			return "Pagar Taxa";
		} else {
			return "Não paga taxa";
		}
	}

}
