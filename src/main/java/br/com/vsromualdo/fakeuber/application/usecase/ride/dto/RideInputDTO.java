package br.com.vsromualdo.fakeuber.application.usecase.ride.dto;

import java.math.BigDecimal;

public class RideInputDTO {

	private String passengerId;
	private BigDecimal fromLat;
	private BigDecimal fromLong;
	private BigDecimal toLat;
	private BigDecimal toLong;
	
	public String getPassengerId() {
		return passengerId;
	}
	public void setPassengerId(String passengerId) {
		this.passengerId = passengerId;
	}
	public BigDecimal getFromLat() {
		return fromLat;
	}
	public void setFromLat(BigDecimal fromLat) {
		this.fromLat = fromLat;
	}
	public BigDecimal getFromLong() {
		return fromLong;
	}
	public void setFromLong(BigDecimal fromLong) {
		this.fromLong = fromLong;
	}
	public BigDecimal getToLat() {
		return toLat;
	}
	public void setToLat(BigDecimal toLat) {
		this.toLat = toLat;
	}
	public BigDecimal getToLong() {
		return toLong;
	}
	public void setToLong(BigDecimal toLong) {
		this.toLong = toLong;
	}
	
	
}
