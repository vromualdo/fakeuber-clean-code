package br.com.vsromualdo.fakeuber.application.gateway.repository;

import br.com.vsromualdo.fakeuber.domain.Account;

public interface AccountRepositoryGateway {

	public Account saveAccount(Account account);
	public Account getAccountByEmail(String email);
	public Account getAccountById(String accountId);
}
