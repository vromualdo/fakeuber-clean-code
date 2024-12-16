package br.com.vsromualdo.fakeuber.application.usecase.account;

import br.com.vsromualdo.fakeuber.application.gateway.integration.MailerIntegrationGateway;
import br.com.vsromualdo.fakeuber.application.gateway.repository.AccountRepositoryGateway;
import br.com.vsromualdo.fakeuber.domain.Account;
import br.com.vsromualdo.fakeuber.domain.exception.DuplicateAccountException;
import br.com.vsromualdo.fakeuber.infrastructure.inbound.controller.signup.dto.SignupInputDTO;
import br.com.vsromualdo.fakeuber.infrastructure.inbound.controller.signup.dto.SignupOutputDTO;
import br.com.vsromualdo.fakeuber.infrastructure.outbound.integration.dto.MailerInputDTO;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class SignupUseCase {

    private final AccountRepositoryGateway accountRepository;
    private final MailerIntegrationGateway mailerIntegration;

    public SignupUseCase(AccountRepositoryGateway accountRepository, MailerIntegrationGateway mailerIntegration){
        this.accountRepository = accountRepository;
        this.mailerIntegration = mailerIntegration;
    }

    public SignupOutputDTO execute(SignupInputDTO input) throws Exception{
        Account existingAccount = this.accountRepository.getAccountByEmail(input.getEmail());
		if (existingAccount != null){
            throw new DuplicateAccountException("Duplicated account " + existingAccount.getAccountId());
        }
		Account account = Account.create(input.getName(), input.getEmail(), input.getCpf(), input.getCarPlate(), input.getPassword(), input.isPassenger(), input.isDriver());
		Account accountCreated = this.accountRepository.saveAccount(account);
        mailerIntegration.send(new MailerInputDTO(input.getEmail(), "[FAKEUBER] Welcome", "Welcome to  Fake Uber"));
        return new SignupOutputDTO(accountCreated.getAccountId());
    }

}
