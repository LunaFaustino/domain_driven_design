package br.com.fiap.main;

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
		
		// int codigo, String tipo, String marca, double valor, int quantidade
		Produto[] objVetorProduto = new Produto[3];
		
		int indice = 0;
		
		do {
			objVetorProduto[indice] = new Produto();
			objVetorProduto[indice].setCodigo(inteiro("Informe o código do produto"));
			objVetorProduto[indice].setTipo(texto("Tipo do produto"));
			objVetorProduto[indice].setMarca(texto("Marca do produto"));
			objVetorProduto[indice].setValor(real("Informe o valor"));
			objVetorProduto[indice].setQuantidade(inteiro("Quantidade"));
			
			indice ++;
			
		}while(JOptionPane.showConfirmDialog(null, "Adicionar produto no carrinho?", "Carrinho de compras",
				JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == 0);
		
		for (int contador = 0; contador < indice ; contador ++) {
			System.out.println(
					"Código: " + objVetorProduto[contador].getCodigo() +
					"\nTipo: " + objVetorProduto[contador].getTipo() + 
					"\nMarca: " + objVetorProduto[contador].getMarca() + 
					"\nValor: " + objVetorProduto[contador].getValor() + 
					"\nQuantidade: " + objVetorProduto[contador].getQuantidade()+ 
					"\n\n");
		}

	}

}
