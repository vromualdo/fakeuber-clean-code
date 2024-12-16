package br.com.vsromualdo.fakeuber.application.usecase.ride;

import br.com.vsromualdo.fakeuber.application.gateway.repository.AccountRepositoryGateway;
import br.com.vsromualdo.fakeuber.application.gateway.repository.RideRepositoryGateway;
import br.com.vsromualdo.fakeuber.domain.Ride;
import br.com.vsromualdo.fakeuber.infrastructure.inbound.controller.ride.dto.RideInputDTO;
import br.com.vsromualdo.fakeuber.infrastructure.inbound.controller.ride.dto.RideOutputDTO;

public class RequestRideUseCase {

	private final RideRepositoryGateway rideRepositoryGateway;
	private final AccountRepositoryGateway accountRepositoryGateway;

	public RequestRideUseCase(RideRepositoryGateway rideRepositoryGateway, AccountRepositoryGateway accountRepositoryGateway) {
		this.rideRepositoryGateway = rideRepositoryGateway;
		this.accountRepositoryGateway = accountRepositoryGateway;
	}
	
	public RideOutputDTO execute(RideInputDTO input) throws Exception{
		var accountData = this.accountRepositoryGateway.getAccountById(input.getPassengerId());
		if (!accountData.isPassenger()) {
			throw new Exception("Account must be from a passenger");
		}
		var hasActiveRide = this.rideRepositoryGateway.hasActiveRideByPassengerId(input.getPassengerId());
		if (hasActiveRide) {
			throw new Exception("Passenger already have an active ride");
		}
		var ride = Ride.create(input.getPassengerId(), input.getFromLat(), input.getFromLong(), input.getToLat(), input.getToLong());
		this.rideRepositoryGateway.saveRide(ride);
		return new RideOutputDTO(ride.getRideId());
	}
}
