package br.com.fiap.main;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Empresa;
import br.com.fiap.beans.Endereco;
import br.com.fiap.beans.Produto;

public class Teste {

	public static void main(String[] args) {
		
		// String razaoSocial, String email, String segmento, int unidade
		Empresa objEmpresa = new Empresa(
				JOptionPane.showInputDialog("Digite a Razão Social"),
				JOptionPane.showInputDialog("Digite o e-mail"),
				JOptionPane.showInputDialog("Digite o segmento da empresa"),
				Integer.parseInt(JOptionPane.showInputDialog("Digite a unidade"))
				);
		
		// String logradouro, String cep, String bairro, int numero
		Endereco objEndereco = new Endereco(
				JOptionPane.showInputDialog("Digite o logradouro"),
				JOptionPane.showInputDialog("Digite o CEP"),
				JOptionPane.showInputDialog("Digite o bairro"),
				Integer.parseInt(JOptionPane.showInputDialog("Digite o número"))
				);
		
		objEmpresa.setEndereco(objEndereco);
		
		// int codigo, String tipo, String marca, double valor
		Produto objProduto = new Produto(
				Integer.parseInt(JOptionPane.showInputDialog("Digite o código do produto")),
				JOptionPane.showInputDialog("Digite o tipo de produto"),
				JOptionPane.showInputDialog("Digite a marca do produto"),
				Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do produto"))
				);
		
		objEmpresa.setProduto(objProduto);
		
		System.out.println("INFORMAÇÕES DA EMPRESA\n\n" + 
				"Razão Social: " + objEmpresa.getRazaoSocial() + 
				"\nE-mail: " + objEmpresa.getEmail() + 
				"\nSegmento: " + objEmpresa.getSegmento() + 
				"\nUnidade: " + objEmpresa.getUnidade() + 
				"\n\nENDEREÇO EMPRESA\n\n" + 
				"Logradouro: " + objEmpresa.getEndereco().getLogradouro() + 
				"\nCEP: " + objEmpresa.getEndereco().getCep() + 
				"\nBairro: " + objEmpresa.getEndereco().getBairro() + 
				"\nNúmero: " + objEmpresa.getEndereco().getNumero() + 
				"\n\nINFORMAÇÕES DO PRODUTO\n\n" + 
				"Código: " + objEmpresa.getProduto().getCodigo() + 
				"\nTipo: " + objEmpresa.getProduto().getTipo() + 
				"\nMarca: " + objEmpresa.getProduto().getMarca() + 
				"\nValor: " + objEmpresa.getProduto().getValor()
				);

	}

}
