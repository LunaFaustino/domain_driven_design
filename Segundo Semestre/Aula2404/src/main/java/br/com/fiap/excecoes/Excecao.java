package br.com.fiap.excecoes;

import java.util.InputMismatchException;

public class Excecao extends Exception{
	

	private static final long serialVersionUID = 1L;

	public Excecao() {
		super();
		System.out.println("Mensagem de falha");
	}
	
	public Excecao(ArithmeticException e) {
		super();
		System.out.println("Erro ao dividir por zero");
	}
	
	public Excecao(InputMismatchException e) {
		super();
		System.out.println("Digite apenas números!");
	}
	
	public Excecao (Exception e) {
		super();
		if (e.getClass().toString().equals("class java.util.InputMismatchException")) {
			System.out.println("Falha na entrada, digite números.");
		} else if (e.getClass().toString().equals("class java.lang.ArithmeticException")) {
			System.out.println("Falha ao dividir por zero.");
		} else {
			System.out.println("Falha desconhecida.");
		}
	}

}
