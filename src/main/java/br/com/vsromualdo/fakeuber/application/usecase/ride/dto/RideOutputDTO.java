package br.com.vsromualdo.fakeuber.application.usecase.ride.dto;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class RideOutputDTO {

	private String rideId;
	private String passengerId;
	private String passengerName;
	private String driverId;
	private BigDecimal fromLat;
	private BigDecimal fromLong;
	private BigDecimal toLat;
	private BigDecimal toLong;
	private BigDecimal fare;
	private BigDecimal distance;
	private String status;
	private LocalDateTime date;
	
	public RideOutputDTO(String rideId) {
		super();
		this.rideId = rideId;
	}
	
	public RideOutputDTO(String rideId, String passengerId, String passengerName, String driverId, BigDecimal fromLat,
			BigDecimal fromLong, BigDecimal toLat, BigDecimal toLong, BigDecimal fare, BigDecimal distance,
			String status, LocalDateTime date) {
		super();
		this.rideId = rideId;
		this.passengerId = passengerId;
		this.passengerName = passengerName;
		this.driverId = driverId;
		this.fromLat = fromLat;
		this.fromLong = fromLong;
		this.toLat = toLat;
		this.toLong = toLong;
		this.fare = fare;
		this.distance = distance;
		this.status = status;
		this.date = date;
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
	public String getPassengerName() {
		return passengerName;
	}
	public void setPassengerName(String passengerName) {
		this.passengerName = passengerName;
	}
	public String getDriverId() {
		return driverId;
	}
	public void setDriverId(String driverId) {
		this.driverId = driverId;
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
	public BigDecimal getFare() {
		return fare;
	}
	public void setFare(BigDecimal fare) {
		this.fare = fare;
	}
	public BigDecimal getDistance() {
		return distance;
	}
	public void setDistance(BigDecimal distance) {
		this.distance = distance;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public LocalDateTime getDate() {
		return date;
	}
	public void setDate(LocalDateTime date) {
		this.date = date;
	}
}
