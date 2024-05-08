package br.com.fiap.main;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class TesteEscrever {

	public static void main(String[] args) {
		
		String [] linhas = new String[] {"Turma", "1TDSPB", "Top"};
		
		// caminho do arquivo
		
		String caminho = "C:\\Users\\Luna\\Desktop\\MinhaPasta\\MeuTexto2.txt";
		
		try {
			try (BufferedWriter carregarEscrita = new BufferedWriter(new FileWriter(caminho))){
				for (String linha : linhas) {
					carregarEscrita.write(linha);
					carregarEscrita.newLine();
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
