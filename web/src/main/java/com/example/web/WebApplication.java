// WebApplication.java
package com.example.web;

import com.example.web.Repository.CompteRepository;
import com.example.web.entities.Compte;
import com.example.web.entities.TypeCompte;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;

@SpringBootApplication
public class WebApplication {

	public static void main(String[] args) { // Fixed closing parenthesis
		SpringApplication.run(WebApplication.class, args);
	}

	@Bean
	CommandLineRunner start(CompteRepository compteRepository) {
		return args -> {
			compteRepository.save(new Compte(null, Math.random() * 9000, new Date(), TypeCompte.EPARGNE));
			compteRepository.save(new Compte(null, Math.random() * 9000, new Date(), TypeCompte.COURANT));
			compteRepository.save(new Compte(null, Math.random() * 9000, new Date(), TypeCompte.EPARGNE));
			compteRepository.findAll().forEach(c -> {
				System.out.println(c.toString());
			});
		};
	}
}
