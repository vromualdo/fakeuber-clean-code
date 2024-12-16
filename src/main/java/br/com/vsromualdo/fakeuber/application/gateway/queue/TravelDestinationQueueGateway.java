package br.com.vsromualdo.fakeuber.application.gateway.queue;

import br.com.vsromualdo.fakeuber.infrastructure.outbound.queue.dto.DestinationInputDTO;

public interface TravelDestinationQueueGateway {

	public void send(DestinationInputDTO destinationInputDTO);
}
