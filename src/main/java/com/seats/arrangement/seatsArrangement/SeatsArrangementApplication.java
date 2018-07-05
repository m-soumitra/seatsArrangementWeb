package com.seats.arrangement.seatsArrangement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.seats.arrangement.*"})
public class SeatsArrangementApplication {

	public static void main(String[] args) {
		SpringApplication.run(SeatsArrangementApplication.class, args);
	}
}
