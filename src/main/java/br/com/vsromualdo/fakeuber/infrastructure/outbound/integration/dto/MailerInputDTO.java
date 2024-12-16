package br.com.vsromualdo.fakeuber.infrastructure.outbound.integration.dto;

public class MailerInputDTO {

	private String receipient;
	private String subject;
	private String message;

	public MailerInputDTO(String receipient, String subject, String message) {
		this.receipient = receipient;
		this.subject = subject;
		this.message = message;
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
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
	
}
