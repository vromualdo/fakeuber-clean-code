package br.com.vsromualdo.fakeuber.infrastructure.outbound.repository.schema;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "ride")
public class RideSchema {

	@Id
    @Column(name="ride_id")
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    
    @Column(name="passenger_id")
    private UUID passengerId;
    
    @Column(name="driver_id")
    private UUID driverId;
	
    @Column(name="status")
    private String status;
    
    @Column(name="fare")
    private BigDecimal fare;
    
    @Column(name="distance")
    private BigDecimal distance;
    
    @Column(name="from_lat")
    private BigDecimal fromLatitude;
    
    @Column(name="from_long")
    private BigDecimal fromLongitude;
    
    @Column(name="to_lat")
    private BigDecimal toLatitude;
    
    @Column(name="to_long")
    private BigDecimal toLongitude;
	
    @Column(name="date")
    private LocalDateTime date;

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public UUID getPassengerId() {
		return passengerId;
	}

	public void setPassengerId(UUID passengerId) {
		this.passengerId = passengerId;
	}

	public UUID getDriverId() {
		return driverId;
	}

	public void setDriverId(UUID driverId) {
		this.driverId = driverId;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
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

	public LocalDateTime getDate() {
		return date;
	}

	public void setDate(LocalDateTime date) {
		this.date = date;
	}
    
}
