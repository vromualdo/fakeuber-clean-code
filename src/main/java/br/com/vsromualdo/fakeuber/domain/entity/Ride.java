package br.com.vsromualdo.fakeuber.domain.entity;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

import br.com.vsromualdo.fakeuber.domain.vo.Coord;

public class Ride {

    private String rideId;
    private String passengerId;
    private String driverId;
    private Coord fromLatLong;
    private Coord toLatLong;
    private BigDecimal fare;
    private BigDecimal distance;
    private String status;
    private LocalDateTime date;
    
    
	public Ride(String rideId, String passengerId, String driverId, BigDecimal fromLat, BigDecimal fromLong,
			BigDecimal toLat, BigDecimal toLong, BigDecimal fare, BigDecimal distance, String status,
			LocalDateTime date) {
		this.rideId = rideId;
		this.passengerId = passengerId;
		this.driverId = driverId;
		this.fromLatLong = new Coord(fromLat, fromLong);
		this.toLatLong = new Coord(toLat, toLong);
		this.fare = fare;
		this.distance = distance;
		this.status = status;
		this.date = date;
	}
	
	public static Ride create(String passengerId, BigDecimal fromLat, BigDecimal fromLong,
			BigDecimal toLat, BigDecimal toLong) {
		String rideId = UUID.randomUUID().toString();
		BigDecimal fare = BigDecimal.ZERO;
		BigDecimal distance = BigDecimal.ZERO;
		String status = "requested";
		LocalDateTime date = LocalDateTime.now();
        return new Ride(rideId, passengerId, null, fromLat, fromLong,
    			toLat, toLong, fare, distance, status, date);
	}

	public String getRideId() {
		return rideId;
	}

	public String getPassengerId() {
		return passengerId;
	}

	public String getDriverId() {
		return driverId;
	}

	public BigDecimal getFromLat() {
		return fromLatLong.getLatitude();
	}

	public BigDecimal getFromLong() {
		return fromLatLong.getLongitude();
	}

	public BigDecimal getToLat() {
		return toLatLong.getLatitude();
	}

	public BigDecimal getToLong() {
		return toLatLong.getLongitude();
	}

	public BigDecimal getFare() {
		return fare;
	}

	public BigDecimal getDistance() {
		return distance;
	}

	public String getStatus() {
		return status;
	}

	public LocalDateTime getDate() {
		return date;
	}
	
	
}
