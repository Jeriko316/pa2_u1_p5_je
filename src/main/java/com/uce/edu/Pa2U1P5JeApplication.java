package com.uce.edu;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Pa2U1P5JeApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(Pa2U1P5JeApplication.class, args);
	}
	
	@Override
	public void run(String...args)throws Exception{
		System.out.println("hola mundo");
		System.out.println("Soy Jhon Enriquez");
	}

	
}
