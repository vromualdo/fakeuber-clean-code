package br.com.vsromualdo.fakeuber.infrastructure.outbound.repository.gateway;

import java.util.Optional;
import java.util.UUID;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import br.com.vsromualdo.fakeuber.application.gateway.repository.AccountRepositoryGateway;
import br.com.vsromualdo.fakeuber.domain.Account;
import br.com.vsromualdo.fakeuber.infrastructure.mapper.AccountMapper;
import br.com.vsromualdo.fakeuber.infrastructure.outbound.repository.AccountSchemaRepository;
import br.com.vsromualdo.fakeuber.infrastructure.outbound.repository.schema.AccountSchema;

@Component
public class AccountRepository implements AccountRepositoryGateway {

	private final AccountSchemaRepository accountSchemaRepository;
	
	public AccountRepository(AccountSchemaRepository accountSchemaRepository) {
		this.accountSchemaRepository = accountSchemaRepository;
	}
	
	@Override
	@Transactional(propagation= Propagation.REQUIRED)
	public Account saveAccount(Account account) {
		AccountSchema accountSchemaResult = this.accountSchemaRepository.save(AccountMapper.modelToSchema(account));
		return AccountMapper.schemaToModel(accountSchemaResult);
	}

	@Override
	public Account getAccountByEmail(String email) {
		AccountSchema accountSchema = this.accountSchemaRepository.findByEmail(email);
		return AccountMapper.schemaToModel(accountSchema);
	}

	@Override
	public Account getAccountById(String accountId) {
		Optional<AccountSchema> accountSchema = this.accountSchemaRepository.findById(UUID.fromString(accountId));
		return AccountMapper.schemaToModel(accountSchema.orElse(null));
	}

    
}
