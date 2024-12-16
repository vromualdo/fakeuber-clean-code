package br.com.vsromualdo.fakeuber.application.usecase.account;

import br.com.vsromualdo.fakeuber.application.gateway.repository.AccountRepositoryGateway;
import br.com.vsromualdo.fakeuber.application.usecase.account.dto.AccountOutputDTO;
import br.com.vsromualdo.fakeuber.domain.Account;
import br.com.vsromualdo.fakeuber.domain.exception.AccountDoesNotExistException;

public class GetAccountUseCase {

	private final AccountRepositoryGateway accountRepository;
	
	public GetAccountUseCase(AccountRepositoryGateway accountRepository) {
		this.accountRepository = accountRepository;
	}

	public AccountOutputDTO execute(String accountId) throws Exception {
		Account account = this.accountRepository.getAccountById(accountId);
		if (account == null){
            throw new AccountDoesNotExistException("Account "+accountId+" does not exist");
        }
		return new AccountOutputDTO(
				account.getAccountId(), 
				account.getName(), 
				account.getEmail(), 
				account.getCpf(), 
				account.getCarPlate(), 
				account.getPassword(),
				account.isPassenger(),
				account.isDriver()
				);
	}
}
