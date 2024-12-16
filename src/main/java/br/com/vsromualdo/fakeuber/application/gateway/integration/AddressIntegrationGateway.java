package br.com.vsromualdo.fakeuber.application.gateway.integration;

import br.com.vsromualdo.fakeuber.domain.entity.Address;

public interface AddressIntegrationGateway {

	public Address getAddressByZipCode(String zipCode);
}
