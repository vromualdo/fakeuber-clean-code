package br.com.vsromualdo.fakeuber.infrastructure.inbound.controller.account;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.vsromualdo.fakeuber.application.usecase.account.GetAccountUseCase;
import br.com.vsromualdo.fakeuber.infrastructure.inbound.controller.account.dto.AccountOutputDTO;

@RestController
@RequestMapping("/v1")
public class AccountController {

	
	private final GetAccountUseCase getAccountUseCase;
		
	public AccountController(GetAccountUseCase getAccountUseCase) {
		super();
		this.getAccountUseCase = getAccountUseCase;
	}

	@GetMapping(path="/accounts/{accountId}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<AccountOutputDTO> get(@PathVariable(name = "accountId") String accountId) throws Exception{
		AccountOutputDTO accountResult = this.getAccountUseCase.execute(accountId);
		return new ResponseEntity<>(accountResult, HttpStatus.OK);
	}
	
	@GetMapping("/accounts")
	public ResponseEntity<AccountOutputDTO> get(){
		
		AccountOutputDTO result = new AccountOutputDTO();
		result.setAccountId("223232");
		result.setEmail("vsromualdo@gmail.com");
		
		return new ResponseEntity<AccountOutputDTO>(result, HttpStatus.OK);
	} 
	
	
}
