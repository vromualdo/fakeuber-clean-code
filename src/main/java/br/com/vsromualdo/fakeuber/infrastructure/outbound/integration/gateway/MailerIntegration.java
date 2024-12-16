package br.com.vsromualdo.fakeuber.infrastructure.outbound.integration.gateway;

import org.springframework.stereotype.Component;

import br.com.vsromualdo.fakeuber.application.gateway.integration.MailerIntegrationGateway;
import br.com.vsromualdo.fakeuber.infrastructure.outbound.integration.MailerMemory;
import br.com.vsromualdo.fakeuber.infrastructure.outbound.integration.dto.MailerInputDTO;
import br.com.vsromualdo.fakeuber.infrastructure.outbound.integration.dto.MailerTemplateInputDTO;

@Component
public class MailerIntegration implements MailerIntegrationGateway {

    private final MailerMemory mailerMemory;

    public MailerIntegration(MailerMemory mailerMemory){
        this.mailerMemory = mailerMemory;
    }

    @Override
    public void send(MailerInputDTO mailerInput) {
        this.mailerMemory.sendMail(mailerInput);
    }
    @Override
    public void send(MailerTemplateInputDTO mailerTemplateInputDTO) {
        String template = "Fake template {nameFake} e {detailFake} ";
        //retrieve values from Map mailerTemplateInputDTO.getTemplateParams()
        MailerInputDTO mailerInput = new MailerInputDTO(
                mailerTemplateInputDTO.getReceipient(),
                mailerTemplateInputDTO.getSubject(),
                template
        );
        this.mailerMemory.sendMail(mailerInput);
    }

}
