package br.com.fiap.main;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Produto;
import br.com.fiap.dao.ProdutoDAO;

public class TesteVisualizar {

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

		ProdutoDAO pDao = new ProdutoDAO();

		List<Produto> listaProduto = (ArrayList<Produto>) pDao.visualizar();

		if (listaProduto != null) {
			for (Produto p : listaProduto) {
				System.out.println(p.getCodigo() + " " + p.getTipo() + " " + p.getMarca() + " " + p.getValor());
			}
		}

	}

}
