package br.com.vsromualdo.fakeuber.infrastructure.mapper;

import br.com.vsromualdo.fakeuber.domain.Account;
import br.com.vsromualdo.fakeuber.infrastructure.outbound.repository.schema.AccountSchema;

import java.util.UUID;

public final class AccountMapper {
    private AccountMapper() {
    }

    public static AccountSchema modelToSchema(Account account){
        if(account ==null){
            return null;
        }
        AccountSchema accountSchema = new AccountSchema();
        if(account.getAccountId() != null ){
            accountSchema.setId(UUID.fromString(account.getAccountId()));
        }
        accountSchema.setName(account.getName());
        accountSchema.setPassword(account.getPassword());
        accountSchema.setEmail(account.getEmail());
        accountSchema.setCpf(account.getCpf());
        accountSchema.setCarPlate(account.getCarPlate());
        accountSchema.setPassenger(account.isPassenger());
        accountSchema.setDriver(account.isDriver());
        accountSchema.setCreationDate(account.getCreationDate());
        return accountSchema;
    }

    public static Account schemaToModel(AccountSchema accountSchema){
        if(accountSchema == null){
            return null;
        }
        return new Account(
        		((accountSchema.getId() != null) ? accountSchema.getId().toString() : null),
		        accountSchema.getName(),
		        accountSchema.getEmail(),
		        accountSchema.getCpf(),
		        accountSchema.getCarPlate(),
		        accountSchema.getPassword(),
		        accountSchema.getPassenger(),
		        accountSchema.getDriver(),
		        accountSchema.getCreationDate()
        		);
    }
    
}
