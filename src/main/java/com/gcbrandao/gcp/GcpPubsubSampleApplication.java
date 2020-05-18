package com.gcbrandao.gcp;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.gcp.pubsub.core.PubSubTemplate;
import org.springframework.cloud.gcp.pubsub.support.converter.JacksonPubSubMessageConverter;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class GcpPubsubSampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(GcpPubsubSampleApplication.class, args);
	}

	@Bean
	public JacksonPubSubMessageConverter jacksonPubSubMessageConverter() {
		return new JacksonPubSubMessageConverter(new ObjectMapper());
	}


}
