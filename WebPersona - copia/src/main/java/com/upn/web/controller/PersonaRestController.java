package com.upn.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.upn.web.model.Persona;
import com.upn.web.service.PersonaService;
import java.util.*;

@RestController  
public class PersonaRestController {
	
	@Autowired
	private PersonaService service;
	
	@GetMapping("/listar-rest")
	private List<Persona> listar(){
		return service.listar();
	}

}
