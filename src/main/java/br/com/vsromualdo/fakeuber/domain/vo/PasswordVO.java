package br.com.vsromualdo.fakeuber.domain.vo;

public class PasswordVO {

	private String value;
	
	public PasswordVO(String password) {
		if (!this.isValidPassoword(password)){
	        throw new UnsupportedOperationException("Invalid Password");
	    }
		this.value = password;
	}
	
	private boolean isValidPassoword(String password) {
		return password != null && (password.length() > 5 && password.length() <= 20);
	}

	public String getValue() {
		return value;
	}
}
