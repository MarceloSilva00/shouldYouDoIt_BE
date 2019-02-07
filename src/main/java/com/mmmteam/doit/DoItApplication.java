package com.mmmteam.doit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DoItApplication {

	public static void main(String[] args) {
		SpringApplication.run(DoItApplication.class, args);
	}

/*	@Bean
	CommandLineRunner runner(AnswerRepository answerRepository) {
		return args -> {

			Answer answer = new Answer("yes","asdsad");
			answerRepository.save(answer);

			Answer answer1 = new Answer("no","mghj");
			answerRepository.save(answer1);

			Answer answer2 = new Answer("maybe","asffghfhkukhjk");
			answerRepository.save(answer1);
			Answer answer3 = new Answer("no","slçkfçsçdf");
			answerRepository.save(answer3);

		};
	}*/
}

