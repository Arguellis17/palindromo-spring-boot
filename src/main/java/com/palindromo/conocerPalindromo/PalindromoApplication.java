package com.palindromo.conocerPalindromo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.SQLOutput;

@SpringBootApplication
public class PalindromoApplication {

	public static void main(String[] args) {
		SpringApplication.run(PalindromoApplication.class, args);

		System.out.println("Hola Spring Boot");
	}

}
