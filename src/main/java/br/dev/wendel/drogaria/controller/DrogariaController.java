package br.dev.wendel.drogaria.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("/drogaria")
public class DrogariaController {
	@RequestMapping("/ola")
	public String exibirMensagem() {
		return "Hello World!";
	}
}
