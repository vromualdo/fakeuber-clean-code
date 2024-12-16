package br.com.vsromualdo.fakeuber.infrastructure.outbound.integration;

import org.springframework.stereotype.Component;

import br.com.vsromualdo.fakeuber.infrastructure.outbound.integration.dto.MailerInputDTO;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
public class MailerMemory {

	public void sendMail(MailerInputDTO mailerInput){
		log.info("receipient:{} / Subject:{}/ Message: {}",
				mailerInput.getReceipient(), mailerInput.getSubject(), mailerInput.getMessage());
	}

}
