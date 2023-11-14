package br.com.fiap.teste;

import br.com.fiap.beans.Aluno;

public class Teste {

	public static void main(String[] args) {
		
		Aluno aluno = new Aluno();
		
		aluno.setNome("Luna");
		aluno.setIdade(20);
		aluno.setRm(552473);
		
		//instanciar aluno com construtor cheio
		
		Aluno alunoDois = new Aluno("Karina", 35, 1655);
		
		
	}

}
