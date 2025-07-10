package com.upn.web.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.upn.web.model.Persona;

@Repository
public interface PersonaRepository extends JpaRepository<Persona, Integer> {

	
}
