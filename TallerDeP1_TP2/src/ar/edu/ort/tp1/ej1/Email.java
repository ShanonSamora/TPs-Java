package ar.edu.ort.tp1.ej1;

public class Email {
	private String cuenta;
	private String dominio;
	
	public Email(String email) {
		String[] mail;
		mail = email.split("@");
		cuenta = mail[0];
		dominio = mail[1];
	}
	public String getMail() {
		return cuenta + "@" + dominio;
	}
}
