package br.com.salesfoce.beans;

public class SetoresSalesforce {
	
	private int id;
	private String funcao;
	private String descricao;
	private String responsavel;
	private Funcionario funcionario;
	
	public SetoresSalesforce() {
		super();
	}
	
	public SetoresSalesforce(int id, String funcao, String descricao, String responsavel, Funcionario funcionario) {
		super();
		this.id = id;
		this.funcao = funcao;
		this.descricao = descricao;
		this.responsavel = responsavel;
		this.funcionario = funcionario;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFuncao() {
		return funcao;
	}
	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getResponsavel() {
		return responsavel;
	}
	public void setResponsavel(String responsavel) {
		this.responsavel = responsavel;
	}
	public Funcionario getFuncionario() {
		return funcionario;
	}
	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}

}
