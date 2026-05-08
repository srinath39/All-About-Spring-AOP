package com.MyProject.Learn_Spring_AOP;

import com.MyProject.Learn_Spring_AOP.MyApplication.Business.BusinessService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LearnSpringAopApplication implements CommandLineRunner {

	private BusinessService businessService;
	private Logger logger= LoggerFactory.getLogger(getClass());

	@Autowired
	public LearnSpringAopApplication(BusinessService businessService){
		this.businessService=businessService;
	}

	public static void main(String[] args) {
		SpringApplication.run(LearnSpringAopApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		logger.info("value return is {}",businessService.getMaxValue());
	}
}
