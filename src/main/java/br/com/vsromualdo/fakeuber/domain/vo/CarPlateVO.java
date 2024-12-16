package br.com.vsromualdo.fakeuber.domain.vo;

public class CarPlateVO {

	private String value;

	public CarPlateVO(String carPlate) {
		if (carPlate != null && !this.isValidCarPlate(carPlate)){
            throw new UnsupportedOperationException("Invalid car plate");
        }
		this.value = carPlate;
	}

	private boolean isValidCarPlate (String carPlate) {
        return carPlate.matches("/[A-Z]{3}[0-9]{4}/");
    }

	public String getValue() {
		return value;
	}
	
}
