package br.com.fiap.teste;

import java.util.ArrayList;
import java.util.List;

import br.com.fiap.beans.Professor;

public class TesteArrayListProf {

	public static void main(String[] args) {
		
		Professor professorUm = new Professor("Ronqui", 35, 2500);
		Professor professorDois = new Professor("Desiderio", 39, 3658);
		
		List<Professor> professores = new ArrayList<Professor>();
		professores.add(professorUm);
		professores.add(professorDois);
		
		for(Professor professor : professores) {
			System.out.println(
			professor.getNome() + " " + 
			professor.getIdade() + " " + 
			professor.getSalario() + "\n"   
					);
		}

	}

}
