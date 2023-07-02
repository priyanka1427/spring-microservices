package com.microservices.twitterkafka.service.config;

import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Configuration
@ConfigurationProperties(prefix = "twitter-to-kafka-service")
@Component
public class TwittertoKafkaServiceConfigData{
	private List<String> twitterKeywords;

	public List<String> getTwitterKeywords() {
		return twitterKeywords;
	}

	public void setTwitterKeywords(List<String> twitterKeywords) {
		this.twitterKeywords = twitterKeywords;
	}
	
	
}
