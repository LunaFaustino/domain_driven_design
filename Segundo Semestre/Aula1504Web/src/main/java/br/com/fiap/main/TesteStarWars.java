package br.com.fiap.main;

import java.io.IOException;

import javax.swing.JOptionPane;

import org.apache.http.client.ClientProtocolException;

import br.com.fiap.model.Personagem;
import br.com.fiap.services.StarWarsAPI;

public class TesteStarWars {

	public static void main(String[] args) throws ClientProtocolException, IOException {
		
		StarWarsAPI starwars = new StarWarsAPI();
		
		String id = JOptionPane.showInputDialog("Digite o número do personagem");
		
		Personagem personagem = starwars.getPersonagem(id);
		
		System.out.println(personagem);

	}

}
