package br.com.vsromualdo.fakeuber.infrastructure.inbound.controller.ride.dto;

import java.math.BigDecimal;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RideRequestDTO {

	private String passengerId;
	private BigDecimal fromLat;
	private BigDecimal fromLong;
	private BigDecimal toLat;
	private BigDecimal toLong;
	
}
