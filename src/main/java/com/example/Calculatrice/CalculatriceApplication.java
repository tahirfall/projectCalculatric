package com.example.Calculatrice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.Calculatrice.services.Calculatrice;

@SpringBootApplication
public class CalculatriceApplication {
	
	static int a = 4;
	static int b = 12;

	public static void main(String[] args) {
		SpringApplication.run(CalculatriceApplication.class, args);
		
		Calculatrice cal = new Calculatrice();
		System.out.println(a + " + " + b + " = " + cal.add(a, b));
		System.out.println(b + " - " + a + " = " + cal.diff(a, b));
		System.out.println(a + " * " + b + " = " + cal.mult(a, b));
	}
	
	

}


