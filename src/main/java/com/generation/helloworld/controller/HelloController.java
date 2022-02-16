package com.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/helloworld")
public class HelloController {
	
	@GetMapping
	public String getHello() {
		return "hello world :)";
	}

	@GetMapping("/bsm")
	public String getHello2() {
		return "As habilidades e mentalidades utilizadas nessa atividade foram: atenção aos detalhes, persistência e orientação ao futuro.";
	}
	
	@GetMapping("/objetivos")
	public String getHello3() {
		return "Os meus objetivos de aprendizagem para a semana são: me aprofundar no conceito de arquitetura REST e entender como consigo aplicar nos meus projetos futuros.";
	}
}
