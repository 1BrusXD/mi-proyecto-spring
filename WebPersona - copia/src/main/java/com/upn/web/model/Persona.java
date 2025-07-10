package com.upn.web.model;

import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table (name ="persona")
public class Persona {
	
	@Id 
	@GeneratedValue(strategy =GenerationType.IDENTITY) 
	private int id;
	
	private String nombre;
	private String apellido;
	
	@Column(name = "fec_nac")
	@DateTimeFormat (pattern =  "yyyy-MM-dd")
	private LocalDate fec_nac;
	private double sueldo;
	public Persona() {
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public LocalDate getFec_nac() {
		return fec_nac;
	}
	public void setFec_nac(LocalDate fec_nac) {
		this.fec_nac = fec_nac;
	}
	public double getSueldo() {
		return sueldo;
	}
	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}
}
