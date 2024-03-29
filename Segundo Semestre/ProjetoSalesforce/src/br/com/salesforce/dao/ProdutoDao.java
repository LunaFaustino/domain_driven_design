package br.com.salesforce.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.salesfoce.beans.Produto;
import br.com.salesforce.conexoes.ConnectionFactory;

public class ProdutoDao {

	public Connection minhaConexao;

	public ProdutoDao() throws ClassNotFoundException, SQLException {
		super();
		this.minhaConexao = new ConnectionFactory().conexao();
	}

	public String inserir(Produto produto) throws SQLException {
		PreparedStatement stmt = minhaConexao.prepareStatement("insert into T_SGDD_PRODUTO values(?,?,?,?,?,?,?,?)");

		stmt.setInt(1, produto.getCodigo());
		stmt.setString(2, produto.getNome());
		stmt.setString(3, produto.getTipo());
		stmt.setString(4, produto.getDescricao());
		stmt.setString(5, produto.getDisponibilidade());
		stmt.setString(6, produto.getPrazoLicensa());
		stmt.setDouble(7, produto.getValorProduto());
		stmt.setInt(8, produto.getId());
		stmt.execute();
		stmt.close();

		return "Produto cadastrado com sucesso!";
	}

	public List<Produto> visualizar() throws SQLException {
		List<Produto> listaProduto = new ArrayList<Produto>();
		PreparedStatement stmt = minhaConexao.prepareStatement("select * from T_SGDD_PRODUTO");
		ResultSet rs = stmt.executeQuery();

		while (rs.next()) {
			Produto produto = new Produto();
			produto.setCodigo(rs.getInt(1));
			produto.setNome(rs.getString(2));
			produto.setTipo(rs.getString(3));
			produto.setDescricao(rs.getString(4));
			produto.setDisponibilidade(rs.getString(5));
			produto.setPrazoLicensa(rs.getString(6));
			produto.setValorProduto(rs.getDouble(7));
			produto.setId(rs.getInt(8));
			listaProduto.add(produto);
		}

		return listaProduto;
	}
}
