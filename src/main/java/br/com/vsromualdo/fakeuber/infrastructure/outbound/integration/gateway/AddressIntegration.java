package br.com.vsromualdo.fakeuber.infrastructure.outbound.integration.gateway;

import org.springframework.stereotype.Component;

import br.com.vsromualdo.fakeuber.application.gateway.integration.AddressIntegrationGateway;
import br.com.vsromualdo.fakeuber.domain.Address;
import br.com.vsromualdo.fakeuber.infrastructure.mapper.AddressMapper;
import br.com.vsromualdo.fakeuber.infrastructure.outbound.integration.ViaCepClient;
import br.com.vsromualdo.fakeuber.infrastructure.outbound.integration.dto.ViaCepOutputDTO;

@Component
public class AddressIntegration implements AddressIntegrationGateway {

	
	private final ViaCepClient viaCepClient;
	
	public AddressIntegration(ViaCepClient viaCepClient) {
		this.viaCepClient = viaCepClient;
	}

	@Override
	public Address getAddressByZipCode(String zipCode) {
		ViaCepOutputDTO outputDTO = this.viaCepClient.getAddress(zipCode);
		return AddressMapper.addressIntegrationToModel(outputDTO);
	}

}
