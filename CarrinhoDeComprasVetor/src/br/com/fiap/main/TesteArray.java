package br.com.fiap.main;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Produto;

public class TesteArray {
	
	static String texto(String j) {
		return JOptionPane.showInputDialog(j);
	}
	
	static int inteiro(String j) {
		return Integer.parseInt(JOptionPane.showInputDialog(j));
	}
	
	static double real(String j) {
		return Double.parseDouble(JOptionPane.showInputDialog(j));
	}

	public static void main(String[] args) {
		
		// lista de produtos
		List<Produto> listaProdutos = new ArrayList<Produto>();
		
		// objeto produto
		Produto objProduto;

		int continuar = 0;
		
		while(continuar == 0) {
			
			objProduto = new Produto();
			objProduto.setCodigo(inteiro("Digite o código"));
			objProduto.setTipo(texto("Digite o tipo"));
			objProduto.setMarca(texto("Digite a marca"));
			objProduto.setPreco(real("Digite o preço"));
			
			listaProdutos.add(objProduto);
			
			continuar = JOptionPane.showConfirmDialog(null, "Gostaria de adicionar outro produto?",
					"CARRINHO DE COMPRAS", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
		}
		
		// saida foreach para LISTAS
		
		for (Produto produto : listaProdutos) {
			System.out.println("\n\nDADOS DO PRODUTO\n\n" + 
		"Código: " + produto.getCodigo() +
		"\nTipo: " + produto.getTipo() + 
		"\nMarca: " + produto.getMarca() + 
		"\nPreço: " + produto.getPreco());
			
		}
	}

}
