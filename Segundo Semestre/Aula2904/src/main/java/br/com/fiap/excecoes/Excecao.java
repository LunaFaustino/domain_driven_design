package br.com.fiap.excecoes;

public class Excecao extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Excecao() {
		super();
	}

	public Excecao(Exception e) {
		super();
		if (e.getClass().toString().equals("class java.lang.ArithmeticException")) {
			System.out.println("Erro ao dividir por zero.");
		} else if (e.getClass().toString().equals("class java.util.InputMismatchException")) {
			System.out.println("Digite apenas números");
		} else {
			System.out.println("Falha desconhecida.");
			e.printStackTrace();
		}
	}

}
