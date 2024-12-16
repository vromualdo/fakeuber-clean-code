package br.com.vsromualdo.fakeuber.domain.vo;

public class ZipCodeVO {

	private String value;

	public ZipCodeVO(String zipCode) {
		super();
		if (!isValidZipCode(zipCode)){
            throw new UnsupportedOperationException("Invalid zip code");
        }
		this.value = zipCode;
	}

	public String getValue() {
		return value;
	}
	
	private boolean isValidZipCode(String zipCode) {
        return zipCode.matches("[0-9]{8}");
    }
	
}
