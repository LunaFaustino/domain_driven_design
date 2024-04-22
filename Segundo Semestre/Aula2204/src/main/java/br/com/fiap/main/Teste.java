package br.com.fiap.main;

import java.io.IOException;

import javax.swing.JOptionPane;

import org.apache.http.client.ClientProtocolException;

import br.com.fiap.beans.Cliente;
import br.com.fiap.model.Endereco;
import br.com.fiap.services.ViaCepService;

public class Teste {

	public static void main(String[] args) throws ClientProtocolException, IOException {
		
		// instanciar objeto
		ViaCepService viaCep = new ViaCepService();
		
		Cliente cliente = new Cliente();

		String cep = JOptionPane.showInputDialog("Digite o CEP");

		Endereco endereco = viaCep.getEndereco(cep);

		cliente.setEndereco(endereco);
		cliente.setCodigo(Integer.parseInt(JOptionPane.showInputDialog("Digite o código")));
		cliente.setName(JOptionPane.showInputDialog("Digite o nome"));
		cliente.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Digite a idade")));
		cliente.setRenda(Double.parseDouble(JOptionPane.showInputDialog("Digite a renda")));
		
		
		System.out.println(cliente);
		

	}

}
