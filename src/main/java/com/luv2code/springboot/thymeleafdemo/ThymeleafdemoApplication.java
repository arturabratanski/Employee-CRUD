/**
 * Developed by Artur Abratanski
 * based on course: https://www.udemy.com/course/spring-hibernate-tutorial/
 * ended with certificate: https://www.udemy.com/certificate/UC-93a7466f-d55f-4f75-a4f3-58f70e0bb6b1/
 */

/**
 * This is a main application.
 * It uses Spring Boot annotation to quickly and in efficient way start up webapp.
 */

package com.luv2code.springboot.thymeleafdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ThymeleafdemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ThymeleafdemoApplication.class, args);
	}

}
