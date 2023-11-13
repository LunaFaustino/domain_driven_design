package br.com.fiap.main;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Produto;

public class Teste {
	
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
		
		List<Produto> listaProduto = new ArrayList<Produto>();
		
		Produto objProduto;
		
		do {
			objProduto = new Produto();
			objProduto.setCodigo(inteiro("Informe o código"));
			objProduto.setTipo(texto("Informe o tipo do produto"));
			objProduto.setMarca(texto("Digite a marca do produto"));
			objProduto.setQuantidade(inteiro("Informe a quantidade"));
			objProduto.setPreco(real("Digite o preço"));
			listaProduto.add(objProduto);
			
		}while(JOptionPane.showConfirmDialog(null, "Adicionar outro produto no carrinho?", "CARRINHO DE COMPRAS", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE)==0);
		
		for(Produto produto : listaProduto) {
			
			System.out.println(
					"\n\nCódigo: " + produto.getCodigo() + 
					"\nTipo: " + produto.getTipo() + 
					"\nMarca: " + produto.getMarca() + 
					"\nQuantidade: " + produto.getQuantidade() + 
					"\nPreço: " + produto.getPreco()
					);
		}

	}

}
