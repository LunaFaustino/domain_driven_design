package br.com.fiap.beans;

public class Banco {

	private String nome;
	private String agencia;
	private Endereco endereco;
	private Cliente cliente;

	public Banco() {
		super();
	}

	public Banco(String nome, String agencia) {
		super();
		this.nome = nome;
		this.agencia = agencia;
	}

	public String getNome() {
		return nome;
	}

	public String getAgencia() {
		return agencia;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

}
