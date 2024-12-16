package br.com.vsromualdo.fakeuber.unit.domain.util;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import br.com.vsromualdo.fakeuber.domain.entity.Account;
import br.com.vsromualdo.fakeuber.domain.util.ValidateCPF;

class ValidateCpfTests {

	@Test
	public void validCPF() {
		String validCPFs[] = new String[] {
				"97456321558",
				"974.563.215-58",
				"71428793860",
				"87748248800"
		};
		for (String cpf : validCPFs) {
			assertTrue(ValidateCPF.execute(cpf));
		}
	}
	
	@Test
	public void invalidCPF() {
		String invalidCPFs[] = new String[] {
				"",
				null,
				"123",
				"00000000000",
				"11111111111",
				"22222222222",
				"33333333333",
				"44444444444",
				"55555555555",
				"66666666666",
				"77777777777",
				"88888888888",
				"99999999999",
				"01234567890123"
		};
		for (String cpf : invalidCPFs) {
			assertFalse(ValidateCPF.execute(cpf));
		}
	}
	
}
