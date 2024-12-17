package br.com.vsromualdo.fakeuber.unit.domain.vo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

import br.com.vsromualdo.fakeuber.domain.entity.Account;
import br.com.vsromualdo.fakeuber.domain.vo.CpfVO;

class CPFTests {

	@Test
	public void validCPF() {
		String validCPFs[] = new String[] {
				"97456321558",
				"974.563.215-58",
				"71428793860",
				"87748248800"
		};
		for (String cpf : validCPFs) {
			assertEquals(new CpfVO(cpf).getValue(), cpf);
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
			
			UnsupportedOperationException exception = assertThrows(UnsupportedOperationException.class, () -> {
				new CpfVO(cpf);
			});
			assertEquals("Invalid cpf", exception.getMessage());
		}
	}
	
}
