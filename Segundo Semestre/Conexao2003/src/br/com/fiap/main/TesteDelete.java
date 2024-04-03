package br.com.fiap.main;

import java.sql.SQLException;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Produto;
import br.com.fiap.dao.ProdutoDAO;

public class TesteDelete {

	static int inteiro(String j) {
		return Integer.parseInt(JOptionPane.showInputDialog(j));
	}

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		ProdutoDAO pDao = new ProdutoDAO();
		Produto objProduto = new Produto();

		objProduto.setCodigo(inteiro("Informe o código do produto que será deletado!"));

		System.out.println(pDao.deletar(objProduto));

	}

}
