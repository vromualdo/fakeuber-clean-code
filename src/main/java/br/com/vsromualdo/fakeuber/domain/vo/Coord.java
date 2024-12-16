package br.com.vsromualdo.fakeuber.domain.vo;

import java.math.BigDecimal;

public class Coord {
	
	private BigDecimal latitude;
	private BigDecimal longitude;
	
	public Coord(BigDecimal latitude, BigDecimal longitude) {
		if (!this.isLatidudeValid(latitude)){
            throw new UnsupportedOperationException("Invalid latitude");
        }
		if (!this.isLongitudeValid(longitude)){
            throw new UnsupportedOperationException("Invalid longitued");
        }
		this.latitude = latitude;
		this.longitude = longitude;
	}
	
	private boolean isLatidudeValid(BigDecimal latitude) {
		return (latitude.compareTo(BigDecimal.valueOf(-90)) == -1 || latitude.compareTo(BigDecimal.valueOf(90)) == 1 );
	}
	private boolean isLongitudeValid(BigDecimal longitude) {
		return (longitude.compareTo(BigDecimal.valueOf(-180)) == -1 || latitude.compareTo(BigDecimal.valueOf(180)) == 1 );
	}
	
	public BigDecimal getLatitude() {
		return latitude;
	}
	public BigDecimal getLongitude() {
		return longitude;
	}
	
}
