package br.com.vsromualdo.fakeuber.infrastructure.mapper;

import br.com.vsromualdo.fakeuber.application.usecase.account.dto.SignupInputDTO;
import br.com.vsromualdo.fakeuber.application.usecase.account.dto.SignupOutputDTO;
import br.com.vsromualdo.fakeuber.infrastructure.inbound.controller.signup.dto.SignupRequestDTO;
import br.com.vsromualdo.fakeuber.infrastructure.inbound.controller.signup.dto.SignupResponseDTO;

public final class SignupMapper {
    
	private SignupMapper() {
    }

    public static SignupInputDTO requestToInput(SignupRequestDTO signupRequest){
        if(signupRequest == null){
            return null;
        }
        return new SignupInputDTO(
        		signupRequest.getName(), 
        		signupRequest.getEmail(), 
        		signupRequest.getCpf(), 
        		signupRequest.getCarPlate(), 
        		signupRequest.getPassword(), 
        		signupRequest.isPassenger(),
        		signupRequest.isDriver());
    }
    
	public static SignupResponseDTO outputToResponse(SignupOutputDTO signupOutputDTO) {
		if(signupOutputDTO == null){
            return null;
        }
		return new SignupResponseDTO(signupOutputDTO.getAccountId());
	}   
}
