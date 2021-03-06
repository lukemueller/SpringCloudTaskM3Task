package com.doug;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.task.configuration.EnableTask;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableTask
public class SpringCloudTaskM3TaskApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudTaskM3TaskApplication.class, args);
	}



	@Bean
	public TollProcessingTask tollProcessingTask() {
		return new TollProcessingTask();
	}


	public class TollProcessingTask implements CommandLineRunner {


		@Override
		public void run(String... strings) throws Exception {

			//parameters: stationid, license plate, timestamp

			if(null!= strings && 0 != strings.length) {
				System.out.println("parameter length is " + strings.length);

				String stationId = strings[0];
				String licensePlate = strings[1];
				String timestamp = strings[2];

				System.out.println("timestamp = " + timestamp);
			}
		}
	}
}
