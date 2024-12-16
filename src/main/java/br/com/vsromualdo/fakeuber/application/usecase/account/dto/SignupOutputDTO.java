package br.com.vsromualdo.fakeuber.application.usecase.account.dto;

public class SignupOutputDTO {

    private String accountId;
    
    public SignupOutputDTO() {
		super();
	}

	public SignupOutputDTO(String accountId) {
		super();
		this.accountId = accountId;
	}
    
	public String getAccountId() {
        return accountId;
    }
    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }
    
}
