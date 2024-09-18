
package com.navin.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootApplication.class, args);
		System.out.println("executes");
	}

}
//<dependency>
//<groupId>org.springframework.boot</groupId>
//<artifactId>spring-boot-starter-tomcat</artifactId>
//<scope>provided</scope>
//</dependency>