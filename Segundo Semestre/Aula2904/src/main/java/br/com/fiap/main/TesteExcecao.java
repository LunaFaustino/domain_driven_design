package br.com.fiap.main;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TesteExcecao {

	public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in);

		try {

			int dividendo = leitor.nextInt();
			int divisor = leitor.nextInt();

			int resultado = dividendo / divisor;

			System.out.println(resultado);

		} catch (ArithmeticException e) {
			System.out.println("Falha ao dividir por 0");
		} catch (InputMismatchException e) {
			System.out.println("Insira somente números");
		} finally {
			System.out.println("Passei por aqui");
			leitor.close();
		}

	}

}
