package br.com.global.beans;

public class Contato {

	private String email;
	private String cel;
	private String tel;

	public Contato() {
		super();
	}

	public Contato(String email, String cel, String tel) {
		super();
		this.email = email;
		this.cel = cel;
		this.tel = tel;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCel() {
		return cel;
	}

	public void setCel(String cel) {
		this.cel = cel;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

}
