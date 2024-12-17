package br.com.vsromualdo.fakeuber.domain.entity;

import java.time.LocalDateTime;

import br.com.vsromualdo.fakeuber.domain.vo.CarPlateVO;
import br.com.vsromualdo.fakeuber.domain.vo.CpfVO;
import br.com.vsromualdo.fakeuber.domain.vo.EmailVO;
import br.com.vsromualdo.fakeuber.domain.vo.NameVO;
import br.com.vsromualdo.fakeuber.domain.vo.PasswordVO;

public class Account {

    private String accountId;
    private NameVO name;
    private EmailVO email;
    private CpfVO cpf;
    private CarPlateVO carPlate;
    private PasswordVO password;
    private boolean isPassenger;
    private boolean isDriver;
    private LocalDateTime creationDate;

    public Account(String accountId, String name, String email, String cpf, String carPlate, String password, boolean isPassenger, boolean isDriver, LocalDateTime creationDate) {
        this.accountId = accountId;
        this.name = new NameVO(name);
        this.email = new EmailVO(email);
        this.cpf = new CpfVO(cpf);
        this.carPlate = (isDriver)? new CarPlateVO(carPlate) : null;
        this.password = new PasswordVO(password);
        this.isPassenger = isPassenger;
        this.isDriver = isDriver;
        this.creationDate = creationDate;
        
    }

    // Static Factory Method
    public static Account create (
             String name, String email, String cpf, String carPlate, String password, boolean isPassenger, boolean isDriver
    ) {
    	LocalDateTime creationDate = LocalDateTime.now();
        return new Account(null, name, email, cpf, carPlate, password, isPassenger, isDriver, creationDate);
    }

	public String getAccountId() {
		return accountId;
	}

	public String getName() {
		return name.getValue();
	}

	public String getEmail() {
		return email.getValue();
	}

	public String getCpf() {
		return cpf.getValue();
	}

	public String getCarPlate() {
		return (carPlate!=null)?carPlate.getValue():null;
	}

	public String getPassword() {
		return password.getValue();
	}

	public boolean isPassenger() {
		return isPassenger;
	}

	public boolean isDriver() {
		return isDriver;
	}

	public LocalDateTime getCreationDate() {
		return creationDate;
	}
    
    
}
