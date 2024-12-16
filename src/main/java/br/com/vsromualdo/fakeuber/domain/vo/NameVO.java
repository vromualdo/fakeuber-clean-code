package br.com.vsromualdo.fakeuber.domain.vo;

public class NameVO {

	private String value;
	
	public NameVO(String name) {
		if (!this.isValidName(name)) {
            throw new UnsupportedOperationException("Invalid name");
        }
		this.value = name;
	}

	public String getValue() {
		return value;
	}
	
	private boolean isValidName(String name) {
        return name.matches("([A-Z][a-z]* ([A-Z][a-z]*|[A-Z][a-z]* [A-Z][a-z]*))");
    }
}
