package br.com.vsromualdo.fakeuber.integration.infrastructure.inbound.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

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
import br.com.vsromualdo.fakeuber.infrastructure.inbound.controller.account.dto.AccountOutputDTO;

@SpringBootTest(classes = FakeUberCleanCodeApplication.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class AccountControllerTests {

	@LocalServerPort
    private int port;

	private TestRestTemplate testRestTemplate = new TestRestTemplate();
	
	private String endpoint;
	
	@BeforeEach
	void setUp() throws Exception {
		endpoint = "http://localhost:".concat(port+ "").concat("/fakeuber/v1/accounts");
	}
	

	@Test
	void contarEncontradaCodigo200() {
		HttpHeaders headers = new HttpHeaders();
		HttpEntity<String> entity = new HttpEntity<>(null, headers);
		ResponseEntity<AccountOutputDTO> response = testRestTemplate
				.exchange(endpoint, HttpMethod.GET, entity, AccountOutputDTO.class);
		assertTrue(response.getStatusCode().isSameCodeAs(HttpStatus.OK));
		
	}
	
	@Test
	void contarEncontrada() {
		HttpHeaders headers = new HttpHeaders();
		HttpEntity<String> entity = new HttpEntity<>(null, headers);
		//ResponseEntity<Account> response = testRestTemplate
		//		.exchange(url, HttpMethod.GET, entity, Account.class);
		AccountOutputDTO accountResult = testRestTemplate.getForObject(endpoint, AccountOutputDTO.class);
		assertEquals(accountResult.getEmail(), "vsromualdo@gmail.com");
	}
	
	@Test
	void contarNaoEncontrada() {
		HttpHeaders headers = new HttpHeaders();
		HttpEntity<String> entity = new HttpEntity<>(null, headers);
		AccountOutputDTO accountResult = testRestTemplate.getForObject(endpoint, AccountOutputDTO.class);
		assertNotEquals(accountResult.getEmail(), "xvsromualdo@gmail.com");
	}
}
