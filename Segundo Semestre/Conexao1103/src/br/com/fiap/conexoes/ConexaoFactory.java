package br.com.fiap.conexoes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoFactory {
	
	// método de conexão com o banco de dados
	
	public Connection conexao() throws ClassNotFoundException, SQLException {
		
		// driver
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		// conexão
		return DriverManager.getConnection("jdbc:oracle:thin:@oracle.fiap.com.br:1521:orcl","rm552473","080100");
		
		
		
	}
	

}