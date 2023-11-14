package br.com.fiap.main;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Credito;
import br.com.fiap.beans.Debito;

public class Teste {
	
	// string 
	static String texto(String j) {
		return JOptionPane.showInputDialog(j);
	}
	
	//int
	static int inteiro(String j) {
		return Integer.parseInt(JOptionPane.showInputDialog(j));
	}
	
	//double
	static double real(String j) {
		return Double.parseDouble(JOptionPane.showInputDialog(j));
	}

	public static void main(String[] args) {
		
		// String nome, String bandeira, int numero, int cvv, double saldo, double parcela
		Credito objC = new Credito(
				texto("Digite o nome que consta no cartão de crédito"),
				texto("Digite a bandeira do cartão de crédito"),
				inteiro("Digite o número do cartão de crédito"),
				inteiro("Digite o CVV do cartão de crédito"),
				real("Qual o saldo da conta?"),
				real("Qual o valor da parcela?")
				);
		
		// String nome, String bandeira, int numero, int cvv, double saldo, double consignado
		Debito objD = new Debito(
				texto("Digite o nome que consta no cartão"),
				texto("Digite a bandeira do cartão"),
				inteiro("Digite o número do cartão"),
				inteiro("Digite o CVV"),
				real("Qual o saldo da conta?"),
				real("Qual o valor do consignado?")
				);
		
		System.out.println("INFORMAÇÕES CARTÃO DE CRÉDITO\n\n" + 
		"Nome: " + objC.getNome() + 
		"\nBandeira: " + objC.getBandeira() + 
		"\nNúmero: " + objC.getNumero() + 
		"\nCVV: " + objC.getCvv() + 
		"\nSaldo: " + objC.getSaldo() + 
		"\nValor da Parcela: " + objC.getParcela() + 
		"\n\nINFORMAÇÕES CARTÃO DE DÉBITO\n\n" + 
		"Nome: " + objD.getNome() + 
		"\nBandeira: " + objD.getBandeira() + 
		"\nNúmero: " + objD.getNumero() + 
		"\nCVV: " + objD.getCvv() + 
		"\nSaldo: " + objD.getSaldo() + 
		"\nConsignado: " + objD.getConsignado() + 
		"\n\nLIMITES\n\n" + 
		"Crédito: " + objC.limite() + 
		"\nDébito: " + objD.limite()
				);

	}

}
