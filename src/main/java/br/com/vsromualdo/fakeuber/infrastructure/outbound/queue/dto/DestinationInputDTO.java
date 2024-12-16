package br.com.vsromualdo.fakeuber.infrastructure.outbound.queue.dto;

import java.math.BigDecimal;

public class DestinationInputDTO {
	
	private String rideId;
	private String passengerId;
    private String driverId;
    private BigDecimal fromLatitude;
	private BigDecimal fromLongitude;
    private BigDecimal toLatitude;
    private BigDecimal toLongitude;
    
    public DestinationInputDTO(String rideId, String passengerId, String driverId, BigDecimal fromLatitude,
			BigDecimal fromLongitude, BigDecimal toLatitude, BigDecimal toLongitude) {
		super();
		this.rideId = rideId;
		this.passengerId = passengerId;
		this.driverId = driverId;
		this.fromLatitude = fromLatitude;
		this.fromLongitude = fromLongitude;
		this.toLatitude = toLatitude;
		this.toLongitude = toLongitude;
	}
	public String getRideId() {
		return rideId;
	}
	public void setRideId(String rideId) {
		this.rideId = rideId;
	}
	public String getPassengerId() {
		return passengerId;
	}
	public void setPassengerId(String passengerId) {
		this.passengerId = passengerId;
	}
	public String getDriverId() {
		return driverId;
	}
	public void setDriverId(String driverId) {
		this.driverId = driverId;
	}
	public BigDecimal getFromLatitude() {
		return fromLatitude;
	}
	public void setFromLatitude(BigDecimal fromLatitude) {
		this.fromLatitude = fromLatitude;
	}
	public BigDecimal getFromLongitude() {
		return fromLongitude;
	}
	public void setFromLongitude(BigDecimal fromLongitude) {
		this.fromLongitude = fromLongitude;
	}
	public BigDecimal getToLatitude() {
		return toLatitude;
	}
	public void setToLatitude(BigDecimal toLatitude) {
		this.toLatitude = toLatitude;
	}
	public BigDecimal getToLongitude() {
		return toLongitude;
	}
	public void setToLongitude(BigDecimal toLongitude) {
		this.toLongitude = toLongitude;
	}
	@Override
	public String toString() {
		return "DestinationInputDTO [rideId=" + rideId + ", passengerId=" + passengerId + ", driverId=" + driverId
				+ ", fromLatitude=" + fromLatitude + ", fromLongitude=" + fromLongitude + ", toLatitude=" + toLatitude
				+ ", toLongitude=" + toLongitude + "]";
	}
	
    
    

}
