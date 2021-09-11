/**
 * 
 */
package com.springcavaj.rabbitmq.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.springcavaj.rabbitmq.model.Car;

/**
 * @author springcavaj
 *
 */
@Service
public class RabbitMQPublisher {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(RabbitMQPublisher.class);
	
	@Autowired
	private AmqpTemplate amqpTemplate;
	
	@Value("${rabbit.mq.queue.name}")
    String queueName;
    @Value("${rabbit.mq.exchange}")
    String exchange;
    @Value("${rabbit.mq.routing.key}")
    private String routingKey;
    
    public void publish(Car car) {
    	amqpTemplate.convertAndSend(exchange, routingKey, car);
    	LOGGER.info("Published message Car successfully in queue : {}", queueName);
    }

}
