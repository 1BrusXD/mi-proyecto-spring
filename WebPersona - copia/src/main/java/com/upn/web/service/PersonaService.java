package com.upn.web.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.upn.web.model.Persona;
import com.upn.web.repository.PersonaRepository;

@Service
public class PersonaService {
	
	
	@Autowired
	private PersonaRepository repository;
	
	public List<Persona> listar(){
		List<Persona> lista = repository.findAll();
		return lista;
	}
	
	public Persona getPersona(int id) {
		Persona p= (Persona) repository.findById(id).orElse(null);
		return p;
	}
	
	public Persona savePersona(Persona p) {
		return repository.save(p);
	}
	
	public void deletePersona(int id) {	
		repository.deleteById(id);
	}

}
