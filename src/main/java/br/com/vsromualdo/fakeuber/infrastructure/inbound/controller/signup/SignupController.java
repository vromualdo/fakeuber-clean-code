package br.com.vsromualdo.fakeuber.infrastructure.inbound.controller.signup;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.vsromualdo.fakeuber.application.usecase.account.SignupUseCase;
import br.com.vsromualdo.fakeuber.infrastructure.inbound.controller.signup.dto.SignupInputDTO;
import br.com.vsromualdo.fakeuber.infrastructure.inbound.controller.signup.dto.SignupOutputDTO;

@RestController
@RequestMapping("/v1")
public class SignupController {

	private final SignupUseCase signupUseCase;

	public SignupController(SignupUseCase signupUseCase){
		this.signupUseCase = signupUseCase;
	}
	
	@PostMapping(path="/signup", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<SignupOutputDTO> create(@RequestBody SignupInputDTO input) throws Exception {
		SignupOutputDTO output = signupUseCase.execute(input);
        return new ResponseEntity<>(output, HttpStatus.OK);
    }
	
}
