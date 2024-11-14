package com.springboot.ai_study;

import org.junit.jupiter.api.Test;
import org.springframework.ai.chat.model.ChatResponse;
import org.springframework.ai.chat.prompt.Prompt;
import org.springframework.ai.ollama.OllamaChatModel;
import org.springframework.ai.ollama.api.OllamaModel;
import org.springframework.ai.ollama.api.OllamaOptions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class AiStudyApplicationTests {

	@Autowired
	private OllamaChatModel chatModel;

	@Test
	void ollamaChat() {
		ChatResponse response = chatModel.call(
				new Prompt(
						"Spring Boot 适合做什么？",
						OllamaOptions.builder().withModel(OllamaModel.LLAMA3_1).withTemperature(0.4).build()
				)
		);
		System.out.println(response);
	}

}
