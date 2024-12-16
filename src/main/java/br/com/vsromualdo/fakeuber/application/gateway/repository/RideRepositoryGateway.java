package br.com.vsromualdo.fakeuber.application.gateway.repository;

import br.com.vsromualdo.fakeuber.domain.Ride;

public interface RideRepositoryGateway {

	public void saveRide(Ride ride);
	public Ride getRideById(String rideId);
	public boolean hasActiveRideByPassengerId(String passengerId);
}
