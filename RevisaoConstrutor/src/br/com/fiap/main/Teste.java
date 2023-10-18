package br.com.fiap.main;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Empresa;
import br.com.fiap.beans.Endereco;
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
		
		// String razaoSocial, String segmento, String email, int unidade
		Empresa objEmpresa = new Empresa(
				texto("Digite a Razão Social"),
				texto("Digite o segmento"),
				texto("Digite o e-mail"),
				inteiro(JOptionPane.showInputDialog("Digite a unidade"))
				);
		
		// String logradouro, String cep, int numero, String bairro
		Endereco objEndereco = new Endereco(
				texto("Digite o logradouro"),
				texto("Digite o CEP"),
				inteiro(JOptionPane.showInputDialog("Digite o número")),
				texto("Digite o bairro")
				);
		
		objEmpresa.setEndereco(objEndereco);
		
		// String tipo, String marca, int quant, double valor
		Produto objProduto = new Produto(
				texto("Digite o tipo"),
				texto("Digite a marca"),
				inteiro(JOptionPane.showInputDialog("Digite a quantidade")),
				real(JOptionPane.showInputDialog("Digite o valor"))
				);
		
		objEmpresa.setProduto(objProduto);
		
		System.out.println("INFORMAÇÕES EMPRESA\n\n" + 
		"Razão Social: " + objEmpresa.getRazaoSocial() + 
		"\nSegmento: " + objEmpresa.getSegmento() + 
		"\nE-mail: " + objEmpresa.getEmail() + 
		"\nUnidade: " + objEmpresa.getUnidade() + 
		"\n\nINFORMAÇÕES ENDEREÇO\n\n" + 
		"Logradouro: " + objEmpresa.getEndereco().getLogradouro() + 
		"\nCEP: " + objEmpresa.getEndereco().getCep() + 
		"\nNúmero: " + objEmpresa.getEndereco().getNumero() + 
		"\nBairro: " + objEmpresa.getEndereco().getBairro() + 
		"\n\nINFORMAÇÕES PRODUTO\n\n" + 
		"Tipo: " + objEmpresa.getProduto().getTipo() + 
		"\nMarca: "  + objEmpresa.getProduto().getMarca() + 
		"\nQuantidade: " + objEmpresa.getProduto().getQuant() + 
		"\nValor: " + objEmpresa.getProduto().getValor()
				);

	}

}
