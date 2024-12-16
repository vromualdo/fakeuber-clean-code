package br.com.vsromualdo.fakeuber.application.gateway.repository;

import br.com.vsromualdo.fakeuber.domain.entity.Account;

public interface AccountRepositoryGateway {

	public Account saveAccount(Account account);
	public Account getAccountByEmail(String email);
	public Account getAccountById(String accountId);
}
