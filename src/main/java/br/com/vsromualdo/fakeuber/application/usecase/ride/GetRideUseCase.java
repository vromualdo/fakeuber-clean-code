package br.com.vsromualdo.fakeuber.application.usecase.ride;

import br.com.vsromualdo.fakeuber.application.gateway.repository.AccountRepositoryGateway;
import br.com.vsromualdo.fakeuber.application.gateway.repository.RideRepositoryGateway;
import br.com.vsromualdo.fakeuber.infrastructure.inbound.controller.ride.dto.RideOutputDTO;

public class GetRideUseCase {

	private final RideRepositoryGateway rideRepositoryGateway;
	private final AccountRepositoryGateway accountRepositoryGateway;

	public GetRideUseCase(RideRepositoryGateway rideRepositoryGateway, AccountRepositoryGateway accountRepositoryGateway) {
		this.rideRepositoryGateway = rideRepositoryGateway;
		this.accountRepositoryGateway = accountRepositoryGateway;
	}

	public RideOutputDTO execute(String rideId) throws Exception {
		var ride = this.rideRepositoryGateway.getRideById(rideId);
		var passengerAccount = this.accountRepositoryGateway.getAccountById(ride.getPassengerId());
		return new RideOutputDTO(
				ride.getRideId(), 
				passengerAccount.getAccountId(), 
				passengerAccount.getName(), 
				ride.getDriverId(), 
				ride.getFromLat(),
				ride.getFromLong(), 
				ride.getToLat(), 
				ride.getToLong(), 
				ride.getFare(), 
				ride.getDistance(),
				ride.getStatus(), 
				ride.getDate()
				);
	}
}
