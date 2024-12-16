package br.com.vsromualdo.fakeuber.infrastructure.inbound.controller.account;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.vsromualdo.fakeuber.application.usecase.account.GetAccountUseCase;
import br.com.vsromualdo.fakeuber.application.usecase.account.dto.AccountOutputDTO;
import br.com.vsromualdo.fakeuber.infrastructure.inbound.controller.account.dto.AccountResponseDTO;
import br.com.vsromualdo.fakeuber.infrastructure.mapper.AccountMapper;

@RestController
@RequestMapping("/v1")
public class AccountController {

	
	private final GetAccountUseCase getAccountUseCase;
		
	public AccountController(GetAccountUseCase getAccountUseCase) {
		super();
		this.getAccountUseCase = getAccountUseCase;
	}

	@GetMapping(path="/accounts/{accountId}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<AccountResponseDTO> get(@PathVariable(name = "accountId") String accountId) throws Exception{
		AccountOutputDTO accountOutputDTO = this.getAccountUseCase.execute(accountId);
		AccountResponseDTO accountResult = AccountMapper.outputToResponse(accountOutputDTO);
		return new ResponseEntity<>(accountResult, HttpStatus.OK);
	}
	
	@GetMapping("/accounts")
	public ResponseEntity<AccountResponseDTO> get(){
		
		AccountResponseDTO result = new AccountResponseDTO();
		result.setAccountId("223232");
		result.setEmail("vsr@gmail.com");
		
		return new ResponseEntity<>(result, HttpStatus.OK);
	} 
	
	
}
