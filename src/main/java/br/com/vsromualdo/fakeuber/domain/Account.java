package br.com.vsromualdo.fakeuber.domain;

import java.time.LocalDateTime;

import br.com.vsromualdo.fakeuber.domain.util.ValidateCPF;

public class Account {

    private String accountId;
    private String name;
    private String email;
    private String cpf;
    private String carPlate;
    private String password;
    private boolean isPassenger;
    private boolean isDriver;
    private LocalDateTime creationDate;

    public Account(String accountId, String name, String email, String cpf, String carPlate, String password, boolean isPassenger, boolean isDriver, LocalDateTime creationDate) {
        this.accountId = accountId;
        this.name = name;
        this.email = email;
        this.cpf = cpf;
        this.carPlate = carPlate;
        this.password = password;
        this.isPassenger = isPassenger;
        this.isDriver = isDriver;
        this.creationDate = creationDate;
        if (!this.isValidName(name)) {
            throw new UnsupportedOperationException("Invalid name");
        }
        if (!this.isValidEmail(email)){
            throw new UnsupportedOperationException("Invalid email");
        }
        if (!ValidateCPF.execute((cpf))){
            throw new UnsupportedOperationException("Invalid cpf");
        }
        if (isDriver && !this.isValidCarPlate(carPlate)){
            throw new UnsupportedOperationException("Invalid car plate");
        }
    }

    // Static Factory Method
    public static Account create (
             String name, String email, String cpf, String carPlate, String password, boolean isPassenger, boolean isDriver
    ) {
    	LocalDateTime creationDate = LocalDateTime.now();
        return new Account(null, name, email, cpf, carPlate, password, isPassenger, isDriver, creationDate);
    }

    public boolean isValidName (String name) {
        return name.matches("([A-Z][a-z]* ([A-Z][a-z]*|[A-Z][a-z]* [A-Z][a-z]*))");
    }

    public boolean isValidEmail (String email) {
        return email.matches("^(.+)@(.+)$");
    }

    public boolean isValidCarPlate (String carPlate) {
        return carPlate.matches("/[A-Z]{3}[0-9]{4}/");
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

	public LocalDateTime getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(LocalDateTime creationDate) {
		this.creationDate = creationDate;
	}
    
    
}
