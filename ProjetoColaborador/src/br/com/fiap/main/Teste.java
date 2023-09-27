package br.com.fiap.main;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Colaborador;
import br.com.fiap.beans.Endereco;

public class Teste {

	public static void main(String[] args) {
		// instanciar obj
		
		Colaborador objColaborador = new Colaborador();
		Endereco objEndereco = new Endereco();
		
		// entrada colaborador
		
		objColaborador.setNome(JOptionPane.showInputDialog("Digite o nome"));
		objColaborador.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Digite a idade")));
		objColaborador.setQtHoras(Double.parseDouble(JOptionPane.showInputDialog("Digite a quantidade de horas trabalhadas.")));
		objColaborador.setValorHora(Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da hora trabalhada")));
		
		// entrada endereco
		
		objEndereco.setLougradouro(JOptionPane.showInputDialog("Digite o lougradouro"));
		objEndereco.setNumero(Integer.parseInt(JOptionPane.showInputDialog("Digite o número da  casa")));
		objEndereco.setCep(JOptionPane.showInputDialog("Digite o CEP"));
		
		objColaborador.setEndereco(objEndereco);
		
		// saidas
		
		System.out.println(objColaborador.getNomeIdade() + 
				"\nHoras trabalhadas: " + objColaborador.getQtHoras() +
				"\nValor da Hora: " + objColaborador.getValorHora() +
				"\nSalário: " + objColaborador.calcularSalario());
		

	}

}
