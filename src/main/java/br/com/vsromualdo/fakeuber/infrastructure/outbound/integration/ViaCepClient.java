package br.com.vsromualdo.fakeuber.infrastructure.outbound.integration;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import br.com.vsromualdo.fakeuber.infrastructure.outbound.integration.dto.ViaCepOutputDTO;

@FeignClient(name = "viaCep", url = "${integration.client.viacep}")
public interface ViaCepClient {

	@GetMapping("/{cep}/json")
	public ViaCepOutputDTO getAddress(@RequestParam("cep") String cep);
	
}