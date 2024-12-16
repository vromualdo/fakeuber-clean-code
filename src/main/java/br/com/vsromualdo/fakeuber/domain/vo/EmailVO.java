package br.com.vsromualdo.fakeuber.domain.vo;

public class EmailVO {

	private String value;
	
	public EmailVO(String email) {
		if (!this.isValidEmail(email)){
	        throw new UnsupportedOperationException("Invalid email");
	    }
		this.value = email;
	}

	public String getValue() {
		return value;
	}
	
	private boolean isValidEmail (String email) {
        return email.matches("^(.+)@(.+)$");
    }
	
}
