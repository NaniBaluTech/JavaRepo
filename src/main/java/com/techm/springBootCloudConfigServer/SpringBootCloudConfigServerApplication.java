package com.techm.springBootCloudConfigServer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class SpringBootCloudConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootCloudConfigServerApplication.class, args);
	}

}
