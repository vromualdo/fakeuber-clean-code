package br.com.vsromualdo.fakeuber.application.gateway.integration;

import br.com.vsromualdo.fakeuber.infrastructure.outbound.integration.dto.MailerInputDTO;
import br.com.vsromualdo.fakeuber.infrastructure.outbound.integration.dto.MailerTemplateInputDTO;

public interface MailerIntegrationGateway {

	public void send(MailerInputDTO mailerInput);

	public void send(MailerTemplateInputDTO mailerTemplateInputDTO);
}
