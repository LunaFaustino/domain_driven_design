package br.com.fiap.main;

import java.sql.Connection;
import java.sql.SQLException;

import br.com.fiap.conexoes.ConexaoFactory;

public class Teste {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		
		Connection cn = new ConexaoFactory().conexao();
		System.out.println("Conexão feita");
		cn.close();

	}

}
