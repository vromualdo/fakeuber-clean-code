package br.com.vsromualdo.fakeuber.infrastructure.inbound.listener.bankinvoice.dto;

import lombok.Data;

@Data
public class SegmentADTO {

	private String bank;
	private String account;
	private String amount;
	
	
}
