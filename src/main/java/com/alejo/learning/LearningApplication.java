package com.alejo.learning;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class LearningApplication {

	public static void main(String[] args) {
		SpringApplication.run(LearningApplication.class, args);
	}

	@RestController
	class Resource {
		@RequestMapping(
			method = RequestMethod.GET
		)
		Message getMessage() {
			return new Message("Hello Worlds");
		}
	}

	class Message {
		private final String messasge;

		public Message(String messasge) {
			this.messasge = messasge;
		}

		public String getMessasge() {
			return messasge;
		}

		@Override
		public String toString() {
			return "Message{" +
					"messasge='" + messasge + '\'' +
					'}';
		}
	}
}
