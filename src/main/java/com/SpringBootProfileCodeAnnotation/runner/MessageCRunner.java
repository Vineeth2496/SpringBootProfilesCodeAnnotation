 package com.SpringBootProfileCodeAnnotation.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;
@Component
@Profile("!prod")
public class MessageCRunner implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
		System.out.println("FROM NON-PROD ENVIRONMENTS");
	}

}
