package com.example.demo;

import com.example.demo.service.IPersonaService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

	Logger logger = LoggerFactory.getLogger(DemoApplication.class);

	@Autowired
	private IPersonaService service;

	public static void main(String[] args){
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		logger.info("logger info");
		logger.warn("logger warn");
		service.registrar("Leonardo");
	}
}
