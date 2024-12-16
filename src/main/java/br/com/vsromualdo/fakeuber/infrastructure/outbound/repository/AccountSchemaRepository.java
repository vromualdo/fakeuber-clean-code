package br.com.vsromualdo.fakeuber.infrastructure.outbound.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.vsromualdo.fakeuber.infrastructure.outbound.repository.schema.AccountSchema;

@Repository
public interface AccountSchemaRepository extends JpaRepository<AccountSchema, UUID> {

    public AccountSchema findByEmail(String email);

}
