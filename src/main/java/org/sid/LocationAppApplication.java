package org.sid;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"org.sid.entities"})
@EnableAutoConfiguration
public class LocationAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(LocationAppApplication.class, args);
	}

}
