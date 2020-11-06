package no.odit.pay;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class OditPayApplication {

	public static void main(String[] args) {
		SpringApplication.run(OditPayApplication.class, args);
	}

}