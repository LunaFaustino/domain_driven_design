package br.com.fiap.beans;

public class Colaborador {
	// visibilidade, tipo de dado e variavel
	private String nome;
	private int idade;
	private double qtHoras;
	private double valorHora;
	private Endereco endereco;
	
	// setters
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public void setQtHoras(double qtHoras) {
		this.qtHoras = qtHoras;
	}
	public void setValorHora(double valorHora) {
		this.valorHora = valorHora;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	// getters
	
	public String getNome() {
		return nome;
	}
	public int getIdade() {
		return idade;
	}
	public double getQtHoras() {
		return qtHoras;
	}
	public double getValorHora() {
		return valorHora;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	
	// metodo get com mais de um atributo
	
	public String getNomeIdade() {
		return "Nome: " + nome + "\nIdade: " + idade;
	}
	
	// metodo worker
	
	public double calcularSalario() {
		return valorHora * qtHoras;
	}
	
	// metodo if ellse
	public String pagarTaxa( ) {
		String informacao = null;
		
		if (calcularSalario() > 15200) {
			informacao = "Paga taxa!";
		} else {
			informacao = "Não paga taxa";
		}
		
		return informacao;
	}

}
