package br.com.fiap.main;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Endereco;
import br.com.fiap.beans.PessoaFisica;
import br.com.fiap.beans.PessoaJuridica;

public class Teste {
	
	static String texto(String j) {
		return JOptionPane.showInputDialog(j);
	}
	
	static int inteiro(String j) {
		return Integer.parseInt(JOptionPane.showInputDialog(j));
	}
	
	

	public static void main(String[] args) {
		
		// String nome, String email, String cpf
		PessoaFisica objPF = new PessoaFisica(
				texto("Digite o nome"),
				texto("Digite o e-mail"),
				texto("Digite o CPF")
				);
		
		// String nome, String email, String cnpj
		PessoaJuridica objPJ = new PessoaJuridica(
				texto("Digite o nome"),
				texto("Digite o e-mail"),
				texto("Digite o CNPJ")
				);
		
		// String logradouro
		Endereco objEnd = new Endereco(
				texto("Digite o logradouro")
				);
		
		System.out.println(objPF.identificador());
		
		System.out.println(objPF.identificador());

	}

}
