package br.com.vsromualdo.fakeuber.infrastructure.inbound.listener.bankinvoice.dto;

public class SegmentADTO {

	private String bank;
	private String account;
	private String amount;
	
	
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
