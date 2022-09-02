package br.dev.wendel.drogaria.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/drogaria")
public class DrogariaController {
	@RequestMapping("/ola")
	public String exibirMensagem() {
		return "Olá Mundo!";
	}
}
