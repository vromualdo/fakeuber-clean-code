package br.com.vsromualdo.fakeuber.infrastructure.outbound.repository.schema;


import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "account")
public class AccountSchema {

    @Id
    @Column(name="account_id")
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    
    @Column(name="name")
    private String name;
    
    @Column(name="password")
    private String password;
    
    @Column(name="email")
    private String email;
    
    @Column(name="cpf")
    private String cpf;
    
    @Column(name="car_plate")
    private String carPlate;
    
    @Column(name="is_passenger")
    private Boolean passenger;
    
    @Column(name="is_driver")
    private Boolean driver;
    
    @Column(name="creation_date")
    private LocalDateTime creationDate;


    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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

    public Boolean getPassenger() {
        return passenger;
    }

    public void setPassenger(Boolean passenger) {
        this.passenger = passenger;
    }

    public Boolean getDriver() {
        return driver;
    }

    public void setDriver(Boolean driver) {
        this.driver = driver;
    }

	public LocalDateTime getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(LocalDateTime creationDate) {
		this.creationDate = creationDate;
	}
    
    
}
