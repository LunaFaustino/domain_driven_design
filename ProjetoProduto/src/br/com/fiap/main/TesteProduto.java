package br.com.fiap.main;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Produto;

public class TesteProduto {

	public static void main(String[] args) {
		// instanciar objeto
		Produto objetoProduto = new Produto();
		
		// setters
		objetoProduto.setTipo(JOptionPane.showInputDialog("Digite o tipo de Produto"));
		objetoProduto.setMarca(JOptionPane.showInputDialog("Digite a marca do Produto"));
		objetoProduto.setQuantidade(Integer.parseInt(JOptionPane.showInputDialog("Digite a Quantidade")));
		objetoProduto.setValor(Double.parseDouble(JOptionPane.showInputDialog("Digite o Valor")));
		
		// getters
		System.out.println("Tipo: " + objetoProduto.getTipo() + 
				"\nMarca: " + objetoProduto.getMarca() + 
				"\nQuantidade: " + objetoProduto.getQuantidade() + 
				"\nValor: " + objetoProduto.getValor());

	}

}
