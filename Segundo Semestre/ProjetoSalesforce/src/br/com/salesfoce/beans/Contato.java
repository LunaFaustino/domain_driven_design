package br.com.salesfoce.beans;

public class Contato {

	private String telCelular;
	private String telFixo;
	private String email;
	
	public Contato() {
		super();
	}
	
	public Contato(String telCelular, String telFixo, String email) {
		super();
		this.telCelular = telCelular;
		this.telFixo = telFixo;
		this.email = email;
	}
	
	public String getTelCelular() {
		return telCelular;
	}
	public void setTelCelular(String telCelular) {
		this.telCelular = telCelular;
	}
	public String getTelFixo() {
		return telFixo;
	}
	public void setTelFixo(String telFixo) {
		this.telFixo = telFixo;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	

}
