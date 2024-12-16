package br.com.vsromualdo.fakeuber.infrastructure.inbound.controller.ride.dto;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RideResponseDTO {

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
	
}
