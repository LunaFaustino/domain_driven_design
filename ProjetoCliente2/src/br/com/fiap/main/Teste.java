package br.com.fiap.main;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Cliente;
import br.com.fiap.beans.Colaborador;
import br.com.fiap.beans.Endereco;

public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cliente objCliente = new Cliente();
		Colaborador objColaborador = new Colaborador();
		Endereco objEndereco = new Endereco();
		
		// entrada cliente
		
		objCliente.setNome(JOptionPane.showInputDialog("Digite o nome"));
		objCliente.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Digite a idade")));
		
		// entrada endereço
		
		objEndereco.setLogradouro(JOptionPane.showInputDialog("Digite o logradouro"));
		objEndereco.setNumero(Integer.parseInt(JOptionPane.showInputDialog("Digite o número")));
		objEndereco.setCep(JOptionPane.showInputDialog("Digite o CEP"));
		
		objCliente.setEndereco(objEndereco);
		
		// entrada colaborador
		
		objColaborador.setNome(JOptionPane.showInputDialog("Digite o nome do colaborador"));
		objColaborador.setCargo(JOptionPane.showInputDialog("Digite o cargo"));
		objColaborador.setQtdHora(Double.parseDouble(JOptionPane.showInputDialog("Digite a quantidade de horas")));
		objColaborador.setValorHora(Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da hora")));
		
		// saídas
		
		System.out.println("INFORMAÇÕES CLIENTE\n\n" + "Nome do cliente: " + objCliente.getNome() + 
				"\nIdade do cliente: " + objCliente.getIdade() + 
				"\n\nINFORMAÇÕES ENDEREÇO\n\n" + "Logradouro: " + objCliente.getEndereco().getLogradouro() + 
				"\nNúmero: " + objCliente.getEndereco().getNumero() + 
				"\nCEP: " + objCliente.getEndereco().getCep() + 
				"\n\nINFORMAÇÕES COLABORADOR\n\n" + objColaborador.getNomeCargo() + 
				"\nQuantidade de Horas: " + objColaborador.getQtdHora() + 
				"\nValor da hora: " + objColaborador.getValorHora() + 
				"\nSalário: " + objColaborador.calcularSalario() + 
				"\nTaxa: " + objColaborador.pagarTaxa());

	}

}
