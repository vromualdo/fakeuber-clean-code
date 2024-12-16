package br.com.vsromualdo.fakeuber.infrastructure.outbound.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import br.com.vsromualdo.fakeuber.infrastructure.outbound.repository.schema.RideSchema;

@Repository
public interface RideSchemaRepository extends JpaRepository<RideSchema, UUID> {

    public RideSchema findByPassengerId(UUID passengerId);
    
    @Query(value="select 1 from ride where EXISTS (SELECT passenger_id FROM ride WHERE passenger_id = ?1 and status not in ('completed', 'cancelled')) ", 
			nativeQuery = true)
	boolean existsActiveRideByPassengerId(UUID passengerId);

}
