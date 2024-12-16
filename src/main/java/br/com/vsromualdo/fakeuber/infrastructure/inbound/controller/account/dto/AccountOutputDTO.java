package br.com.vsromualdo.fakeuber.infrastructure.inbound.controller.account.dto;

public class AccountOutputDTO {

    private String accountId;
    private String name;
    private String email;
    private String cpf;
    private String carPlate;
    private String password;
    private boolean isPassenger;
    private boolean isDriver;
    
    public AccountOutputDTO() {
    }
    
    public AccountOutputDTO(String accountId, String name, String email, String cpf, String carPlate, String password,
			boolean isPassenger, boolean isDriver) {
		super();
		this.accountId = accountId;
		this.name = name;
		this.email = email;
		this.cpf = cpf;
		this.carPlate = carPlate;
		this.password = password;
		this.isPassenger = isPassenger;
		this.isDriver = isDriver;
	}

	public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCarPlate() {
        return carPlate;
    }

    public void setCarPlate(String carPlate) {
        this.carPlate = carPlate;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isPassenger() {
        return isPassenger;
    }

    public void setPassenger(boolean passenger) {
        isPassenger = passenger;
    }

    public boolean isDriver() {
        return isDriver;
    }

    public void setDriver(boolean driver) {
        isDriver = driver;
    }
}
