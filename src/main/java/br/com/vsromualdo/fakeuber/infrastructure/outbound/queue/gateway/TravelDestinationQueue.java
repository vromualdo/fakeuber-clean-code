package br.com.vsromualdo.fakeuber.infrastructure.outbound.queue.gateway;

import org.springframework.beans.factory.annotation.Value;

import br.com.vsromualdo.fakeuber.application.gateway.queue.TravelDestinationQueueGateway;
import br.com.vsromualdo.fakeuber.infrastructure.outbound.queue.RabbitMQMemory;
import br.com.vsromualdo.fakeuber.infrastructure.outbound.queue.dto.DestinationInputDTO;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class TravelDestinationQueue implements TravelDestinationQueueGateway{
	
	private final RabbitMQMemory rabbitMQMemory;
	
	@Value("${rabbit.queues.travel-destination}")
	private String queueName;
	
	public TravelDestinationQueue(RabbitMQMemory rabbitMQMemory) {
		this.rabbitMQMemory = rabbitMQMemory;
	}

	@Override
	public void send(DestinationInputDTO destinationInputDTO) {
		rabbitMQMemory.send(queueName, destinationInputDTO);
	}

}
