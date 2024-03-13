package br.com.fiap.main;

import java.sql.SQLException;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Produto;
import br.com.fiap.dao.ProdutoDAO;

public class TesteCadastro {
	
	static String texto(String j) {
		return JOptionPane.showInputDialog(j);
	}
	
	static int inteiro(String j) {
		return Integer.parseInt(JOptionPane.showInputDialog(j));
	}
	
	static double real(String j) {
		return Double.parseDouble(JOptionPane.showInputDialog(j));
	}

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		ProdutoDAO dao = new ProdutoDAO();
		
		Produto objProduto = new Produto();
		
		objProduto.setCodido(inteiro("Digite o código"));
		objProduto.setTipo(texto("Digite o tipo"));
		objProduto.setMarca(texto("Digite a marca"));
		objProduto.setValor(real("Digite o valor"));
		
		System.out.println(dao.inserir(objProduto));

	}

}
