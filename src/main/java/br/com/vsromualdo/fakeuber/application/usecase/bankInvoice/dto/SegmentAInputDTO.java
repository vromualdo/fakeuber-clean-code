package br.com.vsromualdo.fakeuber.application.usecase.bankInvoice.dto;

public class SegmentAInputDTO {

	private String bank;
	private String account;
	private String amount;
	
	public SegmentAInputDTO(String bank, String account, String amount) {
		super();
		this.bank = bank;
		this.account = account;
		this.amount = amount;
	}
	
	public String getBank() {
		return bank;
	}
	public void setBank(String bank) {
		this.bank = bank;
	}
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public String getAmount() {
		return amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}
	
	
}
