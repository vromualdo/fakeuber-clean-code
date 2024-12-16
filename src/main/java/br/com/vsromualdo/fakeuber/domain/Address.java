package br.com.vsromualdo.fakeuber.domain;

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
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getComplement() {
		return complement;
	}
	public void setComplement(String complement) {
		this.complement = complement;
	}
	public String getUnit() {
		return unit;
	}
	public void setUnit(String unit) {
		this.unit = unit;
	}
	public String getNeighborhood() {
		return neighborhood;
	}
	public void setNeighborhood(String neighborhood) {
		this.neighborhood = neighborhood;
	}
	public String getLocality() {
		return locality;
	}
	public void setLocality(String locality) {
		this.locality = locality;
	}
	public String getFederalUnitCode() {
		return federalUnitCode;
	}
	public void setFederalUnitCode(String federalUnitCode) {
		this.federalUnitCode = federalUnitCode;
	}
	public String getFederalUnit() {
		return federalUnit;
	}
	public void setFederalUnit(String federalUnit) {
		this.federalUnit = federalUnit;
	}
	public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		this.region = region;
	}
	
	
}
