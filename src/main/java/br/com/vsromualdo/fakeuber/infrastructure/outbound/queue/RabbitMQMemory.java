package br.com.vsromualdo.fakeuber.infrastructure.outbound.queue;

import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class RabbitMQMemory {

	public void send(String queueName, Object msg) {
		log.info("queueName:{} / msg:{}", queueName, msg);
	}
	
}
