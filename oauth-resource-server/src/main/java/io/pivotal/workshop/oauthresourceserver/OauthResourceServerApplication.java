package io.pivotal.workshop.oauthresourceserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;

@EnableResourceServer
@SpringBootApplication
@ComponentScan("io.pivotal.workshop.controller")
public class OauthResourceServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(OauthResourceServerApplication.class, args);
	}
}
