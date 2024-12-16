package br.com.vsromualdo.fakeuber.infrastructure.outbound.integration.dto;

import java.util.Map;

public class MailerTemplateInputDTO {

	private String receipient;
	private String subject;
	private String templateName;
	private Map<String, Object> templateParams;

	public MailerTemplateInputDTO(String receipient, String subject, String templateName, Map<String, Object> templateParams) {
		this.receipient = receipient;
		this.subject = subject;
		this.templateName = templateName;
		this.templateParams = templateParams;
	}

	public String getReceipient() {
		return receipient;
	}

	public void setReceipient(String receipient) {
		this.receipient = receipient;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getTemplateName() {
		return templateName;
	}

	public void setTemplateName(String templateName) {
		this.templateName = templateName;
	}

	public Map<String, Object> getTemplateParams() {
		return templateParams;
	}

	public void setTemplateParams(Map<String, Object> templateParams) {
		this.templateParams = templateParams;
	}
}
