package br.com.fiap.main;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Produto;

public class TesteVetor {

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
		
		// preparar posições do vetor
		Produto[] vetorProduto = new Produto[2];
		
		// controle de posições
		int indice = 0;
		
		do {
			vetorProduto[indice] = new Produto();
			vetorProduto[indice].setCodigo(inteiro("Digite o código"));
			vetorProduto[indice].setTipo(texto("Digite o tipo"));
			vetorProduto[indice].setMarca(texto("Digite a marca"));
			vetorProduto[indice].setPreco(real("Digite o preço"));
			
			indice++;
					
		} while (JOptionPane.showConfirmDialog(null, "Gostaria de adicionar outro produto?",
				"CARRINHO DE COMPRAS", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) ==0);

		// saida for para VETOR
		
		for(int contador = 0; contador < indice; contador ++) {
			System.out.println("DADOS DO PRODUTO\n\n" + 
		"Código: " + vetorProduto[contador].getCodigo() +
		"\nTipo: " + vetorProduto[contador].getTipo() + 
		"\nMarca: " + vetorProduto[contador].getMarca() + 
		"\nPreço: " + vetorProduto[contador].getPreco()
					);
		}
	}

}
