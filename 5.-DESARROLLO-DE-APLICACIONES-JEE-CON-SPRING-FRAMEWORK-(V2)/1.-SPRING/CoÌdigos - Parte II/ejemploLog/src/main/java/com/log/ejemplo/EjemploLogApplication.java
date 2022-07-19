package com.log.ejemplo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EjemploLogApplication {
	
	private final static Logger logger = LoggerFactory.getLogger(EjemploLogApplication.class); 

	public static void main(String[] args) {
		SpringApplication.run(EjemploLogApplication.class, args);
		logger.debug("debug log");
		logger.info("info log");
		logger.warn("warning log");
		logger.error("error log");
	}
}
