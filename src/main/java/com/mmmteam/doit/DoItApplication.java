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
			List<Answer> list = new ArrayList<>();
			list.add(new Answer("no","https://yesno.wtf/assets/no/1-c7d128c95c1740ec76e120146c870f0b.gif"));
			list.add(new Answer("no","https://yesno.wtf/assets/no/23-5fe6c1ca6c78e7bf9a7cf43e406fb8db.gif"));
			list.add(new Answer("no","https://yesno.wtf/assets/no/17-829284e9dd894ce9fb65fbe86d2e382c.gif"));
			list.add(new Answer("no","https://yesno.wtf/assets/no/32-b62f1f8058c1d7f06c528319faccfb38.gif"));
			list.add(new Answer("no","https://yesno.wtf/assets/no/29-6bf57c5bf3fed2dcdbed64afff7a7930.gif"));
			list.add(new Answer("no","https://yesno.wtf/assets/no/31-cc391a4c0332a4ce5b4d4666f64a7b4a.gif"));
			list.add(new Answer("no","https://yesno.wtf/assets/no/16-b66d2db7543f5259c86abc166d6901cf.gif"));
			list.add(new Answer("no","https://yesno.wtf/assets/no/23-5fe6c1ca6c78e7bf9a7cf43e406fb8db.gif"));

			list.add(new Answer("yes","https://yesno.wtf/assets/yes/13-c3082a998e7758be8e582276f35d1336.gif"));
			list.add(new Answer("yes","https://yesno.wtf/assets/yes/10-271c872c91cd72c1e38e72d2f8eda676.gif"));
			list.add(new Answer("yes","https://yesno.wtf/assets/yes/0-c44a7789d54cbdcad867fb7845ff03ae.gif"));
			list.add(new Answer("yes","https://yesno.wtf/assets/yes/2-5df1b403f2654fa77559af1bf2332d7a.gif"));
			list.add(new Answer("yes","https://yesno.wtf/assets/yes/6-304e564038051dab8a5aa43156cdc20d.gif"));
			list.add(new Answer("yes","https://yesno.wtf/assets/yes/14-b57c6dc03aa15a4b18f53eb50d6197ee.gif"));
			list.add(new Answer("yes","https://yesno.wtf/assets/yes/14-b57c6dc03aa15a4b18f53eb50d6197ee.gif"));
			list.add(new Answer("yes","https://yesno.wtf/assets/yes/8-2f93962e2ab24427df8589131da01a4d.gif"));
			list.add(new Answer("yes","https://yesno.wtf/assets/yes/9-6403270cf95723ae4664274db51f1fd4.gif"));

			for(Answer a : list) {
				answerRepository.save(a);
			}
		};
	}*/
}


