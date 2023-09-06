package br.com.fiap.main;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Cliente;

public class TesteCliente {

	public static void main(String[] args) {
		// instanciar objeto
		Cliente objetoCliente = new Cliente();
		
		// setters
		objetoCliente.setNome(JOptionPane.showInputDialog("Digite o seu nome"));
		objetoCliente.setEmail(JOptionPane.showInputDialog("Digite seu e-mail"));
		objetoCliente.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade")));
		objetoCliente.setValorMensalidade(Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da mensalidade")));
		
		// getters
		System.out.println("Nome: " + objetoCliente.getNome() + 
				"\nE-mail: " + objetoCliente.getEmail() + 
				"\nIdade: " + objetoCliente.getIdade() + 
				"\nValor Mensalidade: " + objetoCliente.getValorMensalidade());

	}

}
