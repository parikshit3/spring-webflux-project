package com.springflux.tutorial.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.springflux.tutorial.*","com.springflux.tutorial.repo,com.springflux.tutorial.config"})
public class SpringWebFluxApp {
	
	public static void main(String[] args) {
        SpringApplication.run(SpringWebFluxApp.class, args);
    }

}
