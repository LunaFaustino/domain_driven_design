package br.com.fiap.main;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Banco;
import br.com.fiap.beans.Cliente;
import br.com.fiap.beans.Endereco;

public class Teste {

	public static void main(String[] args) {
		
		// String nome, String agencia
		Banco objBanco = new Banco(
				JOptionPane.showInputDialog("Digite o nome do banco"),
				JOptionPane.showInputDialog("Digite a agência")
				);
		
		// String nome, String cpf, int conta, String email, double saldo
		Cliente objCliente = new Cliente(
				JOptionPane.showInputDialog("Digite o nome"),
				JOptionPane.showInputDialog("Digite o CPF"),
				Integer.parseInt(JOptionPane.showInputDialog("Digite o número da conta")),
				JOptionPane.showInputDialog("Digite o e-mail"),
				Double.parseDouble(JOptionPane.showInputDialog("Informe o saldo"))
				);
		
		objBanco.setCliente(objCliente);
		
		// String logradouro, String cep, String bairro, int numero
		Endereco objEndereco = new Endereco(
				JOptionPane.showInputDialog("Digite o logradouro"),
				Integer.parseInt(JOptionPane.showInputDialog("Digite o número")),
				JOptionPane.showInputDialog("Digite o bairro"),
				JOptionPane.showInputDialog("Digite o CEP")
				);
		
		objBanco.setEndereco(objEndereco);
		
		System.out.println("INFORMAÇÕES BANCO:\n\n" + 
		"Banco: " + objBanco.getNome() + 
		"\nAgência: " + objBanco.getAgencia() + 
		"\n\nINFORMAÇÕES ENDEREÇO:\n\n" + 
		"Logradouro: " + objBanco.getEndereco().getLogradouro() + 
		"\nNúmero: " + objBanco.getEndereco().getNumero() + 
		"\nBairro: " + objBanco.getEndereco().getBairro() + 
		"\nCEP: " + objBanco.getEndereco().getCep() + 
		"\n\nINFORMAÇÕES CLIENTE:\n\n" + 
		"Nome: " + objBanco.getCliente().getNome() + 
		"\nCPF: " + objBanco.getCliente().getCpf() + 
		"\nConta: " + objBanco.getCliente().getConta() + 
		"\nE-mail: " + objBanco.getCliente().getEmail() + 
		"\nSaldo: "  + objBanco.getCliente().getSaldo()
				);

	}

}
