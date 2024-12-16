package br.com.vsromualdo.fakeuber.infrastructure.mapper;

import br.com.vsromualdo.fakeuber.domain.Address;
import br.com.vsromualdo.fakeuber.infrastructure.outbound.integration.dto.ViaCepOutputDTO;

public final class AddressMapper {
    
	private AddressMapper() {
    }
    
	public static Address addressIntegrationToModel(ViaCepOutputDTO cepOutputDTO){
        if(cepOutputDTO == null){
            return null;
        }
        return new Address(
        		cepOutputDTO.getCep(), 
        		cepOutputDTO.getLocalidade(), 
        		cepOutputDTO.getComplemento(), 
        		cepOutputDTO.getUnidade(), 
        		cepOutputDTO.getBairro(), 
        		cepOutputDTO.getLocalidade(),
        		cepOutputDTO.getUf(), 
        		cepOutputDTO.getEstado(), 
        		cepOutputDTO.getRegiao()
        		);
    }
}
