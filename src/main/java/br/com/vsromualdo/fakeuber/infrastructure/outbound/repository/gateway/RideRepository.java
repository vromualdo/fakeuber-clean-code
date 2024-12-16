package br.com.vsromualdo.fakeuber.infrastructure.outbound.repository.gateway;

import java.util.Optional;
import java.util.UUID;

import org.springframework.stereotype.Component;

import br.com.vsromualdo.fakeuber.application.gateway.repository.RideRepositoryGateway;
import br.com.vsromualdo.fakeuber.domain.Ride;
import br.com.vsromualdo.fakeuber.infrastructure.mapper.RideMapper;
import br.com.vsromualdo.fakeuber.infrastructure.outbound.repository.RideSchemaRepository;
import br.com.vsromualdo.fakeuber.infrastructure.outbound.repository.schema.RideSchema;

@Component
public class RideRepository implements RideRepositoryGateway {

	
	private final RideSchemaRepository rideSchemaRepository;
	
	public RideRepository(RideSchemaRepository rideSchemaRepository) {
		this.rideSchemaRepository = rideSchemaRepository;
	}

	@Override
	public void saveRide(Ride ride) {
		RideSchema rideSchema = RideMapper.modelToSchema(ride);
		this.rideSchemaRepository.save(rideSchema);
	}

	@Override
	public Ride getRideById(String rideId) {
		Optional<RideSchema> rideSchema = this.rideSchemaRepository.findById(UUID.fromString(rideId));
		return RideMapper.schemaToModel(rideSchema.orElse(null));
	}

	@Override
	public boolean hasActiveRideByPassengerId(String passengerId) {
		return this.rideSchemaRepository.existsActiveRideByPassengerId(UUID.fromString(passengerId));
	}

}
