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
		
		Produto[] vetorProdutos = new Produto[2];
		
		//controla a posição de cada produto
		int indice = 0;
		
		do {
			
			vetorProdutos[indice] = new Produto();
			vetorProdutos[indice].setCodigo(inteiro("Digite o código"));
			vetorProdutos[indice].setTipo(texto("Digite o tipo de produto"));
			vetorProdutos[indice].setMarca(texto("Digite a marca"));
			vetorProdutos[indice].setQuantidade(inteiro("Digite a quantidade"));
			vetorProdutos[indice].setPreco(real("Digite o valor"));
			
			indice++;
			
		}while( JOptionPane.showConfirmDialog(null, "Adicionar mais produtos?", 
				"CARRINHO DE COMPRAS", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) ==0);
		
		for(int contador = 0; contador < indice; contador++) {
			System.out.println(
					"\nCódigo: " + vetorProdutos[contador].getCodigo() + 
					"\nTipo: " + vetorProdutos[contador].getTipo() + 
					"\nMarca: " + vetorProdutos[contador].getMarca() + 
					"\nQuantidade: " + vetorProdutos[contador].getQuantidade() + 
					"\nPreço: " + vetorProdutos[contador].getPreco()
					);
		}
		

	}

}
