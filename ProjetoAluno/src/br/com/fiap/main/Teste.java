package br.com.fiap.main;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Aluno;
import br.com.fiap.beans.Colaborador;
import br.com.fiap.beans.Endereco;

public class Teste {

	public static void main(String[] args) {

		// int rm, String nome, String turma, double nota
		Aluno objAluno = new Aluno(
				Integer.parseInt(JOptionPane.showInputDialog("Digite o RM do aluno")),
				JOptionPane.showInputDialog("Digite o nome do aluno"),
				JOptionPane.showInputDialog("Digite a turma do aluno"),
				Double.parseDouble(JOptionPane.showInputDialog("Digite a nota do aluno"))
				);
		
		// String logradouro, String cep, int numero
		Endereco objEndereco = new Endereco(
				JOptionPane.showInputDialog("Digite o logradouro"),
				JOptionPane.showInputDialog("Digite o CEP"),
				Integer.parseInt(JOptionPane.showInputDialog("Digite o número"))
				);
		
		objAluno.setEndereco(objEndereco);

		// String nome, String cargo, double salario
		Colaborador objColaborador = new Colaborador(
				JOptionPane.showInputDialog("Digite o nome do colaborador"),
				JOptionPane.showInputDialog("Digite o cargo"),
				Double.parseDouble(JOptionPane.showInputDialog("Digite o salário"))
				);

		// saida
		
	System.out.println("INFORMAÇÕES ALUNO" + 
				"\n\nRM: " + objAluno.getRm() + 
				"\nNome: " + objAluno.getNome() + 
				"\nTurma: " + objAluno.getTurma() + 
				"\nNota: " + objAluno.getNota()  + 
				"\n\nINFORMAÇÕES ENDEREÇO DO ALUNO" +
				"\n\nLogradouro: " + objAluno.getEndereco().getLogradouro() + 
				"\nCEP: " + objAluno.getEndereco().getCep() + 
				"\nNúmero: " + objAluno.getEndereco().getNumero() + 
				"\n\nINFORMAÇÕES DO COLABORADOR" + 
				"\n\nNome do colaborador: " + objColaborador.getNome() + 
				"\nCargo: " + objColaborador.getCargo() + 
				"\nSalário: " + objColaborador.getSalario());

	}

}
