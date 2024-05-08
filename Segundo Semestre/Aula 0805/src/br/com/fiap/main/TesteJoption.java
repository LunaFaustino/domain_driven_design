package br.com.fiap.main;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import javax.swing.JOptionPane;

public class TesteJoption {

	public static void main(String[] args) throws IOException {
		
		// caminho do arquivo
		
		Path arquivo = Paths.get("C:\\Users\\Luna\\Desktop\\MinhaPasta\\MeuTexto.txt");
		
		byte[] texto = Files.readAllBytes(arquivo);
		
		String leitor = new String(texto);
		
		JOptionPane.showMessageDialog(null, leitor);

	}

}
