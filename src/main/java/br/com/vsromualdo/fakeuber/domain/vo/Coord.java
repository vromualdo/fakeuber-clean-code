package br.com.vsromualdo.fakeuber.domain.vo;

import java.math.BigDecimal;

public class Coord {
	
	private BigDecimal latitude;
	private BigDecimal longitude;
	
	public Coord(BigDecimal latitude, BigDecimal longitude) {
		if (!this.isValidLatidude(latitude)){
            throw new UnsupportedOperationException("Invalid latitude");
        }
		if (!this.isValidLongitude(longitude)){
            throw new UnsupportedOperationException("Invalid longitued");
        }
		this.latitude = latitude;
		this.longitude = longitude;
	}
	
	private boolean isValidLatidude(BigDecimal latitude) {
		return (latitude.compareTo(BigDecimal.valueOf(-90)) == -1 || latitude.compareTo(BigDecimal.valueOf(90)) == 1 );
	}
	private boolean isValidLongitude(BigDecimal longitude) {
		return (longitude.compareTo(BigDecimal.valueOf(-180)) == -1 || latitude.compareTo(BigDecimal.valueOf(180)) == 1 );
	}
	
	public BigDecimal getLatitude() {
		return latitude;
	}
	public BigDecimal getLongitude() {
		return longitude;
	}
	
}
