package br.com.salesfoce.beans;

public class Funcionario {
	
	private int id;
	private String nome;
	private int idade;
	private String funcao;
	private String dataAdmissao;
	private String descricaoAtividade;
	
	public Funcionario() {
		super();
	}
	
	public Funcionario(int id, String nome, int idade, String funcao, String dataAdmissao, String descricaoAtividade) {
		super();
		this.id = id;
		this.nome = nome;
		this.idade = idade;
		this.funcao = funcao;
		this.dataAdmissao = dataAdmissao;
		this.descricaoAtividade = descricaoAtividade;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getFuncao() {
		return funcao;
	}
	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}
	public String getDataAdmissao() {
		return dataAdmissao;
	}
	public void setDataAdmissao(String dataAdmissao) {
		this.dataAdmissao = dataAdmissao;
	}
	public String getDescricaoAtividade() {
		return descricaoAtividade;
	}
	public void setDescricaoAtividade(String descricaoAtividade) {
		this.descricaoAtividade = descricaoAtividade;
	}
	
	

}
