package br.com.fiap.main;

import java.io.IOException;

import javax.swing.JOptionPane;

import org.apache.http.client.ClientProtocolException;

import br.com.fiap.model.Personagem;
import br.com.fiap.services.HarryPotter;

public class Teste {
    public static void main(String[] args) throws ClientProtocolException, IOException {
        HarryPotter hp = new HarryPotter();
        
        String nomePersonagem = JOptionPane.showInputDialog("Digite o nome e sobrenome do personagem de Harry Potter");
        
        Personagem personagem = hp.getPersonagem(nomePersonagem);
        
        if (personagem != null) {
            System.out.println(personagem);
        } else {
            System.out.println("Personagem não encontrado."); // se o resultado for null, definimos nossa mensagem de erro
        }
    }
}


