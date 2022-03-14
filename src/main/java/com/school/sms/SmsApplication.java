package com.school.sms;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class SmsApplication {

	private static final Logger logger = LoggerFactory.getLogger(SmsApplication.class);
	public static void main(String[] args) {
		// After adding this comment the application is restarted  
		
		SpringApplication.run(SmsApplication.class, args);
		logger.info("Hello Spring Boot");
	}

}
