package br.com.fiap.main;

import br.com.fiap.beans.Cliente;
import br.com.fiap.beans.ContaCorrente;
import br.com.fiap.beans.Endereco;

public class Teste {

	public static void main(String[] args) {
		// instanciar objeto
		Cliente objetoCliente = new Cliente();
		ContaCorrente objetoContaCorrente = new ContaCorrente();
		Endereco objetoEndereco = new Endereco();
		
		// setters Cliente
		objetoCliente.setName("Luna");
		objetoCliente.setCpf("479.643.358/98");
		objetoCliente.setEndereco(objetoEndereco);
		
		// setters ContaCorrente
		objetoContaCorrente.setSaldo(65.400);
		objetoContaCorrente.setTitular(objetoCliente);
		
		// setters Endereco
		objetoEndereco.setLogradouro("Avenida Dom Pedro I");
		objetoEndereco.setNumero(161);
		objetoEndereco.setCep("09991-000");
		objetoEndereco.setBairro("Conceição");
		objetoEndereco.setMunicipio("Diadema");
		objetoEndereco.setCidade("São Paulo");
		objetoEndereco.setNacionalidade("Brasileira");
		
		// getters Cliente
		System.out.println("Cliente");
		System.out.println("Nome: " + objetoCliente.getName() + 
				"\nCPF: " + objetoCliente.getCpf() + 
				"\nEndereço: " + objetoCliente.getEndereco());
		
		// getters ContaCorrente
		System.out.println("Conta Corrente");
		System.out.println("Saldo: " + objetoContaCorrente.getSaldo() + 
				"\nTitular: " + objetoContaCorrente.getTitular());
		
		// getters Endereco
		System.out.println("Endereço");
		System.out.println("Logradouro: " + objetoEndereco.getLogradouro() + 
				"\nNúmero: " + objetoEndereco.getNumero() + 
				"\nCEP: " + objetoEndereco.getCep() + 
				"\nBairro: " + objetoEndereco.getBairro() + 
				"\nMunicipio: " + objetoEndereco.getMunicipio() + 
				"\nCidade: " + objetoEndereco.getCidade() + 
				"\nNacionalidade: " + objetoEndereco.getNacionalidade());;

	}

}
