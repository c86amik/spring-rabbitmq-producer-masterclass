package com.springcavaj.rabbitmq;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.springcavaj.rabbitmq.model.Car;
import com.springcavaj.rabbitmq.service.RabbitMQPublisher;

@SpringBootApplication
public class SpringRabbitmqProducerMasterclassApplication {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(SpringRabbitmqProducerMasterclassApplication.class);

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(SpringRabbitmqProducerMasterclassApplication.class, args);
		RabbitMQPublisher mqPublisher = applicationContext.getBean(RabbitMQPublisher.class);
		List<Car> cars = createCarRequests();
		for(Car car : cars) {
			mqPublisher.publish(car);
			LOGGER.info("Message published to Queue successfullt : {}", car.toString());
		}
	}
	
	private static List<Car> createCarRequests() {
		List<Car> cars = new ArrayList<>();
		Car car = new Car();
		car.setCarName("Mercedes");
		car.setCarModelNo("MS12786");
		car.setModelName("S-6");
		car.setTypeOfCar("Sedan");
		car.setDateOfManufacture(new Date(System.currentTimeMillis()));
		cars.add(car);
		car = new Car();
		car.setCarModelNo("TJXJ89865");
		car.setCarName("Jaguar");
		car.setModelName("XJ");
		car.setTypeOfCar("Sedan");
		car.setDateOfManufacture(new Date(System.currentTimeMillis()));
		cars.add(car);
		car = new Car();
		car.setCarName("Porsche");
		car.setModelName("Turbo SUV");
		car.setCarModelNo("PO2349843");
		car.setTypeOfCar("SUV");
		car.setDateOfManufacture(new Date(System.currentTimeMillis()));
		cars.add(car);
		car = new Car();
		car.setCarModelNo("VO23432668");
		car.setCarName("Volvo");
		car.setModelName("SUV");
		car.setTypeOfCar("SUV");
		car.setDateOfManufacture(new Date(System.currentTimeMillis()));
		cars.add(car);
		car = new Car();
		car.setCarName("Volkswagen");
		car.setModelName("Beattle");
		car.setCarModelNo("VB343534689");
		car.setTypeOfCar("Hashback");
		car.setDateOfManufacture(new Date(System.currentTimeMillis()));
		cars.add(car);
		return cars;
	}

}
