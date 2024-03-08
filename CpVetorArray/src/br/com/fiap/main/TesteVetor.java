package br.com.fiap.main;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Aluno;

public class TesteVetor {
	
	static String texto(String j) {
		return JOptionPane.showInputDialog(j);
	}
	
	static int inteiro(String j) {
		return Integer.parseInt(JOptionPane.showInputDialog(j));
	}
	
	static double real(String j) {
		return Double.parseDouble(JOptionPane.showInputDialog(j));
	}
	
	public static void main(String[] args) {
		
		Aluno[] vetorAluno = new Aluno[2];
		
		int indice = 0;
		
		do {
			
			vetorAluno[indice] = new Aluno();
			vetorAluno[indice].setRm(inteiro("Digite o RM"));
			vetorAluno[indice].setNome(texto("Digite o nome"));
			vetorAluno[indice].setTurma(texto("Digite a turma"));
			vetorAluno[indice].setNota(real("Digite a nota"));
			
			indice++;
			
		} while (JOptionPane.showConfirmDialog(null, "Gostaria de cadastrar outro aluno?", "SISTEMA DE ALUNOS", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE)==0);
		
		for (int contador = 0; contador < indice; contador++) {
			
			System.out.println("\n\nALUNOS CADASTRADOS\n\n" + 
					"RM: " + vetorAluno[contador].getRm() + 
					"\nNome: " + vetorAluno[contador].getNome() + 
					"\nTurma: " + vetorAluno[contador].getTurma() + 
					"\nNota: " + vetorAluno[contador].getNota()
					);
			
		}
		
	}

}
