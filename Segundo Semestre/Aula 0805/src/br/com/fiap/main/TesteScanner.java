package br.com.fiap.main;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TesteScanner {

	public static void main(String[] args) throws FileNotFoundException {
		
		// caminho do arquivo
		
		File arquivo = new File("C:\\Users\\Luna\\Desktop\\MinhaPasta\\MeuTexto.txt");
		
		Scanner leitor = new Scanner(arquivo);
		
		while (leitor.hasNextLine()) {
			System.out.println(leitor.nextLine());;
			
		}
		
		leitor.close();
		
		

	}

}
