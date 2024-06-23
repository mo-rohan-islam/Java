package org.rohan.graphql.learn;

import org.springframework.boot.SpringApplication;

public class TestLearnApplication {

	public static void main(String[] args) {
		SpringApplication.from(LearnApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
