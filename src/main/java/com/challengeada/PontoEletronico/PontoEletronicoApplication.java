package com.challengeada.PontoEletronico;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Configuration
@SpringBootApplication

public class PontoEletronicoApplication {

	@RequestMapping("/v1")
	@ResponseBody
	String home() {
		return "Hello Word!";
	}

	public static void main(String[] args) {
		SpringApplication.run(PontoEletronicoApplication.class, args);
	}

}
