package br.com.fiap.teste;

import java.util.ArrayList;
import java.util.List;

import br.com.fiap.beans.Aluno;

public class TesteArrayList {

	public static void main(String[] args) {
		
		Aluno alunoUm = new Aluno("Rafael", 37, 1153);
		Aluno alunoDois = new Aluno("Karina", 35, 1655);
		Aluno alunoTres = new Aluno("Leonardo", 21, 1723);
		
		List<Aluno> alunos = new ArrayList<Aluno>();
		alunos.add(alunoUm);
		alunos.add(alunoDois);
		alunos.add(alunoTres);
		
		for (Aluno aluno : alunos) {
			System.out.println(
			aluno.getNome() + " " + 
			aluno.getIdade() + " " + 
			aluno.getRm() + "\n"		
					);
		}

	}

}
