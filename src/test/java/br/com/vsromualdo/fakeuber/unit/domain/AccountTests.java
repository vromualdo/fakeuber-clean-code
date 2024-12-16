package br.com.vsromualdo.fakeuber.unit.domain;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

import br.com.vsromualdo.fakeuber.domain.entity.Account;

public class AccountTests {

	@Test
	public void createPassengerAccount() {
		var account = Account.create("John Doe", "vsr4002286008151900407@gmail.com", "97456321558", "", "123456", true, false);
		assertEquals(account.getName(), "John Doe");
		assertEquals(account.getEmail(), "vsr4002286008151900407@gmail.com");
	}

	@Test
	public void notCreateAccountWithInvalidName() {
		UnsupportedOperationException exception = assertThrows(UnsupportedOperationException.class, () -> {
			 Account.create("John", "john.doe@gmail.com", "97456321558", "", "123456", true, false);
		});
		assertEquals("Invalid name", exception.getMessage());
	}

	@Test
	public void notCreateAccountWithInvalidEmail() {
		UnsupportedOperationException exception = assertThrows(UnsupportedOperationException.class, () -> {
			Account.create("John Doe", "john.doe", "97456321558", "", "123456", true, false);
		});
		assertEquals("Invalid email", exception.getMessage());
	}

	@Test
	public void notCreateAccountWithInvalidCPF() {
		UnsupportedOperationException exception = assertThrows(UnsupportedOperationException.class, () -> {
			Account.create("John Doe", "john.doe@gmail.com", "9745632155", "", "123456", true, false);
		});
		assertEquals("Invalid cpf", exception.getMessage());
	}

	@Test
	public void notCreateAccountWithInvalidCarPlate() {
		UnsupportedOperationException exception = assertThrows(UnsupportedOperationException.class, () -> {
			Account.create("John Doe", "john.doe@gmail.com", "97456321558", "AAA999", "123456", false, true);
		});
		assertEquals("Invalid car plate", exception.getMessage());
	}
}
