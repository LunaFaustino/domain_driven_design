package br.com.salesforce.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.salesfoce.beans.ClientePf;
import br.com.salesforce.conexoes.ConnectionFactory;

public class ClientePfDao {
	
	public Connection minhaConexao;

	public ClientePfDao() throws ClassNotFoundException, SQLException {
		super();
		this.minhaConexao = new ConnectionFactory().conexao();
	}
	
	public String inserir(ClientePf clientePf) throws SQLException {
		PreparedStatement stmt = minhaConexao.prepareStatement("insert into T_SGDD_CLIENTE_PF values(?,?,?,?,?)");
		
		stmt.setString(1, clientePf.getCpf());
		stmt.setString(2, clientePf.getProfissao());
		stmt.setString(3, clientePf.getEscolaridade());
		stmt.setString(4, clientePf.getDtNascimento());
		stmt.setString(5, clientePf.getSexo());
		stmt.execute();
		stmt.close();
		
		return "Cliente Pessoa Física Cadastrado com sucesso";
	}
	
	

}
