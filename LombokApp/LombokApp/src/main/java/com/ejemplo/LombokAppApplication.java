package com.ejemplo;

import com.ejemplo.persistence.entity.Ability;
import com.ejemplo.persistence.entity.Player;
import com.ejemplo.persistence.entity.repository.AbilityRepository;
import com.ejemplo.persistence.entity.repository.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class LombokAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(LombokAppApplication.class, args);
	}

	@Autowired
    private PlayerRepository playerRepository;

//	@Autowired
//	private AbilityRepository abilityRepository;

	@Bean
	CommandLineRunner init(){
		return args -> {
			List<Player> palyerList = this.playerRepository.findAll();
			System.out.println(palyerList);
		};
	}

}
