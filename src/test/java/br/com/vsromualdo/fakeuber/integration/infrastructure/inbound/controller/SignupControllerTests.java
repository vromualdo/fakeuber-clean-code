package br.com.vsromualdo.fakeuber.integration.infrastructure.inbound.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Random;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import br.com.vsromualdo.fakeuber.FakeUberCleanCodeApplication;
import br.com.vsromualdo.fakeuber.infrastructure.inbound.controller.account.dto.AccountResponseDTO;
import br.com.vsromualdo.fakeuber.infrastructure.inbound.controller.signup.dto.SignupRequestDTO;
import br.com.vsromualdo.fakeuber.infrastructure.inbound.controller.signup.dto.SignupResponseDTO;

@SpringBootTest(classes = FakeUberCleanCodeApplication.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class SignupControllerTests {

	@LocalServerPort
    private int port;

	private TestRestTemplate testRestTemplate = new TestRestTemplate();
	
	private String endpoint;
	private String endpointGet;
	
	@BeforeEach
	void setUp() throws Exception {
		endpoint = "http://localhost:".concat(port+ "").concat("/fakeuber/v1/signup");
		endpointGet = "http://localhost:".concat(port+ "").concat("/fakeuber/v1/accounts");
	}
	

	@Test
	void createPassengerAccount() {
		HttpHeaders headers = new HttpHeaders();
		headers.set("Content-Type", "application/json");
		var random = new Random(port).nextLong();
		var input = new SignupRequestDTO(
				"Vagner R", 
				"vsr"+random+"@gmail.com", 
				"97456321558", 
				null, 
				"123456", 
				true,
				false
				);
		HttpEntity<SignupRequestDTO> entity = new HttpEntity<>(input, headers);
		ResponseEntity<SignupResponseDTO> response = testRestTemplate.exchange(endpoint, HttpMethod.POST, entity, SignupResponseDTO.class);
		assertTrue(response.getStatusCode().isSameCodeAs(HttpStatus.OK));
		assertNotNull(response.getBody().getAccountId());
		String endpointGetAccount = endpointGet + "/" + response.getBody().getAccountId();
		AccountResponseDTO accountResult = testRestTemplate.getForObject(endpointGetAccount, AccountResponseDTO.class);
		assertEquals(accountResult.getName(), input.getName());
		assertEquals(accountResult.getEmail(), input.getEmail());
		assertEquals(accountResult.getCpf(), input.getCpf());
		assertEquals(accountResult.getPassword(), input.getPassword());
		assertEquals(accountResult.isPassenger(), input.isPassenger());
		
		
	}
	
}
