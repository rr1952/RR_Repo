package com.syntel.iot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class IotProjectApplication {

	public static void main(String[] args) {
		// once run, try entering the URLs into your browser to verify functionality.
		// http://localhost:8000/distance/from/Ottawa/to/Washington
		// http://localhost:8000/distance/from/Ottawa/to/London
		// http://localhost:8000/distance/from/Washington/to/London
		
		SpringApplication.run(IotProjectApplication.class, args);
	}
}
