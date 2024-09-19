
package com.navin.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
@EnableJpaRepositories(basePackages = "com.navin.interfaces")
@ComponentScan(basePackages="com.navin.service,com.navin.controller")
@EntityScan(basePackages = "com.navin.Entity")
@SpringBootApplication(scanBasePackages="com.navin.service,com.navin.controller,com.navin.Entity")
public class SpringbootApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootApplication.class, args);
		System.out.println("executes");
	}

}
