package br.com.fiap.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.fiap.beans.Produto;
import br.com.fiap.conexoes.ConexaoFactory;

public class ProdutoDAO {
	
	public Connection minhaConexao;

	public ProdutoDAO() throws ClassNotFoundException, SQLException {
		super();
		this.minhaConexao = new ConexaoFactory().conexao();
	}
	
	public String inserir (Produto produto) throws SQLException {
		PreparedStatement stmt = minhaConexao.prepareStatement("insert into T_FIAP_PRODUTO values(?,?,?,?)");
		
		stmt.setInt(1, produto.getCodigo());
		stmt.setString(2, produto.getTipo());
		stmt.setString(3, produto.getMarca());
		stmt.setDouble(4, produto.getValor());
		stmt.execute();
		stmt.close();
		
		return "Produto foi cadastrado com sucesso";
		
	}
	
	// deletar
	
	public String deletar (Produto produto) throws SQLException {
		PreparedStatement stmt = minhaConexao.prepareStatement("delete from T_FIAP_PRODUTO where CODIGO = ?");
		
		stmt.setInt(1, produto.getCodigo());
		stmt.execute();
		stmt.close();
		
		return "Produto deletado com sucesso";
	}
	
	// update
	
	public String atualizar (Produto produto) throws SQLException {
		PreparedStatement stmt = minhaConexao.prepareStatement("update t_fiap_produto set tipo = ?, marca = ?, valor = ? where codigo = ?");
		
		stmt.setString(1, produto.getTipo());
		stmt.setString(2, produto.getMarca());
		stmt.setDouble(3, produto.getValor());
		stmt.setInt(4, produto.getCodigo());
		stmt.executeUpdate();
		stmt.close();
		
		return "Produto atualizado com sucesso";
	}
	
	

}
