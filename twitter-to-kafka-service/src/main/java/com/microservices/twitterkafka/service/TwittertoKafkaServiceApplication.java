package com.microservices.twitterkafka.service;

import java.util.Arrays;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.microservices.twitterkafka.service.config.TwittertoKafkaServiceConfigData;

@SpringBootApplication
public class TwittertoKafkaServiceApplication implements CommandLineRunner{
	
	private static final Logger log = LoggerFactory.getLogger(TwittertoKafkaServiceApplication.class);
	
	private final TwittertoKafkaServiceConfigData twittertoKafkaServiceConfigData;
	
	public TwittertoKafkaServiceApplication(TwittertoKafkaServiceConfigData configData) {
		this.twittertoKafkaServiceConfigData = configData;
	}
	
	public static void main(String[] args) {
		SpringApplication.run(TwittertoKafkaServiceApplication.class , args);
	}

	@Override
	public void run(String... args) throws Exception {
		log.info("App starts");
		log.info(Arrays.toString(twittertoKafkaServiceConfigData.getTwitterKeywords().toArray(new String[] {})));
	}
	
	
}
