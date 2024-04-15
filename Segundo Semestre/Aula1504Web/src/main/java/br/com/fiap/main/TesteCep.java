package br.com.fiap.main;

import java.io.IOException;

import javax.swing.JOptionPane;

import org.apache.http.client.ClientProtocolException;

import br.com.fiap.model.Endereco;
import br.com.fiap.services.ViaCep;

public class TesteCep {

	public static void main(String[] args) throws ClientProtocolException, IOException {
		
		// instanciar objeto
		ViaCep viaCep = new ViaCep();

		String cep = JOptionPane.showInputDialog("Digite o CEP");

		Endereco endereco = viaCep.getEndereco(cep);

		System.out.println(endereco);
		
		System.out.println(endereco.getLogradouro());

	}

}
