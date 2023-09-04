package br.com.fiap.main;

import br.com.fiap.beans.Produto;

public class TesteProduto {

	public static void main(String[] args) {
		// instanciar objeto
		Produto objetoProduto = new Produto();
		
		// setters
		objetoProduto.setTipo("Celular");
		objetoProduto.setMarca("Apple");
		objetoProduto.setQuantidade(1);
		objetoProduto.setValor(5.000);
		
		// getters
		objetoProduto.getTipo();
		objetoProduto.getMarca();
		objetoProduto.getQuantidade();
		objetoProduto.getValor();

	}

}
