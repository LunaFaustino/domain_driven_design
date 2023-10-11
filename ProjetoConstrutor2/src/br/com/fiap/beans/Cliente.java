package br.com.fiap.beans;

public class Cliente {

	private String nome;
	private String cpf;
	private int conta;
	private String email;
	private double saldo;

	public Cliente() {
		super();
	}

	public Cliente(String nome, String cpf, int conta, String email, double saldo) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.conta = conta;
		this.email = email.toLowerCase();
		this.saldo = saldo;
	}

	public String getNome() {
		return nome;
	}

	public String getCpf() {
		return cpf;
	}

	public int getConta() {
		return conta;
	}

	public String getEmail() {
		return email;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public void setConta(int conta) {
		this.conta = conta;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

}
