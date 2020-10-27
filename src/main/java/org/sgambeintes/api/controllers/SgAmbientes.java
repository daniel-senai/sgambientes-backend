package org.sgambeintes.api.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/sgambientes")
public class SgAmbientes {

	@GetMapping
	public String infoSgAmbientes() {
		return "SgAmbientes";
	}
}
