package com.sukruozturk.scoreboard;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.sukruozturk.scoreboard.domain.ServiceUser;
import com.sukruozturk.scoreboard.domain.ServiceUserRepository;

@SpringBootApplication
public class ScoreboardApplication {
	
	@Autowired
	private ServiceUserRepository serviceUserRepository;

	public static void main(String[] args) {
		SpringApplication.run(ScoreboardApplication.class, args);
	}

	@Bean
	CommandLineRunner runner() {
		return args -> {
			
			// Create service user
			//username: admin	password: admin
			serviceUserRepository.save(new ServiceUser("admin"
					, "$2y$12$J0G7fGEBkvi70WQeDx8p5Op2320X0MOM7s/piKnILuhAcS8htCw4y"
					, "ADMIN"));
			
		};
	}
}
