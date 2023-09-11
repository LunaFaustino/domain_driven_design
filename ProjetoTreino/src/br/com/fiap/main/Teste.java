package br.com.fiap.main;

import br.com.fiap.beans.Carro;
import br.com.fiap.beans.Cliente;
import br.com.fiap.beans.Endereco;

public class Teste {

	public static void main(String[] args) {
		
		// instanciar objeto
		
		Cliente objetoCliente = new Cliente();
		Endereco objetoEndereco = new Endereco();
		Carro objetoCarro = new Carro();
		
		// setter Cliente
		
		objetoCliente.setNome("Luna");
		objetoCliente.setCpf("123.456.789");
		objetoCliente.setIdade(23);
		objetoCliente.setValor(123.456789);
		
		// setter Endereco
		
		objetoEndereco.setLogradouro("Avenida Dom Pedro I");
		objetoEndereco.setCep("09991-000");
		objetoEndereco.setNumero(161);
		objetoEndereco.setComplemento("Não tem");
		objetoEndereco.setBairro("Conceição");
		objetoEndereco.setMunicipio("Diadema");
		objetoEndereco.setEstado("São Paulo");
		
		// setter Carro
		
		objetoCarro.setMarca("Chevrolet");
		objetoCarro.setModelo("HB20");
		objetoCarro.setAno(2023);
		objetoCarro.setValor(85890);
		
		// getter Cliente
		
		System.out.println("Nome: " + objetoCliente.getNome() + 
				"\nCPF: " + objetoCliente.getCpf() + 
				"\nIdade: " + objetoCliente.getIdade() + 
				"\nValor Mensalidade: " + objetoCliente.getValor());
		
		// getter Endereco
		
		System.out.println("Logradouro: " + objetoEndereco.getLogradouro() + 
				"\nCEP: " + objetoEndereco.getCep() + 
				"\nNúmero: " + objetoEndereco.getNumero() + 
				"\nComplemento: " + objetoEndereco.getComplemento() + 
				"\nBairro: " + objetoEndereco.getBairro() + 
				"\nMunicípio: " + objetoEndereco.getMunicipio() + 
				"\nEstado: " + objetoEndereco.getEstado());
		
		// getter Carro
		
		System.out.println("Marca: " + objetoCarro.getMarca() + 
				"\nModelo: " + objetoCarro.getModelo() + 
				"\nAno: " + objetoCarro.getAno() + 
				"\nValor Carro: " + objetoCarro.getValor());

	}

}
