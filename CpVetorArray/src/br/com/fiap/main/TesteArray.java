package br.com.fiap.main;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Aluno;

public class TesteArray {
	
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
		
		List<Aluno> listaAluno = new ArrayList<Aluno>();
		
		Aluno objAluno;
		
		do {
			
			objAluno = new Aluno();
			objAluno.setRm(inteiro("Digite o RM"));
			objAluno.setNome(texto("Digite o nome"));
			objAluno.setTurma(texto("Digite a turma"));
			objAluno.setNota(real("Digite a nota"));
			
			listaAluno.add(objAluno);
			
		} while (JOptionPane.showConfirmDialog(null, "Gostaria de cadastrar outro aluno?", "SISTEMA DE ALUNOS", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE)==0);
		
		for (Aluno a : listaAluno) {
			System.out.println(
					"\n\nALUNOS CADASTRADOS\n\n" + 
			"RM: " + a.getRm() + 
			"\nNome: " + a.getNome() + 
			"\nTurma: " + a.getTurma() + 
			"\nNota: " + a.getNota()
					);
		}
	}

}
