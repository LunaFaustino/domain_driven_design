package br.com.fiap.main;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Cliente;
import br.com.fiap.beans.Colaborador;
import br.com.fiap.beans.Endereco;

public class Teste {

	public static void main(String[] args) {
		// instanciar
		Cliente objetoCliente = new Cliente();
		Colaborador objetoColaborador = new Colaborador();
		Endereco objetoEndereco = new Endereco();

		// entradas cliente

		objetoCliente.setNome(JOptionPane.showInputDialog("Qual o seu nome?"));
		objetoCliente.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Qual a sua idade?")));

		// entradas endereço

		objetoEndereco.setLougradouro(JOptionPane.showInputDialog("Qual seu lougradouro?"));
		objetoEndereco.setNumero(Integer.parseInt(JOptionPane.showInputDialog("Qual o número da sua residência?")));
		
		objetoCliente.setEndereco(objetoEndereco);
		
		// entradas colaborador
		
		objetoColaborador.setNome(JOptionPane.showInputDialog("Qual o nome do colaborador?"));
		objetoColaborador.setSalario(Double.parseDouble(JOptionPane.showInputDialog("Qual o salário?")));
		
		// saidas
		
		System.out.println("Informações Cliente" + 
		"\nNome: " + objetoCliente.getNome() +
		"\nIdade: " + objetoCliente.getIdade() + 
		"\n\nInformações Endereço" + 
		"\nLougradouro: " + objetoCliente.getEndereco().getLougradouro() + 
		"\nNúmero: " + objetoCliente.getEndereco().getNumero() + 
		"\n\nInformações Colaborador" + 
		objetoColaborador.getTudoColaborador());
		
		System.out.println("TAXA: \n" + objetoColaborador.pagarTaxa());

	}

}
