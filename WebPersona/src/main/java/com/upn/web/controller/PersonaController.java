package com.upn.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.upn.web.model.Persona;
import com.upn.web.service.PersonaService;

@Controller
public class PersonaController {

	@Autowired
	private PersonaService service;
	
	@GetMapping({"/","/index","/listar"})
	public String index(Model model) {
		
		List<Persona> lista = service.listar();
		model.addAttribute("lista_persona", lista);
		
		return "index";
	}
	
	@GetMapping("/ingresarPersona")
    public String ingresarPersona(Model model){

        model.addAttribute("persona", new Persona());

        return "form-persona";
    }
	
	@PostMapping("/save")
	public String save(@Validated Persona p) {
		service.savePersona(p);
		return "redirect:/listar";
	}
	
	@GetMapping("/edit/{id}")
	public String edit(Model model, @PathVariable("id") int id) {
		
		Persona p = service.getPersona(id);
		model.addAttribute("persona", p);
		return "form-persona";
	}
	
	@GetMapping("/delete/{id}")
	public String edit(@PathVariable("id") int id) {
		service.deletePersona(id);
		return "redirect:/listar";
	}
	
	
}
