package br.com.vsromualdo.fakeuber.domain.entity;

public class Address {

	private String zipCode;
	private String address;
	private String complement;
	private String unit;
	private String neighborhood;
	private String locality;
	private String federalUnitCode;
	private String federalUnit;
	private String region;
	
	public Address() {
	}
	public Address(String zipCode, String address, String complement, String unit, String neighborhood, String locality,
			String federalUnitCode, String federalUnit, String region) {
		this.zipCode = zipCode;
		this.address = address;
		this.complement = complement;
		this.unit = unit;
		this.neighborhood = neighborhood;
		this.locality = locality;
		this.federalUnitCode = federalUnitCode;
		this.federalUnit = federalUnit;
		this.region = region;
	}
	public String getZipCode() {
		return zipCode;
	}
	public String getAddress() {
		return address;
	}
	public String getComplement() {
		return complement;
	}
	public String getUnit() {
		return unit;
	}
	public String getNeighborhood() {
		return neighborhood;
	}
	public String getLocality() {
		return locality;
	}
	public String getFederalUnitCode() {
		return federalUnitCode;
	}
	public String getFederalUnit() {
		return federalUnit;
	}
	public String getRegion() {
		return region;
	}

	
}
