package br.com.salesforce.main;

import java.sql.SQLException;

import javax.swing.JOptionPane;

import br.com.salesfoce.beans.ClientePf;
import br.com.salesforce.dao.ClientePfDao;

public class Menu {
	
	static String texto (String j) {
		return JOptionPane.showInputDialog(j);
	}
	
	static int inteiro (String j) {
		return Integer.parseInt(JOptionPane.showInputDialog(j));
	}
	
	static double real (String j) {
		return Double.parseDouble(JOptionPane.showInputDialog(j));
	}

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		ClientePfDao pfDao = new ClientePfDao();
		
		ClientePf objPf = new ClientePf();
		
		String opcao;
		
		while(true) {
			opcao = JOptionPane.showInputDialog("Digite uma opção: \n1 - Cadastrar cliente \n2 - Sair");
			
			switch(opcao) {
				case "1":
					do {
						
						objPf.setCpf(texto("Informe o CPF do cliente"));
						objPf.setProfissao(texto("Informe a profissão"));
						objPf.setEscolaridade(texto("Informe a escolaridade"));
						objPf.setDtNascimento(texto("Informe a data de nascimento"));
						objPf.setSexo(texto("Digite o sexo"));
						
						JOptionPane.showMessageDialog(null, pfDao.inserir(objPf));
						
					}while(JOptionPane.showConfirmDialog(null, "Adicionar outro cadastro?", "CADASTRO DE CLIENTES", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE)==0);
						
				case "2":
					JOptionPane.showMessageDialog(null, "Saindo do programa");
					System.exit(0);
				default:
					System.out.println("Digite 1, 2 ou 3");
				
					
						
			}
		}
		

	}

}
