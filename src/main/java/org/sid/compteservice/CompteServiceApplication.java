package org.sid.compteservice;

import org.sid.compteservice.entities.Compte;
import org.sid.compteservice.enums.CompteType;
import org.sid.compteservice.repositories.CompteRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;

@SpringBootApplication
public class CompteServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(CompteServiceApplication.class, args);
    }
    @Bean
    CommandLineRunner start(CompteRepository compteRepository){
       return args -> {
           compteRepository.save(new Compte(null,Math.random()*9000,new Date(), CompteType.COURANT));
           compteRepository.save(new Compte(null,Math.random()*9000,new Date(), CompteType.EPARGNE));
           compteRepository.save(new Compte(null,Math.random()*9000,new Date(), CompteType.COURANT));
       } ;
    }

}
