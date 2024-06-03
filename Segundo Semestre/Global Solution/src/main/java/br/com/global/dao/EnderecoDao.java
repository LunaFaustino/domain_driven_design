package br.com.global.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.global.connections.ConnectionFactory;
import br.com.global.models.Endereco;

public class EnderecoDao {
	
	public Connection minhaConexao;

	public EnderecoDao() throws ClassNotFoundException, SQLException {
		super();
		this.minhaConexao = new ConnectionFactory().conexao();
	}
	
	public String inserir(Endereco endereco) {
		PreparedStatement stmt = minhaConexao.prepareStatement("insert into t_endereco values()");
		
		return null;
		
	}
	
	

}
