package br.com.fiap.beans;

public class Produto {
	
	private int codigo;
	private String tipo;
	private String marca;
	private double valor;
	
	public Produto() {
		super();
	}
	
	public Produto(int codigo, String tipo, String marca, double valor) {
		super();
		this.codigo = codigo;
		this.tipo = tipo;
		this.marca = marca;
		this.valor = valor;
	}
	
	public int getCodigo() {
		return codigo;
	}
	public String getTipo() {
		return tipo;
	}
	public String getMarca() {
		return marca;
	}
	public double getValor() {
		return valor;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	
	

}
