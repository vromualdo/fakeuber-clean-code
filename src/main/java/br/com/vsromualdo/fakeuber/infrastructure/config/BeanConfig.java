package br.com.vsromualdo.fakeuber.infrastructure.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import br.com.vsromualdo.fakeuber.application.usecase.account.GetAccountUseCase;
import br.com.vsromualdo.fakeuber.application.usecase.account.SignupUseCase;
import br.com.vsromualdo.fakeuber.application.usecase.ride.GetRideUseCase;
import br.com.vsromualdo.fakeuber.application.usecase.ride.RequestRideUseCase;
import br.com.vsromualdo.fakeuber.infrastructure.outbound.integration.gateway.MailerIntegration;
import br.com.vsromualdo.fakeuber.infrastructure.outbound.repository.gateway.AccountRepository;
import br.com.vsromualdo.fakeuber.infrastructure.outbound.repository.gateway.RideRepository;

@Configuration
public class BeanConfig {

	@Bean
    public GetAccountUseCase getAccountUseCase(AccountRepository accountRepository) {
        return new GetAccountUseCase(accountRepository);
    }
	
	@Bean
    public GetRideUseCase getRideUseCase(RideRepository rideRepository, AccountRepository accountRepository) {
        return new GetRideUseCase(rideRepository, accountRepository);
    }
	
	@Bean
    public RequestRideUseCase requestRideUseCase(RideRepository rideRepository, AccountRepository accountRepository) {
        return new RequestRideUseCase(rideRepository, accountRepository);
    }
	
	@Bean
    public SignupUseCase signupUseCase(AccountRepository accountRepository, MailerIntegration mailerIntegration) {
        return new SignupUseCase(accountRepository, mailerIntegration);
    }
	
	
}
