package br.com.vsromualdo.fakeuber.infrastructure.inbound.controller.account.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AccountRequestDTO {

    private String accountId;
    private String name;
    private String email;
    private String cpf;
    private String carPlate;
    private String password;
    private boolean isPassenger;
    private boolean isDriver;

}
