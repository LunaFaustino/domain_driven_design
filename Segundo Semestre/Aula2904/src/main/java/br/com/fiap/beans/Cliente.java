package br.com.fiap.beans;

import br.com.fiap.model.Endereco;

public class Cliente {

	private int codigo;
	private String name;
	private int idade;
	private double renda;
	private Endereco endereco;

	public Cliente() {
		super();
	}

	public Cliente(int codigo, String name, int idade, double renda) {
		super();
		this.codigo = codigo;
		this.name = name;
		this.idade = idade;
		this.renda = renda;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public double getRenda() {
		return renda;
	}

	public void setRenda(double renda) {
		this.renda = renda;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	@Override
	public String toString() {
		return "Dados do Cliente:\n \nCódigo= " + codigo + "\nNome= " + name + "\nIdade= " + idade + "\nRenda= " + renda + 
				endereco;
	}

}
