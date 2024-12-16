package br.com.vsromualdo.fakeuber.infrastructure.mapper;

import java.util.UUID;

import br.com.vsromualdo.fakeuber.domain.Ride;
import br.com.vsromualdo.fakeuber.infrastructure.outbound.repository.schema.RideSchema;

public final class RideMapper {
    private RideMapper() {
    }

    public static RideSchema modelToSchema(Ride ride){
        if(ride ==null){
            return null;
        }
        RideSchema rideSchema = new RideSchema();
        if(ride.getRideId() != null ){
        	rideSchema.setId(UUID.fromString(ride.getRideId()));
        }
        rideSchema.setPassengerId(UUID.fromString(ride.getPassengerId()));
        rideSchema.setDriverId(UUID.fromString(ride.getDriverId()));
        rideSchema.setFromLatitude(ride.getFromLat()); 
        rideSchema.setFromLongitude(ride.getFromLong());
        rideSchema.setToLatitude(ride.getToLat()); 
        rideSchema.setToLongitude(ride.getToLong());
        rideSchema.setFare(ride.getFare()); 
        rideSchema.setDistance(ride.getDistance()); 
        rideSchema.setStatus(ride.getStatus()); 
        rideSchema.setDate(ride.getDate());
        return rideSchema;
    }

    public static Ride schemaToModel(RideSchema rideSchema){
        if(rideSchema == null){
            return null;
        }
        return new Ride(
        		((rideSchema.getId() != null) ? rideSchema.getId().toString() : null),
        		rideSchema.getPassengerId().toString(), 
        		rideSchema.getDriverId().toString(), 
        		rideSchema.getFromLatitude(), 
        		rideSchema.getFromLongitude(),
        		rideSchema.getToLatitude(), 
        		rideSchema.getToLongitude(),
        		rideSchema.getFare(), 
        		rideSchema.getDistance(), 
        		rideSchema.getStatus(), 
        		rideSchema.getDate()
        		);
    }
}
